package com.many.miniproject1.offer;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

public class OfferRequest {
    @Data
    public class SaveDTO {
        private Integer id;
        private Integer resumeId;
        private Integer postId;
        private Integer postWriterId;
        private Integer resumeWriterId;
        private String title;
        private Date created_at;
        private String company_name;

    }

    @Data
    public static class UpdateDTO {
        private Integer id;
    }
}
