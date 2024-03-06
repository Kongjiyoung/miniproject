package com.many.miniproject1.post;

import lombok.Data;

import java.util.List;

public class PostRequest {

    @Data
    public static class SaveDTO {
        private Integer id;
        private Integer companyId;
        private String title;
        private String career;
        private String pay;
        private String workCondition;
        private String workStartTime;
        private String workEndTime;
        private String deadline;
        private String task;
        private String profile;
        private String workingArea;
        private List<String> skill;
    }


    @Data
    public static class UpdateDTO {
        private Integer id;
        private Integer companyId;
        private String title;
        private String career;
        private String pay;
        private String workCondition;
        private String workStartTime;
        private String workEndTime;
        private String deadline;
        private String task;
        private String profile;
        private String workingArea;
        private List<String> skill;
    }
}