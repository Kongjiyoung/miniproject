package com.many.miniproject1.user;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

public class UserRequest {
    @Data
    public static class JoinDTO{
        private MultipartFile profile; // 사용자가 업로드한 파일
        private String role;
        private String email;
        private String password;
        private String username;
        private String companyName;
        private String companyNum;
        private String address;
        private String birth;
        private String tel;

//        public User toEntity(){
//            return User
//        }
    }

    @Data
    public class SaveDTO {
        private Integer id;
    }

    @Data
    public static class CompanyUpdateDTO {
        private Integer id;
        private MultipartFile profile;
        private String companyName;
        private String companyNum;
        private String address;
        private String email;
        private String password;
        private String username;
        private String tel;
        private String newPassword;
    }
    @Data
    public static class PersonUpdateDTO {
        private MultipartFile profile;
        // private String profilePath;
        private String username;
        private String address;
        private String birth;
        private String tel;
        private String email;
        private String password;
        private String newPassword;

    }

    @Data
    public static class LoginDTO {
        private String role;
        private String email;
        private String password;
    }


}