--더미데이터에 들어가 있는 post 다 지우기
-- role   1: 개인, 2: 회사
--개인정보 입력
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'captain_kong@nate.com', '1234', 'captain_kong', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'mylove_lsh@nate.com', '1234', 'lsh', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'hahaha@nate.com', '1234', 'hahaha', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'hana@nate.com', '1234', 'hana', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'zusim@nate.com', '1234', 'zusim', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values ('person', 'ssar@nate.com', '1234', 'ssar', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'ryu@nate.com', '1234', 'ryu', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'nomad@nate.com', '1234', 'nomad', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'park_yun@nate.com', '1234', 'park_yun', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'pretty_sjm@nate.com', '1234', 'pretty_sjm ', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'jake@nate.com', '1234', 'jake', '010-1234-5678 ', '사진URL', now());
insert into user_tb(role, email, password, username, tel, profile, created_at)
values (1, 'harry@nate.com', '1234', 'harry', '010-1234-5678 ', '사진URL', now());

--회사정보 입력
insert into user_tb(role, email, password, username, tel, company_name, company_address, company_num, profile,
                    created_at)
values (2, 'sk_cnc@sk.com', '1234', 'sk_HR', '010-1234-5678 ', 'SK(주) C&C', '경기 성남시 분당구 성남대로343번길 9 에스케이유타워',
        '123-456-78910', '사진URL', now());
insert into user_tb(role, email, password, username, tel, company_name, company_address, company_num, profile,
                    created_at)
values (2, 'shinhancard@shinhan.com', '1234', 'shinhan_HR', '010-1234-5678', 'shinhancard', '서울 중구 을지로 100 A동',
        '123-456-78910', '사진URL', now());
insert into user_tb(role, email, password, username, tel, company_name, company_address, company_num, profile,
                    created_at)
values (2, 'nhn_kcp@nhn.com', '1234', 'nhn_HR', '010-1234-5678', 'NHN KCP', '서울 구로구 디지털로26길 72 (구로동, NHN KCP)',
        '123-456-78910', '사진URL', now());
insert into user_tb(role, email, password, username, tel, company_name, company_address, company_num, profile,
                    created_at)
values (2, 'inflearn@inflearn.com', '1234', 'inflearn_HR', '010-1234-5678', '인프랩(인프런)',
        '경기 성남시 분당구 대왕판교로 660 1A 동 4층 405호', '123-456-78910', '사진URL', now());
insert into user_tb(role, email, password, username, tel, company_name, company_address, company_num, profile,
                    created_at)
values (2, 'humanscape@nate.com', '1234', 'humanscape_HR', '010-1234-5678', '휴먼스케이프', '서울 강남구 봉은사로86길 6 레베쌍트빌딩 6층',
        '123-456-78910', '사진URL', now());
insert into user_tb(role, email, password, username, tel, company_name, company_address, company_num, profile,
                    created_at)
values ('company', 'soomgo@soomgo.com', '1234', 'soomgo_HR', '010-1234-5678', '브레이브모바일 (숨고)',
        '서울 강남구 테헤란로 415 L7 강남타워 5층',
        '123-456-78910', '사진URL', now());
insert into user_tb(role, email, password, username, tel, company_name, company_address, company_num, profile,
                    created_at)
values (2, 'seedn@seedn.com', '1234', 'seedn_HR', '010-1234-5678', '씨드앤', '서울 성동구 왕십리로 115 헤이그라운드 서울숲점 605호',
        '123-456-78910', '사진URL', now());
insert into user_tb(role, email, password, username, tel, company_name, company_address, company_num, profile,
                    created_at)
values (2, 'pickleplus@pickle.com', '1234', 'pickleplus_HR', '010-1234-5678 ', '주식회사 피클플러스', '서울 중구 한강대로 416 서울스퀘어',
        '123-456-78910', '사진URL', now());
insert into user_tb(role, email, password, username, tel, company_name, company_address, company_num, profile,
                    created_at)
values (2, 'wadiz@wadiz.com', '1234', 'wadiz_HR', '010-1234-5678 ', '와디즈', '경기 성남시 분당구 판교로 242 A동 4층 와디즈',
        '123-456-78910', '사진URL', now());


--이력서정보 입력
insert into resume_tb(person_id, title, profile, username, birth, tel, address, email, portfolio, introduce, career,
                      simple_introduce, created_at)
values (1, '백엔드 개발자', '/images/person01.png', '공지영', '19991012', '010-1234-5678', '창원시 진해구', 'ssar@nate.com',
        'http://qmfmqfqmf',
        '복잡한 문제를 구조화하고 추상화해 단순하게 풀어내는 것을 좋아합니다.
꾸준한 공부를 통해 문제를 오랫동안 끊임없이 개선하는 것을 좋아합니다.
어려운 지식을 저만의 언어로 쉽게 풀어내는 것을 좋아합니다. 많은 사람에게 지식을 전파할 수 있는 사람이 되기를 원합니다.', '1년 근무', '꾸준히 공부하는 개발자입니다', now());
insert into resume_tb(person_id, title, profile, username, birth, tel, address, email, portfolio, introduce, career,
                      simple_introduce, created_at)
values (1, '백엔드 개발자, 장현정', '/images/person02.png', '장현정', '19900524', '010-1222-2222', '부산시 부산진구', 'love@nate.com',
        'http://dffdfddf',
        '문제를 찾아 해결하는 것에 즐거움을 느낍니다. best practice를 찾아 적용하려고 노력합니다.
프로덕션 서비스를 설계, 개발, 운영한 경험이 있으며 확장성과 유지 보수성이 높은 구조와 패턴을 위해 언제나 고민하고 있습니다.', '3년 근무', '좋은 개발자가 되려고 노력하고 있습니다', now());


--채용공고 입력
insert into post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task,
                    profile, working_area, created_at)
values (1, '데이터 분석가', '
미들 (4~8년)', '회사 내규에 따름', '처우는 채용 전형 진행 후 합격자에 대해 개인 별 협의 예정', '09:00', '18:00', '채용 시 마감',
        '데이터 관리, 분석, 시각화, 모델링을 통해 데이터로부터 정보를 추출하고 인사이트를 도출합니다.', '/images/company4.png', '경기 성남시 분당구', now());


insert into post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task,
                    profile, working_area, created_at)
values (1, 'React Native 개발자 (경력 1년 이상)', '
주니어 (1~3년)', '회사 내규에 따름', '처우는 채용 전형 진행 후 합격자에 대해 개인 별 협의 예정', '09:00', '18:00', '채용 시 마감',
        'TypeScript, React Native 를 기반으로 Android / iOS 애플리케이션을 개발하고 배포합니다.', '/images/company4.png', '경기 성남시 분당구',
        now());
insert into post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task,
                    profile, working_area, created_at)
values (1, '[인턴] 프론트엔드 개발자 (JavaScript)', '
인턴', '회사 내규에 따름', '처우는 채용 전형 진행 후 합격자에 대해 개인 별 협의 예정', '09:00', '18:00', '채용 시 마감',
        'VanillaJS (ES6) 를 기반으로 프론트엔드 기능을 개발하고 배포합니다.', '/images/company4.png', '경기 성남시 분당구', now());



-- entity수정 career데이터 varchar로 고치기
--스킬
--이력서에서
insert into skill_tb(skill, resume_id, role)
values ('JAVA', 1, 1);
insert into skill_tb(skill, resume_id, role)
values ('JAVA', 2, 1);
insert into skill_tb(skill, resume_id, role)
values ('C', 1, 1);
insert into skill_tb(skill, resume_id, role)
values ('C', 2, 1);


--공고에서
insert into skill_tb(skill, post_id, role)
values ('JAVA', 1, 1);
insert into skill_tb(skill, post_id, role)
values ('JAVA', 2, 1);
insert into skill_tb(skill, post_id, role)
values ('JAVA', 3, 1);


--지원
insert into apply_tb(resume_id, post_id, post_writer_id, resume_writer_id, is_pass)
values (1, 1, 2, 1, '합격');


--제안
--offer_tb content 삭제, 더미 추가
INSERT INTO offer_tb(resume_id, post_id, post_writer_id, resume_writer_id, title, created_at)
VALUES (1, 1, 2, 1, '양승호씨?', now());
INSERT INTO offer_tb(resume_id, post_id, post_writer_id, resume_writer_id, title, created_at)
VALUES (1, 1, 2, 2, '우리회사와', now());
INSERT INTO offer_tb(resume_id, post_id, post_writer_id, resume_writer_id, title, created_at)
VALUES (1, 1, 2, 3, '돈 많이줄게', now());



--ispass varchar타입에서 int로 바꾸기
--스크랩
--회사 이력서스크랩
insert into scrap_tb(resume_id, post_writer_id, created_at)
values (1, 2, now());


--개인 채용공고스크랩
insert into scrap_tb(post_id, resume_writer_id, created_at)
values (1, 1, now());

