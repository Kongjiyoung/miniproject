package com.many.miniproject1.post;

import com.many.miniproject1.skill.SkillRepository;
import com.many.miniproject1.skill.SkillRequest;
import com.many.miniproject1.user.User;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class PostController {
    private final PostRepository postRepository;
    private final SkillRepository skillRepository;
    private final HttpSession session;

    //회사 공고 관리
    @GetMapping("/company/post")
    public String companyPosts(HttpServletRequest request) { // 이 페이지는 포스트들을 확인할 수 있는 페이지라 이름 변경했습니다.
        // 목적: 우리 회사에서 쓴 포스트들이 화면에 나와야 한다.(0)

        // 1. 로그인 하지 않은 유저 로그인의 길로 인도
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/company/loginForm";
        }

        // 2. 회사가 올린 공고들을 보여줌
        List<PostResponse.PostProfileDTO> postList = postRepository.findAllByCompanyId(sessionUser.getId());
        request.setAttribute("postList", postList);
        System.out.println(postList.getFirst());
        // 3. 스킬
//        ArrayList<PostResponse.DetailDTO> postSkillList = new ArrayList<>();
//        for (int i = 0; i < postList.size(); i++) {
//            List<String> skills = skillRepository.findByPostId(postList.get(i).getId());
//            System.out.println(skills);
//
//            Post post = (Post) postList.get(i);
//            System.out.println(post);
//
//            postSkillList.add(new PostResponse.DetailDTO(post, skills));
//            System.out.println(postSkillList.get(i));
//            request.setAttribute("postSkillList", postSkillList);
//        }

//        // (심화) 로그인을 한 회사의 아이디와 일치하는지 확인한 후 오류 메시지: 
//        // 로그인한 아이디와 포스트리스트의 컴퍼니아이디가 같으면 로그인한 아이디의 공고 포스트들을 보여준다.
        // (지금은 회사별 개인 페이지가 없는데 나중에 고쳐야 함)

//        if (sessionUser.getId().equals(postList.get(0).getCompanyId())) {
//            ArrayList<PostResponse.DetailDTO> postSkillList = new ArrayList<>();
//            for (int i = 0; i < postList.size(); i++) {
//                List<String> skills = skillRepository.findByPostId(postList.get(i).getId());
//                System.out.println(skills);
//
//                Post post = (Post) postList.get(i);
//                System.out.println(post);
//
//                postSkillList.add(new PostResponse.DetailDTO(post, skills));
//                System.out.println(postSkillList.get(i));
//                request.setAttribute("postSkillList", postSkillList);
//            }
//        } else {
//            return "error/403";
//        }

        return "company/posts";
    }

    @GetMapping("/company/post/detail/{id}") // 포스트 디테일 페이지 보기
    public String companyPostDetailForm(@PathVariable int id, HttpServletRequest request) {
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
        
        return "company/postDetail";
    }

    @GetMapping("/company/post/saveForm")
    public String companyPostForm(PostRequest.SaveDTO requestDTO, HttpServletRequest request) {
        // 목적: 공고를 등록하는 페이지를 불러온다.(0)
        // 1. 로그인 하지 않은 유저 로그인의 길로 인도
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/company/loginForm";
        }
        System.out.println(sessionUser);
        request.setAttribute("post", requestDTO);
        System.out.println(requestDTO);

        return "company/savePostForm";
    }

    //    @PostMapping("/company/post/save")
//    public String companySavePost(PostRequest.SaveDTO requestDTO, HttpServletRequest request, @RequestParam("skill") List<String> skills) {
//        // 목적: 공고를 저장하고 디테일 페이지를 보여준다.(0)
//        // 1. 로그인 하지 않은 유저 로그인의 길로 인도
//        User sessionUser = (User) session.getAttribute("sessionUser");
//        System.out.println(sessionUser);
//        //
//        if (sessionUser == null) {
//            return "redirect:/company/loginForm";
//        }
//
//        System.out.println(requestDTO);
//
//        for (String skill : skills) {
//            Skill skillEntity = new Skill();
//            skillEntity.setSkill((skill));
//            requestDTO.getSkill().add(skillEntity.getSkill());
//        }
//
//        skills = postRepository.save(requestDTO); // 세션유저 아이디 아이고 공고 아이디가 필요함
//
//        postRepository.save(requestDTO);
//        skillRepository.saveSkillsFromPost(skills, sessionUser.getId());
////        skillRepository.saveSkillsFromPost(PostRequest.SaveDTO requestDTO);
//
//        return "redirect:/company/post";
//    }
    @PostMapping("/company/post/save")
    public String companySavePost(PostRequest.SaveDTO requestDTO, HttpServletRequest request, @RequestParam("skill") List<String> skills) {
        // 목적: 공고를 저장하고 디테일 페이지를 보여준다.(0)
        // 1. 로그인 하지 않은 유저 로그인의 길로 인도
        User sessionUser = (User) session.getAttribute("sessionUser");
        System.out.println(sessionUser);
        //
        if (sessionUser == null) {
            return "redirect:/company/loginForm";
        }

        System.out.println(requestDTO);

        List<SkillRequest.SaveDTO> skillDTOs = new ArrayList<>(); // 스킬을 저장할 DTO 리스트 생성

        // 각 스킬을 SkillRequest.SaveDTO 형태로 변환하여 리스트에 추가
        for (String skill : skills) {
            SkillRequest.SaveDTO skillDTO = new SkillRequest.SaveDTO();
            skillDTO.setSkill(skill);
            skillDTO.setPostId(requestDTO.getId()); // 포스트 아이디 설정
            skillDTOs.add(skillDTO);
        }

        // 변환된 스킬 DTO 리스트를 사용하여 저장
        int postId = postRepository.save(requestDTO);
        skillRepository.saveSkillsFromPost(skillDTOs,postId);
        System.out.println(skills);
        request.setAttribute("post", requestDTO);
        request.setAttribute("skills", skills);
        return "redirect:/company/post";
    }

    @GetMapping("/company/post/detail/{id}/updateForm")
    public String companyUpdatePostForm(@PathVariable int id, HttpServletRequest request) {
        // 목적: 공고 업데이트 폼을 불러온다.(0)
        // 1. 로그인 하지 않은 유저 로그인의 길로 인도
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/company/loginForm";
        }

        PostResponse.DetailDTO detailDTO = postRepository.findById(id);
        //
        request.setAttribute("post", detailDTO);
        return "company/updatePostForm";
    }

    @PostMapping("/company/post/detail/{id}/update")
    public String companyUpdatePost(@PathVariable int id, PostRequest.UpdateDTO requestDTO, HttpServletRequest request) {
        // 목적: 업데이트폼에서 수정하기 누르면 그 디테일의 수정된 모습을 디테일페이지에서 볼 수 있게 바뀌기.(안즉)
        // 1. 로그인 하지 않은 유저 로그인의 길로 인도
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/company/loginForm";
        }

        postRepository.update(id, requestDTO);
        request.setAttribute("post", requestDTO);
        System.out.println(requestDTO);
        return "redirect:/company/post/detail/" + id;
    }

    @PostMapping("/company/post/detail/{id}/delete")
    public String companyDeletePost(@PathVariable int id, HttpServletRequest request) {
        // 1. 로그인 하지 않은 유저 로그인의 길로 인도
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/company/loginForm";
        }
        // 목적1: 삭제하기를 누르면 포스트가 삭제된 /company/posts로 이동하게 하기. 그런데 그것은 redirect:/company/post이다.
        postRepository.delete(id);
        return "redirect:/company/post";
    }
}