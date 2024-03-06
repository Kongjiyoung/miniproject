package com.many.miniproject1.resume;

import com.many.miniproject1.skill.SkillRepository;
import com.many.miniproject1.user.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeRepository resumeRepository;
    private final SkillRepository skillRepository;
    private final HttpSession session;

    //개인 이력서 관리
    @GetMapping("/person/resume")
    public String personResumeForm(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        List<ResumeResponse.DetailDTO> resumeList = resumeRepository.findresume(sessionUser.getId());
        request.setAttribute("resumeList", resumeList);
        System.out.println(resumeList.size());

        ArrayList<ResumeResponse.DetailSkillDTO> resumeSkillList = new ArrayList<>();
        for (int i = 0; i < resumeList.size(); i++) {
            List<String> skills = skillRepository.findByResumeId(resumeList.get(i).getId());
            System.out.println(skills);
            ResumeResponse.DetailDTO resume = resumeList.get(i);
            System.out.println(resume);

            resumeSkillList.add(new ResumeResponse.DetailSkillDTO(resume, skills));
            System.out.println(resumeSkillList.get(i));
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

        ResumeResponse.DetailDTO responseDTO = resumeRepository.findById(id);
        System.out.println(responseDTO);
        request.setAttribute("resume", responseDTO);
        return "person/resumeDetail";
    }

    @GetMapping("/person/resume/saveForm")
    public String personSaveResumeForm() {

        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/person/loginForm";
        }

//        Resume resume = resumeRepository.findById(id);
//        List<String> skills = skillRepository.findByResumeId(id);
//        ResumeResponse.DetailDTO  detailDTO= new ResumeResponse.DetailDTO(new Resume());
//        detailDTO.setSkill(skills);
//
//        System.out.println(resume);
//        request.setAttribute("resume", resume);
        return "person/saveResumeForm";
    }

    @PostMapping("/person/resume/save")
    public String personSaveResume(ResumeRequest.SaveDTO requestDTO, HttpServletRequest request) {

        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/person/loginForm";
        }

        System.out.println(requestDTO);
        resumeRepository.save(requestDTO);
        return "redirect:/person/resume/{id}detail";
    }

    @GetMapping("/person/resume/detail/{id}/updateForm")
    public String personUpdateResumeForm(@PathVariable int id, HttpServletRequest request) {
//        Resume resume = resumeRepository.findById(id);
//        ResumeResponse.DetailDTO  detailDTO= new ResumeResponse.DetailDTO(new Resume());
//        request.setAttribute("resume", detailDTO);
        return "person/updateResumeForm";
    }

    @PostMapping("/person/resume/detail/{id}/update")
    public String personUpdateResume(@PathVariable int id, ResumeRequest.UpdateDTO requestDTO, HttpServletRequest request) {
        resumeRepository.update(id, requestDTO);
        request.setAttribute("resume", requestDTO);
        return "redirect:/person/resume/{id}/detail";
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