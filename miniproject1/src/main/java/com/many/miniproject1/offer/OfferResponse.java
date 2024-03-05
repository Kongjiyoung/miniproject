package com.many.miniproject1.offer;

import lombok.Data;

public class OfferResponse {

    @Data
    public static class  OfferDTO{
        private Integer id;
        private Integer resumeId;
        private Integer postId;
        private Integer postWriterId;
        private Integer resumeWriterId;
        private String title;

    }
}
