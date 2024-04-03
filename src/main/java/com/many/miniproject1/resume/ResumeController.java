package com.many.miniproject1.resume;

import com.many.miniproject1.skill.Skill;
import com.many.miniproject1.skill.SkillRepository;
import com.many.miniproject1.skill.SkillRequest;
import com.many.miniproject1.user.User;
import com.many.miniproject1.user.UserFileService;
import com.many.miniproject1.user.UserRepository;
import com.many.miniproject1.user.UserRequest;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.io.Serializable;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
@RequiredArgsConstructor
public class ResumeController{
    private final ResumeRepository resumeRepository;
    private final SkillRepository skillRepository;
    private final HttpSession session;
    private final UserFileService userFileService;
    private final UserRepository userRepository;

    //개인 이력서 관리
    @GetMapping("/person/resume")
    public String personResumeForm(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/person/loginForm";
        }
        List<ResumeResponse.DetailDTO> resumeList = resumeRepository.findresume(sessionUser.getId());

        ArrayList<ResumeResponse.DetailSkillDTO> resumeSkillList = new ArrayList<>();
        for (int i = 0; i < resumeList.size(); i++) {
            List<String> skills = skillRepository.findByResumeId(resumeList.get(i).getId());
            ResumeResponse.DetailDTO resume = resumeList.get(i);
            resumeSkillList.add(new ResumeResponse.DetailSkillDTO(resume, skills));
        }
        request.setAttribute("resumeSkillList", resumeSkillList);
        return "person/resumes";
    }

    @GetMapping("/person/resume/{id}/detail")
    public String personResumeDetailForm(@PathVariable int id, HttpServletRequest request) {
        System.out.println("id: " + id);

        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/person/loginForm";
        }

//        Resume resume = resumeRepository.findById(id);
//        List<String> skills = skillRepository.findByResumeId(id);
//        ResumeResponse.DetailDTO detailDTO = new ResumeResponse.DetailDTO(new Resume());
//        detailDTO.setSkill(skills);


//        List<ResumeResponse.DetailDTO> resumeList = resumeRepository.findResume(sessionUser.getId());
//        request.setAttribute("resumeList", resumeList);
//
//        ArrayList<ResumeResponse.DetailSkillDTO> resumeSkillList = new ArrayList<>();
//        for (int i = 0; i < resumeList.size(); i++) {
//            List<String> skills = skillRepository.findByResumeId(resumeList.get(i).getId());
//            System.out.println(skills);
//            ResumeResponse.DetailDTO resume = resumeList.get(i);
//            System.out.println(resume);
//
//            resumeSkillList.add(new ResumeResponse.DetailSkillDTO(resume, skills));
//            System.out.println(resumeSkillList.get(i));
//        }
//        request.setAttribute("resumeSkillList", resumeSkillList);

        ResumeResponse.DetailDTO responseDTO = resumeRepository.findById(id); //스킬빼고 담고온거
        List<String> skills = skillRepository.findByResumeId(responseDTO.getId());
        ResumeResponse.DetailSkillDTO resumeSkill = new ResumeResponse.DetailSkillDTO(responseDTO, skills);
        System.out.println(sessionUser);
        request.setAttribute("resume", resumeSkill);

        System.out.println(responseDTO);

        return "person/resumeDetail";
    }

    @GetMapping("/person/resume/saveForm")
    public String personSaveResumeForm(ResumeRequest.SaveDTO requestDTO, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/person/loginForm";
        }

        request.setAttribute("person", sessionUser);
        request.setAttribute("resume", requestDTO);
        return "person/saveResumeForm";
    }

    @PostMapping("/person/resume/save")
    public String personSaveResume(ResumeRequest.SaveDTO requestDTO, HttpServletRequest request, @RequestParam("skills") List<String> skills) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/person/loginForm";
        }


        System.out.println(requestDTO);

        // 이력서 업로드(이미지 포함)

        // 1. 데이터 전달 받고
        MultipartFile profile = requestDTO.getProfile(); // 변경된 변수명으로 수정

        // 2. 파일저장 위치 설정해서 파일을 저장 (UUID 붙여서 롤링)
        String profileFilename = UUID.randomUUID() + "_" + profile.getOriginalFilename(); // 변경된 변수명으로 수정

        Path profilePath = Paths.get("./images/" + profileFilename); // 변경된 변수명으로 수정

        try {
            Files.write(profilePath, profile.getBytes());

            // 3. DB에 저장 (title, realFileName)
//            resumeRepository.save(requestDTO, profileFilename);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 스킬
        List<SkillRequest.SaveDTO> skillDTOs = new ArrayList<>(); // 스킬을 저장할 DTO 리스트 생성


        // 스킬 저장
        List<ResumeResponse.skillDTO> skillDTOList=new ArrayList<>();

        int resumeId = resumeRepository.save(requestDTO, profileFilename);
        for(String skill:skills){
            ResumeResponse.skillDTO skillDTO=new ResumeResponse.skillDTO();
            skillDTO.setSkill(skill);
            skillDTO.setResumeId(resumeId);
            skillDTOList.add(skillDTO);
        }


        // 변환된 스킬 DTO 리스트를 사용하여 저장

        skillRepository.saveSkillsIntoResume(skillDTOList);
        request.setAttribute("resume", requestDTO);
        request.setAttribute("skills", skills);
        System.out.println(skills);

        return "redirect:/person/resume";
    }

    @GetMapping("/person/resume/detail/{id}/updateForm")
    public String personUpdateResumeForm(@PathVariable int id, HttpServletRequest request) {

        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/person/loginForm";
        }
        ResumeResponse.DetailDTO detailDTO = resumeRepository.findById(id);
//        ResumeResponse.DetailDTO detailDTO= new ResumeResponse.DetailDTO(new Resume());

        request.setAttribute("resume", detailDTO);
        return "person/updateResumeForm";
    }

    @PostMapping("/person/resume/{id}/detail/update")
    public String personUpdateResume(@PathVariable int id, ResumeRequest.UpdateDTO requestDTO, HttpServletRequest request, @RequestParam("skill") List<String> skills) {
        System.out.println("🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗🚗");
        System.out.println(requestDTO);

        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/person/loginForm";
        }

        // 공고 업로드(이미지 포함)

        // 1. 데이터 전달 받고
        MultipartFile profile = requestDTO.getProfile(); // 변경된 변수명으로 수정

        // 2. 파일저장 위치 설정해서 파일을 저장 (UUID 붙여서 롤링)
        String profileFilename = UUID.randomUUID() + "_" + profile.getOriginalFilename(); // 변경된 변수명으로 수정

        Path profilePath = Paths.get("./images/" + profileFilename); // 변경된 변수명으로 수정

        try {
            Files.write(profilePath, profile.getBytes());

            // 3. DB에 저장 (title, realFileName)
//            resumeRepository.save(requestDTO, profileFilename);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 스킬
        List<SkillRequest.SaveDTO> skillDTOs = new ArrayList<>(); // 스킬을 저장할 DTO 리스트 생성


        // 스킬 저장
        List<ResumeResponse.skillDTO> skillDTOList=new ArrayList<>();

//        int resumeId = resumeRepository.save(requestDTO, profileFilename);
        skillRepository.resetSkillsInPost(id);
        for(String skill:skills){
            ResumeResponse.skillDTO skillDTO=new ResumeResponse.skillDTO();
            skillDTO.setSkill(skill);
            skillDTO.setResumeId(id);
            skillDTOList.add(skillDTO);
        }
        System.out.println("skills:sdfasfdasdf"+skills);
        // 변환된 스킬 DTO 리스트를 사용하여 저장

        resumeRepository.update(id, requestDTO, profileFilename);
        skillRepository.saveSkillsIntoResume(skillDTOList);
//        request.setAttribute("resume", requestDTO);
//        request.setAttribute("skills", skills);
        System.out.println(skills);

        // 업데이트된 이력서 정보와 스킬 정보를 반환
        request.setAttribute("resume", requestDTO);
        request.setAttribute("skills", skills);
        return "redirect:/person/resume/" + id + "/detail";

    }

    @PostMapping("/person/resume/detail/{id}/delete")
    public String personDeletePost(@PathVariable int id, HttpServletRequest request) {
        resumeRepository.delete(id);
        return "redirect:/person/resume";
    }

//    //메인 구직 공고
//    @GetMapping("/resume")
//    public String resumeForm() {return "person/main";}
//
//    @GetMapping("/resume/detail/{id}")
//    public String resumeDetailForm(@PathVariable int id) {
//        return "person/resumeDetail";
//    }
//
//    //맞춤 공고 - 기업용
//    @GetMapping("/matching/resume")
//    public String matchingResumeForm() {return "company/matching";}
//
//    @GetMapping("/matching/resume/detail/{id}")
//    public String matchingResumeDetailForm(@PathVariable int id) {
//        return "person/resumeDetail";
//    }
}
