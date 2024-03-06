package com.many.miniproject1.apply;

import com.many.miniproject1.post.PostRepository;
import com.many.miniproject1.post.PostResponse;
import com.many.miniproject1.resume.ResumeRepository;
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
public class ApplyController {
    private final HttpSession session;
    private final ApplyRepository applyRepository;
    private final SkillRepository skillRepository;
    private final PostRepository postRepository;
    private final ResumeRepository resumeRepository;
    //기업에서 받은 이력서 관리

    @GetMapping("/company/resume")
    public String companyResume(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        System.out.println(sessionUser.getId());
        List<ApplyResponse.ApplyResumeDTO> resumeList = applyRepository.findResumePassList(sessionUser.getId());
        System.out.println(resumeList.size());

        ArrayList<ApplyResponse.ResumeIsPassDTO> resumeSkillList = new ArrayList<>();
        for (int i = 0; i < resumeList.size(); i++) {
            List<String> skills = skillRepository.findByResumeId(resumeList.get(i).getId());
            System.out.println(skills);
            ApplyResponse.ApplyResumeDTO resume = resumeList.get(i);
            System.out.println(resume);

            resumeSkillList.add(new ApplyResponse.ResumeIsPassDTO(resume, skills));
            System.out.println(resumeSkillList.get(i));
        }
        request.setAttribute("resumeSkillList", resumeSkillList);

        return "company/companyResumes";
    }

    @GetMapping("/company/resume/{id}/detail")
    public String companyResumeDetail(@PathVariable int id, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        ApplyResponse.ApplyResumeDTO resume = applyRepository.findResumePass(sessionUser.getId(),id);
        List<String> skills = skillRepository.findByResumeId(id);
        ApplyResponse.ResumeIsPassDTO resumeSkill=new ApplyResponse.ResumeIsPassDTO(resume, skills);
        request.setAttribute("resume", resumeSkill);
        return "company/mypageResumeDetail";
    }

    @PostMapping("/company/resume/{id}/detail/ispass")
    public String companyPass(@PathVariable int id, ApplyRequest.UpdateDTO request) {

        applyRepository.update(request, id);
        return "redirect:/company/resume/{id}/detail";
    }

    //이력서 현황
    @GetMapping("/person/apply")
    public String personApply(HttpServletRequest request) {
        User sessionUser=(User) session.getAttribute("sessionUser");

        List<ApplyResponse.ApplyPostDTO> postList=applyRepository.findPostPass(sessionUser.getId());
        System.out.println("size="+postList.size());

        ArrayList<ApplyResponse.PostIsPassDTO> postSkillList=new ArrayList<>();
        for(int i =0 ; i<postList.size(); i++){
            System.out.println("size="+postList.size());
            System.out.println(postList.get(i));
            List<String> skills=skillRepository.findByPostId(postList.get(i).getId());
            System.out.println("==============="+skills);
            ApplyResponse.ApplyPostDTO post=postList.get(i);
            System.out.println("==============="+post);
            postSkillList.add(new ApplyResponse.PostIsPassDTO(post,skills));
            System.out.println(postSkillList.get(i));
        }
        request.setAttribute("sessionuser", sessionUser);
        request.setAttribute("postSkillList", postSkillList);
        return "person/applies";
    }
    @GetMapping("/person/apply/{id}/detail")
    public String personApply(@PathVariable int id, HttpServletRequest request) {
        // 목적: 포스트 디테일 페이지를 불러온다.(0)
        // 1. 로그인 하지 않은 유저 로그인의 길로 인도
        User sessionUser = (User) session.getAttribute("sessionUser");
        System.out.println(sessionUser);
        if (sessionUser == null) {
            return "redirect:/company/loginForm";
        }

        // 2. id에 맞는 게시글을 본다.(이미 올라와 있는 것은 됨, 그러나 새로 쓴 글은 을
        PostResponse.DetailDTO responseDTO = postRepository.findById(id);
        request.setAttribute("post", responseDTO);

        // 스킬 리스트 만들어서 돌리기
        return "person/mypagePostDetail";
    }

//    //메인 채용 공고
//    @PostMapping("/post/detail/{id}/apply")
//    public String personPostApply(@PathVariable int id) {
//        return "redirect:/post/detail/"+id;
//    }
//
//    //맞춤 공고 - 개인용
//    @PostMapping("/matching/post/detail/{id}/apply")
//    public String matchingPersonPostApply(@PathVariable int id) {
//        return "matching/post/detail/"+id;
//    }
}
