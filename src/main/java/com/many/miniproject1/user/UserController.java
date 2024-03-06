package com.many.miniproject1.user;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    private final HttpSession session;

    // 회사 회원가입
    @GetMapping("/company/joinForm")
    public String companyJoinForm() {
        return "company/joinForm";
    }

    @PostMapping("/company/join")
    public String companyJoin(UserRequest.JoinDTO requestDTO) {
        System.out.println(requestDTO);
        userRepository.companySave(requestDTO);
        return "redirect:/company/loginForm";
    }

    // 회사 로그인
    @GetMapping("/company/loginForm")
    public String companyLoginForm() {
        return "company/loginForm";
    }

    @PostMapping("/company/login")
    public String companyLogin(UserRequest.LoginDTO requestDTO) {
        System.out.println(requestDTO);
//        if (requestDTO.getEmail().length() < 3) {
//            return "error/400";
//        }

        User user = userRepository.findByEmailAndPassword(requestDTO);
        if (user == null){
            return "/company/loginForm";
        } else if (!user.getRole().equals("company")) {
            return "error/404";
        } else { // 조회 됐음 (인증됨)
            Boolean isCompany;
            isCompany = true;
            session.setAttribute("sessionUser", user);
            session.setAttribute("isCompany", isCompany);
        }

        return "redirect:/company/main";
    }


    // 개인 로그인 회원가입
    @GetMapping("/person/joinForm")
    public String personJoinForm() {
        return "person/joinForm";
    }

    @PostMapping("/person/join")
    public String personJoin(UserRequest.JoinDTO requestDTO) {
        System.out.println(requestDTO);
        userRepository.personSave(requestDTO);
        return "redirect:/person/loginForm";
    }

    // 개인 로그인 회원가입
    @GetMapping("/person/loginForm")
    public String personLoginForm() {
        return "person/loginForm";
    }

    @PostMapping("/person/login")
    public String personLogin(UserRequest.LoginDTO requestDTO) {
        System.out.println(requestDTO);
//        if (requestDTO.getEmail().length() < 3) {
//            return "error/400";
//        }

        User user = userRepository.findByEmailAndPassword(requestDTO);

        if (user == null){
            return "/person/loginForm";
        } else if (!user.getRole().equals("person")) {
            return "error/404";
        } else { // 조회 됐음 (인증됨)
            Boolean isPerson;
            isPerson = true;
            session.setAttribute("sessionUser", user);
            session.setAttribute("isPerson", isPerson);
        }
        return "redirect:/person/main";
    }



    //기업 개인 로그아웃
    @GetMapping("/logout")
    public String logout() {
        session.invalidate();
        return "redirect:/";
    }


    //회사 정보 및 수정
    //회사 정보 수정
    @GetMapping("/company/info")

    public String companyInfo(HttpServletRequest request) {

        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            // sessionUser가 null인 경우, 로그인 페이지로 리다이렉트
            return "/company/loginForm";
        }

        request.setAttribute("user",sessionUser);

        return "company/companyInfo";
    }
    @PostMapping("/changePassword")
    public ResponseEntity<?> changePassword(@RequestBody UserRequest.PasswordChangeDTO request) {
        UserRequest.PasswordChangeDTO newPassword = request;
        System.out.println(newPassword);
        boolean success = changePasswordInDatabase(newPassword);
        return ResponseEntity.ok(new UserResponse.PasswordChangeDTO(success));
    }
    private boolean changePasswordInDatabase(UserRequest.PasswordChangeDTO request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        User user = userRepository.findById(sessionUser.getId());

        if (user == null) {
            return false;
        }
        // 변경된 사용자 정보를 저장합니다.
        userRepository.passwordUpdate(request, sessionUser.getId());

        return true;
    }

    // 수정완료/취소 버튼 누르면 자원을 찾을 수 없음이라 나옴. 그것 수정하고 주석 지워주세요.
    @GetMapping("/company/info/updateForm")
    public String companyInfoUpdateForm(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            // sessionUser가 null인 경우, 로그인 페이지로 리다이렉트
            return "redirect:/company/loginForm";
        }
//        User user = userRepository.findById(id);


        request.setAttribute("user",sessionUser);
        return "company/updateInfoForm";
    }

//   여기에도 머스치에도 post를 적었는데 get이 나오는 이유가 무엇일까요.
    @PostMapping("/company/info/update")
    public String companyInfoUpdate(UserRequest.CompanyUpdateDTO requestDTO, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/loginForm";
        }

        userRepository.companyUpdate(requestDTO,sessionUser.getId());
        request.setAttribute("user", requestDTO);
        return "redirect:/company/info";
    }

    //개인 프로필 정보 및 수정
    @GetMapping("/person/info")
    public String personal(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            // sessionUser가 null인 경우, 로그인 페이지로 리다이렉트
            return "/person/loginForm";
        }
        request.setAttribute("user",sessionUser);

        return "person/personalInfo";
    }

    @GetMapping("/person/info/updateForm")
    public String personInfoInfoUpdateForm(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            // sessionUser가 null인 경우, 로그인 페이지로 리다이렉트
            return "person/loginForm";
        }

        request.setAttribute("user",sessionUser);
        return "person/updatePersonalForm";
    }

    @PostMapping("/person/info/update")
    public String personInfoUpdate(UserRequest.PersonUpdateDTO requestDTO, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/loginForm";
        }
        userRepository.personUpdate(requestDTO,sessionUser.getId());
        request.setAttribute("user", requestDTO);
        return "redirect:/person/info";
    }


}