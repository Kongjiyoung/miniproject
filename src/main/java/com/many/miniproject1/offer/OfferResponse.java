package com.many.miniproject1.offer;

import lombok.Data;

import java.sql.Timestamp;

public class OfferResponse {

    @Data
    public static class OfferDTO{
        private Integer id;
        private Integer resumeId;
        private Integer postId;
        private Integer companyId;
        private Integer personId;
    }

    @Data
    public static class OfferBoardDTO{
        private Integer id;
        private Integer companyId;

        private String companyName;
        private Integer postId;
        private String title;
        private Timestamp createdAt;
    }
}
