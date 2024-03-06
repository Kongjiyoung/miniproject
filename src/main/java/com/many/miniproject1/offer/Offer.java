package com.many.miniproject1.offer;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Table(name = "offer_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Offer {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 전략
    private Integer id;         // 제안 ID
    private Integer resumeId;   // 이력서 ID
    private Integer postId;     // 공고 ID

    @Column(name = "company_id")
    private Integer companyId;  // 회사 ID

    private Integer personId;   // 구직자 ID
    //    private String content;
    private Timestamp createdAt;
}