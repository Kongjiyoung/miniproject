package com.many.miniproject1.resume;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

public class ResumeRequest {

    @Data
    public static class SaveDTO {
        private Integer id;
        private Integer personId;
        private String title;
        private String profile;
        private String username;
        private String birth;
        private String tel;
        private String address;
        private String email;
        private String portfolio;
        private String introduce;
        private String career;
        private String simpleIntroduce;
        private List<String> skill;
        private Timestamp created_at;
    }

    @Data
    public static class UpdateDTO {
        private Integer id;
    }
}