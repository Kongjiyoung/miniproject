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
        List<Resume> resumeList= resumeRepository.findAll();
        System.out.println(resumeList.size());

        ArrayList<ResumeResponse.resumeDTO> resumeSkillList=new ArrayList<>();
        for (int i = 0; i < resumeList.size(); i++) {
            List<String> skills=skillRepository.findByResumeId(resumeList.get(i).getId());
            System.out.println(skills);
            Resume resume=(Resume)resumeList.get(i);
            System.out.println(resume);

            resumeSkillList.add(new ResumeResponse.resumeDTO(resume,skills));
            System.out.println(resumeSkillList.get(i));
        }

        request.setAttribute("resumeList", resumeList);
        return "person/resumes";
    }

    @GetMapping("/person/resume/detail/{id}")
    public String personResumeDetailForm(@PathVariable int id, HttpServletRequest request) {
        System.out.println("id: "+id);

        ResumeResponse.DetailDTO detailDTO = resumeRepository.findById(id);
        List<String> skills = skillRepository.findByResumeId(id);

        detailDTO.setSkill(skills);

        request.setAttribute("resume", detailDTO);
        return "person/resumeDetail";
    }

    @GetMapping("/person/resume/detail/{id}/saveForm")
    public String personSaveResumeForm(@PathVariable int id, HttpServletRequest request) {
        System.out.println("id: "+id);

        ResumeResponse.DetailDTO detailDTO = resumeRepository.findById(id);
        List<String> skills = skillRepository.findByResumeId(id);

        detailDTO.setSkill(skills);

        request.setAttribute("resume", detailDTO);
        return "person/saveResumeForm";
    }

    @PostMapping("/person/resume/detail/{id}/save")
    public String personSaveResume(ResumeRequest.SaveDTO requestDTO, HttpServletRequest request) {

        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/person/loginForm";
        }
        resumeRepository.save(requestDTO, sessionUser.getId());
        return "redirect:/person/resume/detail/{id}";
    }

    @GetMapping("/person/resume/detail/{id}/updateForm")
    public String personUpdateResumeForm(@PathVariable int id) {
        return "person/updateResumeForm";
    }

    @PostMapping("/person/resume/detail/{id}/update")
    public String personUpdateResume(@PathVariable int id) {
        return "redirect:/person/resume/detail/{id}";
    }

    @PostMapping("/person/resume/detail/{id}/delete")
    public String personDeletePost(@PathVariable int id) {
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