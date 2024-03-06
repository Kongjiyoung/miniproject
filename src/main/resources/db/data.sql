--더미데이터에 들어가 있는 post 다 지우기
-- role   1: 개인, 2: 회사
--개인정보 입력
insert into user_tb(role, birth, email, password, username, tel, address, profile, created_at)
values ('person', '19980504','captain_kong@nate.com', '1234', 'captain_kong', '010-1234-5678 ', '부산광역시', '사진URL', now());
insert into user_tb(role, birth,email, password, username, tel,  address,profile, created_at)
values ('person', '19970924','mylove_lsh@nate.com', '1234', 'lsh', '010-1234-5678 ', '부산광역시','사진URL', now());
insert into user_tb(role, birth,email, password, username, tel,  address,profile, created_at)
values ('person', '20000709','hahaha@nate.com', '1234', 'hahaha', '010-1234-5678 ', '부산광역시','사진URL', now());
insert into user_tb(role, birth,email, password, username, tel,  address,profile, created_at)
values ('person', '19930114','hana@nate.com', '1234', 'hana', '010-1234-5678 ', '부산광역시','사진URL', now());
insert into user_tb(role, birth,email, password, username, tel,  address,profile, created_at)
values ('person', '19990230','zusim@nate.com', '1234', 'zusim', '010-1234-5678 ','부산광역시', '사진URL', now());
insert into user_tb(role, birth,email, password, username, tel, address, profile, created_at)
values ('person', '20020422','ssar@nate.com', '1234', 'ssar', '010-1234-5678 ','부산광역시', '사진URL', now());
insert into user_tb(role, birth,email, password, username, tel,  address,profile, created_at)
values ('person','19930521', 'ryu@nate.com', '1234', 'ryu', '010-1234-5678 ', '부산광역시','사진URL', now());
insert into user_tb(role, birth,email, password, username, tel,  address,profile, created_at)
values ('person', '19950417','nomad@nate.com', '1234', 'nomad', '010-1234-5678 ', '부산광역시','사진URL', now());
insert into user_tb(role, birth,email, password, username, tel, address, profile, created_at)
values ('person', '20011212','park_yun@nate.com', '1234', 'park_yun', '010-1234-5678 ','부산광역시', '사진URL', now());
insert into user_tb(role, birth,email, password, username, tel, address, profile, created_at)
values ('person','19980815', 'pretty_sjm@nate.com', '1234', 'pretty_sjm ', '010-1234-5678 ', '부산광역시','사진URL', now());
insert into user_tb(role, birth,email, password, username, tel, address,profile, created_at)
values ('person','19881130', 'jake@nate.com', '1234', 'jake', '010-1234-5678 ', '사진URL','부산광역시', now());
insert into user_tb(role, birth,email, password, username, tel, address, profile, created_at)
values ('person', '19900302','harry@nate.com', '1234', 'harry', '010-1234-5678 ', '부산광역시', '사진URL', now());

--회사정보 입력
insert into user_tb(role, email, password, username, tel, company_name, address, company_num, profile,
                    created_at)
values ('company', 'sk_cnc@sk.com', '1234', 'sk_HR', '010-1234-5678 ', 'SK(주) C&C', '경기 성남시 분당구 성남대로343번길 9 에스케이유타워',

        '123-456-78910', '/images/company1.png', now());
insert into user_tb(role, email, password, username, tel, company_name, address, company_num, profile,
                    created_at)
values ('company', 'shinhancard@shinhan.com', '1234', 'shinhan_HR', '010-1234-5678', 'shinhancard', '서울 중구 을지로 100 A동',
        '123-456-78910', '/images/company2.jpg', now());
insert into user_tb(role, email, password, username, tel, company_name, address, company_num, profile,
                    created_at)
values ('company', 'nhn_kcp@nhn.com', '1234', 'nhn_HR', '010-1234-5678', 'NHN KCP', '서울 구로구 디지털로26길 72 (구로동, NHN KCP)',
        '123-456-78910', '/images/company3.JPG', now());
insert into user_tb(role, email, password, username, tel, company_name, address, company_num, profile,
                    created_at)
values ('company', 'inflearn@inflearn.com', '1234', 'inflearn_HR', '010-1234-5678', '인프랩(인프런)',
        '경기 성남시 분당구 대왕판교로 660 1A 동 4층 405호', '123-456-78910', '/images/company4.png', now());
insert into user_tb(role, email, password, username, tel, company_name, address, company_num, profile,
                    created_at)
values ('company', 'humanscape@nate.com', '1234', 'humanscape_HR', '010-1234-5678', '휴먼스케이프',
        '서울 강남구 봉은사로86길 6 레베쌍트빌딩 6층',
        '123-456-78910', '/images/company5.png', now());
insert into user_tb(role, email, password, username, tel, company_name, address, company_num, profile,
                    created_at)
values ('company', 'soomgo@soomgo.com', '1234', 'soomgo_HR', '010-1234-5678', '브레이브모바일 (숨고)',
        '서울 강남구 테헤란로 415 L7 강남타워 5층',
        '123-456-78910', '/images/company6.jpg', now());
insert into user_tb(role, email, password, username, tel, company_name, address, company_num, profile,
                    created_at)
values ('company', 'seedn@seedn.com', '1234', 'seedn_HR', '010-1234-5678', '씨드앤', '서울 성동구 왕십리로 115 헤이그라운드 서울숲점 605호',
        '123-456-78910', '/images/company7.jpg', now());
insert into user_tb(role, email, password, username, tel, company_name, address, company_num, profile,
                    created_at)
values ('company', 'pickleplus@pickle.com', '1234', 'pickleplus_HR', '010-1234-5678 ', '주식회사 피클플러스',
        '서울 중구 한강대로 416 서울스퀘어',
        '123-456-78910', '/images/company8.png', now());
insert into user_tb(role, email, password, username, tel, company_name, address, company_num, profile,
                    created_at)
values ('company', 'wadiz@wadiz.com', '1234', 'wadiz_HR', '010-1234-5678 ', '와디즈', '경기 성남시 분당구 판교로 242 A동 4층 와디즈',
        '123-456-78910', '/images/company9.jpg', now());

--이력서정보 입력
insert into resume_tb(person_id, title, profile, portfolio, introduce, career,
                      simple_introduce, created_at)
values (1, '백엔드 개발자', '/images/person01.png', 'http://qmfmqfqmf',
        '복잡한 문제를 구조화하고 추상화해 단순하게 풀어내는 것을 좋아합니다.
꾸준한 공부를 통해 문제를 오랫동안 끊임없이 개선하는 것을 좋아합니다.
어려운 지식을 저만의 언어로 쉽게 풀어내는 것을 좋아합니다. 많은 사람에게 지식을 전파할 수 있는 사람이 되기를 원합니다.', '1년 근무', '꾸준히 공부하는 개발자입니다', now());
insert into resume_tb(person_id, title, profile, portfolio, introduce, career,
                      simple_introduce, created_at)
values (6, '백엔드 개발자', '/images/person01.png', 'http://qmfmqfqmf',
        '복잡한 문제를 구조화하고 추상화해 단순하게 풀어내는 것을 좋아합니다.
꾸준한 공부를 통해 문제를 오랫동안 끊임없이 개선하는 것을 좋아합니다.
어려운 지식을 저만의 언어로 쉽게 풀어내는 것을 좋아합니다. 많은 사람에게 지식을 전파할 수 있는 사람이 되기를 원합니다.', '1년 근무', '꾸준히 공부하는 개발자입니다', now());



--채용공고 입력
-- 더미데이터 company_id변경 <= JOIN
insert into post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task,
                    profile, working_area, created_at)
values (16, '데이터 분석가', '
미들 (4~8년)', '회사 내규에 따름', '처우는 채용 전형 진행 후 합격자에 대해 개인 별 협의 예정', '09:00', '18:00', '채용 시 마감',
        '데이터 관리, 분석, 시각화, 모델링을 통해 데이터로부터 정보를 추출하고 인사이트를 도출합니다.', '/images/company4.png', '경기 성남시 분당구', now());

insert into post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task,
                    profile, working_area, created_at)
values (16, 'React Native 개발자 (경력 1년 이상)', '
주니어 (1~3년)', '회사 내규에 따름', '처우는 채용 전형 진행 후 합격자에 대해 개인 별 협의 예정', '09:00', '18:00', '채용 시 마감',
        'TypeScript, React Native 를 기반으로 Android / iOS 애플리케이션을 개발하고 배포합니다.', '/images/company4.png', '경기 성남시 분당구',
        now());

insert into post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task,
                    profile, working_area, created_at)
values (16, '[인턴] 프론트엔드 개발자 (JavaScript)', '
인턴', '회사 내규에 따름', '처우는 채용 전형 진행 후 합격자에 대해 개인 별 협의 예정', '09:00', '18:00', '채용 시 마감',
        'VanillaJS (ES6) 를 기반으로 프론트엔드 기능을 개발하고 배포합니다.', '/images/company4.png', '경기 성남시 분당구', now());

insert into post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task,
                    profile, working_area, created_at)
values (16, '[인턴] 프론트엔드 개발자 (JavaScript)', '
인턴', '회사 내규에 따름', '처우는 채용 전형 진행 후 합격자에 대해 개인 별 협의 예정', '09:00', '18:00', '채용 시 마감',
        'VanillaJS (ES6) 를 기반으로 프론트엔드 기능을 개발하고 배포합니다.', '/images/company4.png', '경기 성남시 분당구', now());


-- entity수정 career데이터 varchar로 고치기
--스킬
--이력서에서
insert into skill_tb(skill, resume_id, created_at)
values ('JAVA', 1, now());
insert into skill_tb(skill, resume_id, created_at)
values ('JAVA', 2, now());
insert into skill_tb(skill, resume_id, created_at)
values ('C', 1, now());
insert into skill_tb(skill, resume_id, created_at)
values ('C', 2, now());


--공고에서
insert into skill_tb(skill, post_id, created_at)
values ('JAVA', 1, now());
insert into skill_tb(skill, post_id, created_at)
values ('Flutter', 1, now());
insert into skill_tb(skill, post_id, created_at)
values ('JAVA', 2, now());
insert into skill_tb(skill, post_id, created_at)
values ('C++', 2, now());
insert into skill_tb(skill, post_id, created_at)
values ('JAVA', 3, now());


--지원
insert into apply_tb(resume_id, post_id, company_id, person_id, is_pass)
values (1, 1, 13, 1, '합격');


--제안
--offer_tb content 삭제, 더미 추가
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (1, 1, 13, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (1, 2, 13, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (1, 3, 13, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (2, 3, 13, 1, now());
-- 더미추가 0306
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (3, 3, 13, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (4, 3, 13, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (5, 3, 13, 1, now());



--ispass varchar타입에서 int로 바꾸기
--스크랩
--회사 이력서스크랩
insert into scrap_tb(resume_id, company_id, created_at)
values (1, 2, now());


--개인 채용공고스크랩
insert into scrap_tb(post_id, person_id, created_at)
values (1, 1, now());