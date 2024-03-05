package com.many.miniproject1.offer;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Table(name = "offer_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Offer {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 전략
    private Integer id;
    private Integer resumeId;
    private Integer postId;
    private Integer postWriterId;
    private Integer resumeWriterId;
    private String title;
    private String companyName;
//    private String content;
    private Date createdAt;
}