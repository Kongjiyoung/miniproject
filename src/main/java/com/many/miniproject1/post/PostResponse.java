package com.many.miniproject1.post;

import lombok.Data;

import java.util.List;

public class PostResponse {
    @Data
    public static class DetailDTO{
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
        private List<String> skill;
        private String workingArea;

        public DetailDTO(Post post, List<String> skill) {
            this.id = post.getId();
            this.companyId = post.getId();
            this.title = post.getTitle();
            this.career = post.getCareer();
            this.pay = post.getPay();
            this.workCondition = post.getWorkCondition();
            this.workStartTime = post.getWorkStartTime();
            this.workEndTime = post.getWorkEndTime();
            this.deadline = post.getDeadline();
            this.task = post.getTask();
            this.profile = post.getProfile();
            this.skill = skill;
            this.workingArea = post.getWorkingArea();
        }

        // 이거 문제생기면 생성자 안에 뭐 넣으면 됨
        public DetailDTO() {
            
        }
    }

    @Data
    public static class UpdateDTO{
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
        private List<String> skills; // 기존 스킬을 삭제하고, 인서트하기
        private String workingArea;
    }

    @Data
    public static class PostProfileDTO {
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
        private String profile; // 얘가 다른 애
        private List<String> skill;
        private String workingArea;
    }
}
