package com.many.miniproject1.skill;

import lombok.Data;

public class SkillRequest {
    @Data
    public static class SaveDTO {
        private Integer id;
        private String skill;
        private Integer resumeId;
        private Integer postId; // null 허용 되어야 한다
    }
}
