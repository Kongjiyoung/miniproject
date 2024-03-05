package com.many.miniproject1.offer;

import lombok.Data;

import java.sql.Date;
import java.sql.Timestamp;

public class OfferRequest {
    @Data
    public static class SaveDTO {
        private Integer id;
        private Integer resumeId;
        private Integer postId;
        private Integer companyId;
        private Integer personId;
        // DTO에서 날짜를 받을 필요가 없다.
    }

    @Data
    public static class UpdateDTO {
        private Integer id;
    }
}
