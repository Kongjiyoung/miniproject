package com.many.miniproject1.apply;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Table(name = "apply_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Apply { // 지원 테이블
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 전략
    private Integer id;
    private Integer resumeId;
    private Integer postId; // 채용공고 아이디
    private Integer companyId; // 채용공고 작성자 아이디
    private Integer personId; // 이력서 작성자 아이디
    private String isPass; // 불합격, 합격, 검토중
    private Timestamp createdAt;
}
