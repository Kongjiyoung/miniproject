package com.many.miniproject1.apply;

import lombok.Data;


public class ApplyRequest {
    @Data
    public static class SaveDTO {
        private Integer resumeId;
        private Integer postId; // 채용공고 아이디
        private Integer companyId; // 채용공고 작성자 아이디
        private Integer personId; // 이력서 작성자 아이디
        private String isPass; // 불합격, 합격, 검토중

    }

    @Data
    public static class UpdateDTO {
        private String isPass;
    }
}