package com.many.miniproject1.resume;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Table(name = "resume_tb")
@Data
@Entity // 테이블 생성하기 위해 필요한 어노테이션
public class Resume {
    @Id // PK 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY) // auto_increment 전략
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
    private Timestamp createdAt;
}