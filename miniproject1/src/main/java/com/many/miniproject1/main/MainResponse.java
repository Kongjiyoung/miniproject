package com.many.miniproject1.main;

import com.many.miniproject1.post.Post;
import com.many.miniproject1.resume.Resume;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

public class MainResponse {
    @Data
    public static class resumeDTO {
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
        private Timestamp createdAt;

        public resumeDTO(Resume resume, List<String> skill) {
            this.id = resume.getId();
            this.personId = resume.getPersonId();
            this.title =  resume.getTitle();
            this.profile = resume.getProfile();
            this.username = resume.getUsername();
            this.birth = resume.getBirth();
            this.tel = resume.getTel();
            this.address = resume.getAddress();
            this.email = resume.getEmail();
            this.portfolio = resume.getPortfolio();
            this.introduce = resume.getIntroduce();
            this.career = resume.getCareer();
            this.simpleIntroduce = resume.getSimpleIntroduce();
            this.createdAt = resume.getCreatedAt();

            this.skill=skill;
        }
    }

    @Data
    public static class postDTO {
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

        private Timestamp createdAt;


        public postDTO(Post post, List<String> skills) {
            this.id = post.getId();
            this.companyId =  post.getCompanyId();
            this.title =  post.getTitle();
            this.career =  post.getCareer();
            this.pay =  post.getPay();
            this.workCondition =  post.getWorkCondition();
            this.workStartTime =  post.getWorkStartTime();
            this.workEndTime =  post.getWorkEndTime();
            this.deadline =  post.getDeadline();
            this.task =  post.getTask();
            this.profile =  post.getProfile();
            this.workingArea =  post.getWorkingArea();
            this.skill = skills;
            this.createdAt =  post.getCreatedAt();
        }
    }

}
