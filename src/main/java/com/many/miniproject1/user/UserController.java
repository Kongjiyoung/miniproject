package com.many.miniproject1.user;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.UUID;


@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserRepository userRepository;
    private final HttpSession session;
    private final Environment env;
    private final UserFileService userFileService;

    // 회사 회원가입
    @GetMapping("/company/joinForm")
    public String companyJoinForm() {
        return "company/joinForm";
    }

    @PostMapping("/company/join")
    public String companyJoin(UserRequest.JoinDTO requestDTO, HttpServletRequest request) {

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

        userRepository.companySave(requestDTO, profileFilename);
        System.out.println(requestDTO);
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
        if (user == null) {
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
        userRepository.personSave(requestDTO, profileFilename);
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

        if (user == null) {
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
            return "/company/loginForm";
        }
        User user = userRepository.findById(sessionUser.getId());
        request.setAttribute("user", user);
        return "company/companyInfo";
    }

    @GetMapping("/company/info/updateForm")
    public String companyInfoUpdateForm(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        User user = userRepository.findById(sessionUser.getId());
        request.setAttribute("user", user);
        return "company/updateInfoForm";
    }

    @PostMapping("/company/info/update")
    public String companyInfoUpdate(MultipartFile profile, String companyName, String address, String password, String username, String tel, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        // 프로필 저장 파일로 따로 뺄 생각 생각 좀 해봄
        MultipartFile profile1 = profile;
        String profileFilename = UUID.randomUUID() + "_" + profile1.getOriginalFilename();
        Path profilePath = Paths.get("./images/" + profileFilename);
        try {
            Files.write(profilePath, profile.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        User user = userRepository.findById(sessionUser.getId());
        request.setAttribute("user", user);


        userRepository.companyUpdate(sessionUser.getId(), profileFilename, companyName, address, password, username, tel);

        //System.out.println(requestDTO);
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
        User user = userRepository.findById(sessionUser.getId());

        request.setAttribute("user", user);

        return "person/personalInfo";
    }

    @GetMapping("/person/info/updateForm")
    public String personInfoInfoUpdateForm(HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");

        if (sessionUser == null) {
            // sessionUser가 null인 경우, 로그인 페이지로 리다이렉트
            return "person/loginForm";
        }
        User user = userRepository.findById(sessionUser.getId());
        request.setAttribute("user", user);
        return "person/updatePersonalForm";
    }

    @PostMapping("/person/info/update")
    public String personInfoUpdate(UserRequest.PersonUpdateDTO requestDTO, HttpServletRequest request) {
        User sessionUser = (User) session.getAttribute("sessionUser");
        if (sessionUser == null) {
            return "redirect:/person/loginForm";
        }

        // 프로필 저장
        MultipartFile profile = requestDTO.getProfile();
        String profileFilename = UUID.randomUUID() + "_" + profile.getOriginalFilename();
        Path profilePath = Paths.get("./images/" + profileFilename);
        try {
            Files.write(profilePath, profile.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        User user = userRepository.findById(sessionUser.getId());
        request.setAttribute("user", user);

        // 새 비밀번호가 비어있으면 기존 비밀번호를 사용하도록 설정
        if (StringUtils.isEmpty(requestDTO.getNewPassword())) {
            requestDTO.setNewPassword(user.getPassword());
        }

        // requestDTO.setProfilePath(profilePath);
        userRepository.personUpdate(requestDTO, sessionUser.getId(), profileFilename);

        System.out.println(requestDTO);
        return "redirect:/person/info";
    }
}