package com.many.miniproject1.user;

import lombok.Data;

public class UserResponse {
    @Data
    public static class DetailDTO {
        private Integer id;
        private String role;
        private String email;
        private String password;
        private String username;
        private String tel;
        private String companyName;
        private String companyAddress;
        private String companyNum;
        private String profile;
        private Boolean infoOwner;

    }
}
