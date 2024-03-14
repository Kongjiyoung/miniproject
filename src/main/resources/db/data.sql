--더미데이터에 들어가 있는 post 다 지우기
-- role   1: 개인, 2: 회사
--개인정보 입력
-- 0308 이름 맞춤, 이미지 추가
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '1998-05-04', 'captain_kong@nate.com', '1234', 'captain_kong', '010-1234-5678 ', '부산광역시', 'person01.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '1997-09-24', 'mylove_lsh@nate.com', '1234', 'lsh', '010-1234-5678 ', '부산광역시', 'person02.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '2000-07-09', 'hahaha@nate.com', '1234', 'khh', '010-1234-5678 ', '부산광역시', 'person03.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '1993-01-14', 'hana@nate.com', '1234', 'ysh', '010-1234-5678 ', '부산광역시', 'person04.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '1999-02-30', 'jhj@nate.com', '1234', 'jhj', '010-1234-5678 ', '부산광역시', 'person05.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '2002-04-22', 'ssar@nate.com', '1234', 'ssar', '010-1234-5678 ', '부산광역시', 'person06.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '1993-05-21', 'zusim@nate.com', '1234', 'zusim', '010-1234-5678 ', '부산광역시', 'person07.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '1995-04-17', 'ryu@nate.com', '1234', 'ryu', '010-1234-5678 ', '부산광역시', 'person08.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '2001-12-12', 'sunghun@nate.com', '1234', 'sunghun', '010-1234-5678 ', '부산광역시', 'person09.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '1998-08-15', 'hoondong@nate.com', '1234', 'hoondong ', '010-1234-5678 ', '부산광역시', 'person10.jpg',
        now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '1988-11-30', 'minji@nate.com', '1234', 'minji', '010-1234-5678 ', '부산광역시', 'person11.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '1990-03-02', 'jake@nate.com', '1234', 'jake', '010-1234-5678 ', '부산광역시', 'person12.jpg', now());
INSERT INTO user_tb(role, birth, email, password, username, tel, address, profile, created_at)
VALUES ('person', '2000-03-02', 'harry@nate.com', '1234', 'harry', '010-1234-5678 ', '부산광역시', 'person13.jpg', now());


--회사정보 입력
INSERT INTO user_tb(role, email, password, username, tel, company_name, address, company_num, profile, created_at)
VALUES ('company', 'sk_cnc@sk.com', '1234', 'sk_HR', '010-1234-5678 ', 'SK(주) C&C', '경기 성남시 분당구 성남대로343번길 9 에스케이유타워', '123-456-78910', 'company01.jpg', now());
INSERT INTO user_tb(role, email, password, username, tel, company_name, address, company_num, profile, created_at)
VALUES ('company', 'shinhancard@shinhan.com', '1234', 'shinhan_HR', '010-1234-5678', '신한카드', '서울 중구 을지로 100 A동', '123-456-78910', 'company02.jpg', now());
INSERT INTO user_tb(role, email, password, username, tel, company_name, address, company_num, profile, created_at)
VALUES ('company', 'nhn_kcp@nhn.com', '1234', 'nhn_HR', '010-1234-5678', 'NHN KCP', '서울 구로구 디지털로26길 72 (구로동, NHN KCP)', '123-456-78910', 'company03.jpg', now());
INSERT INTO user_tb(role, email, password, username, tel, company_name, address, company_num, profile, created_at)
VALUES ('company', 'inflearn@inflearn.com', '1234', 'inflearn_HR', '010-1234-5678', '인프랩(인프런)', '경기 성남시 분당구 대왕판교로 660 1A 동 4층 405호', '123-456-78910', 'company04.jpg', now());
INSERT INTO user_tb(role, email, password, username, tel, company_name, address, company_num, profile, created_at)
VALUES ('company', 'humanscape@nate.com', '1234', 'humanscape_HR', '010-1234-5678', '휴먼스케이프', '서울 강남구 봉은사로86길 6 레베쌍트빌딩 6층', '123-456-78910', 'company05.jpg', now());
INSERT INTO user_tb(role, email, password, username, tel, company_name, address, company_num, profile, created_at)
VALUES ('company', 'soomgo@soomgo.com', '1234', 'soomgo_HR', '010-1234-5678', '브레이브모바일 (숨고)', '서울 강남구 테헤란로 415 L7 강남타워 5층', '123-456-78910', 'company06.jpg', now());
INSERT INTO user_tb(role, email, password, username, tel, company_name, address, company_num, profile, created_at)
VALUES ('company', 'seedn@seedn.com', '1234', 'seedn_HR', '010-1234-5678', '씨드앤', '서울 성동구 왕십리로 115 헤이그라운드 서울숲점 605호', '123-456-78910', 'company07.jpg', now());
INSERT INTO user_tb(role, email, password, username, tel, company_name, address, company_num, profile, created_at)
VALUES ('company', 'pickleplus@pickle.com', '1234', 'pickleplus_HR', '010-1234-5678 ', '주식회사 피클플러스', '서울 중구 한강대로 416 서울스퀘어', '123-456-78910', 'company08.jpg', now());
INSERT INTO user_tb(role, email, password, username, tel, company_name, address, company_num, profile, created_at)
VALUES ('company', 'wadiz@wadiz.com', '1234', 'wadiz_HR', '010-1234-5678 ', '와디즈', '경기 성남시 분당구 판교로 242 A동 4층 와디즈', '123-456-78910', 'company09.jpg', now());


--이력서정보 입력
INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (1,
        '백엔드 개발자 공지영입니다.',
        'person01.jpg',
        'https://github.com/Kongjiyoung',
        '복잡한 문제를 구조화하고 추상화해 단순하게 풀어내는 것을 좋아합니다. 꾸준한 공부를 통해 문제를 오랫동안 끊임없이 개선하는 것을 좋아합니다. 어려운 지식을 저만의 언어로 쉽게 풀어내는 것을 좋아합니다. 많은 사람에게 지식을 전파할 수 있는 사람이 되기를 원합니다.',
        '1년 근무',
        '꾸준히 공부하는 개발자입니다.',
        now());
INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (1,
        '새로운 도전을 좋아하는 백엔드 개발자 공지영입니다.',
        'person01.jpg',
        'https://github.com/Kongjiyoung',
        '책, 인터넷 강의, 소스 코드 분석 등 다양한 방법을 통해 기술적 역량을 쌓고 있습니다. 가장 중요한 기술은 현재 실무에서 사용하는 기술이라고 판단하고, 이에 대해서는 누구보다도 자세히 알고자 노력합니다. 업무 중에 흘러갈 수 있는 기술적 고민을 개인 프로젝트에 다시 적용해 보고 글로 정리하며, 점차 더 깊이 있고 난이도 있는 고민과 경험을 하고자 합니다.',
        '1년 근무',
        '주어진 상황에서 할 수 있는 최선의 선택을 하고자 하였습니다. 테스트코드 작성을 통해 잦은 기획 내용 변경에 수월하게 대응하거나, 품질 좋은 코드를 작성하도록 노력하였습니다.',
        now());
INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (1,
        '다이어그램을 좋아하는 백엔드 개발자, 공지영입니다.',
        'person01.jpg',
        'https://github.com/Kongjiyoung',
        '개발 및 자동화를 통해 일상을 꾸준히 개선시키고 있습니다. 다양한 문화의 사람들과의 커뮤니케이션에 능합니다. 어떤 것이든 구조를 분석하는 것에 관심이 있습니다. 남을 가르칠 수 있을 때야말로 완벽하게 이해한 것이라 생각합니다.',
        '1년 근무',
        '꾸준히 공부하는 개발자입니다',
        now());

INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (2,
        '백엔드 개발자',
        'person02.jpg',
        'http://qmfmqfqmf',
        '안녕하세요 서비스 백엔드 개발자가 되고 싶은 25살 3년차 개발자 이서현입니다. 보안 제품을 만드는 작은 기업에서 서버 / 클라이언트를 개발 및 배포하였습니다. 주로 iOS, 방화벽 개발을 담당했으며 신규 제품 출시와 배포 사후 관리까지 책임지고 개발을 수행한 경험이 있습니다.',
        '3년 근무',
        '안녕하세요 지속 가능한 성장을 추구하는 개발자, 이서현입니다',
        now());

INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (3,
        '백엔드 개발자 (신입)',
        'person03.jpg',
        'http://qmfmqfqmf',
        'Django RestFramework, MySQL, Docker, AWS등 을 이용해 HTTPS 서버를 구축하여 API작성 및 배포한 경험이 있습니다. 데이터를 기반으로 많은 사람들에게 양질의 정보를 보다 편하게 제공하는 이로운 개발자가 되는 것이 목표입니다.',
        '신입',
        '항상 고민하고 노력하는 긍정적인 신입 백엔드 개발자 김하형입니다.',
        now());

INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (4,
        '프론트엔드 개발자',
        'person04.jpg',
        'http://qmfmqfqmf',
        '단순히 코드를 작성하며 기능을 구현하는 것이 아닌 문제를 직면 했을 때 이 문제를 어떤 방식으로 효율성 있게 풀어나가면 좋을지에 대해서 고민하고 그것을 구현하는 것이 개발자의 기본 역량이라고 생각합니다. 사용자의 입장을 고려하여 어떤 기능을 개선하면 좋을지 고민하고 완벽하게 풀어나가는 개발자로 성장하기 위해 노력합니다.',
        '5년 근무',
        '사용자를 공부하는 개발자 양승호입니다.',
        now());

INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (5,
        '백엔드 개발자',
        'person05.jpg',
        'http://qmfmqfqmf',
        '안녕하세요, 백엔드 개발자 장현정입니다. 누적 회원수 100만의 (주)겟인데어에서 백엔드 플렛폼 개발을 해왔습니다. 개발은 단순히 코드를 작성하는 것이 아니라, 사용자의 요구사항을 정확히 파악하고 이를 기술로 구현하는 과정에서 큰 즐거움을 느낍니다. 지속적인 학습을 통해 최신 기술 트렌드를 따라가며, 이를 실제 프로젝트에 적용하여 문제를 해결하는 것을 목표로 하고 있습니다.',
        '3년 근무',
        '독학으로 시작한 경험을 토대로, 이제는 더 넓은 곳에서 더 많은 사람들과 교류하며 배워가고자 하는 개발자입니다.',
        now());

INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (6,
        '백앤드 개발자',
        'person06.jpg',
        'http://qmfmqfqmf',
        '지속적인 성장을 지향합니다. 프로젝트를 진행하며 신기술을 학습하고 적용하면서 IT 트랜드에 맞춰가려고 노력하고 있습니다. 기술 블로그를 운영하며 문제 해결 방식 또는 공부한 내용들을 정리하여 지식을 공유하려고 노력하고 있습니다.',
        '신입',
        '클린 코드를 지향하는 개발자 최주호입니다.',
        now());

INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (7,
        'Backend (Node.js)',
        'person07.jpg',
        'http://qmfmqfqmf',
        '안녕하세요. 백엔드 개발자 유주심입니다. 주니어 개발자로써 갖춰야 할 중요한 능력중에 하나가 회복탄력성과 성장하려는 의지라고 생각합니다. 저에겐 지금이 가장 많은 난관에 부딪힐 때 이지만, 절대 그것에 좌절하거나 포기하지 않을 것 입니다. 넘어지고 부딪혀도 탄력적으로 회복하고, 끊임없이 성장할 의지와 집요함이 있습니다.',
        '신입',
        '두려워하지 않고 부딪히는 개발자',
        now());

INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (8,
        '사용자를 연구하는 백엔드 개발자',
        'person08.jpg',
        'http://qmfmqfqmf',
        '비즈니스 성장에 이바지하는 것을 즐기며, 그 일환으로 개발 업무가 서비스 성장에 어떻게 기여할 수 있는지를 철저히 분석하고 이해하려 노력합니다. 이를 위해 지속적인 전문서적 학습을 통해 사용자 인사이트를 키우는 데 주력하고 있습니다. ',
        '2년 근무',
        '주인의식과 책임의식을 가진 개발자입니다.',
        now());
INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (9,
        'Back-End Engineer',
        'person09.jpg',

        'http://qmfmqfqmf',
        '책을 통해 공부하는 것을 좋아합니다. 2021년에는 31권의 책을, 2022년에는 47권, 2023년에는 43권의 책을 읽었습니다. 다양한 직군의 사람들과 대화하는 것을 좋아하고 개발의 어려움을 다른 언어로 풀어내어 설명하는 것을 즐깁니다. ''덕분에''라는 이야기를 들었을 때 친구로서, 동료로서 깊은 보람을 느낍니다. 사람들에게 좋은 영향을 줄 수 있는 사람이 되려고 노력합니다.',
        '3년 근무',
        '안녕하세요. 꾸준히 공부하는 개발자입니다😀',
        now());
INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (10,
        '인프런 / 쿠버네티스 / 지식공유자',
        'person10.jpg',
        'http://qmfmqfqmf',
        ' SI 프로젝트에서 20년간 IT를 해왔고 백엔드 개발자에서 데브옵스 엔지니어, 정규직에서 프리랜서, 주니어에서 리드까지의 경험을 모두 해봤습니다. 현재는 이런 경험을 모두 녹여 “⚓쿠버네티스 어나더 클래스” 강의를 만드는데 집중하고 있어요. 그리고 해당 강의에 좋은 수강평⭐(125+ 평점 5) 남겨주신 분들께 너무 감사 드립니다.',
        '20년 근무',
        '인프런에서 쿠버네티스(Kubernetes) 분야 강의로 활동하고 있는 지식공유자 입니다.',
        now());
INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (11,
        '크로스플랫폼 앱 개발자',
        'person11.jpg',
        'http://qmfmqfqmf',
        '코드는 항상 누구나 쉽게 읽고 이해 수 있어야한다고 생각합니다. 그래서 저는 코드를 작성할 때 항상 유지보수 가능성을 고려하며, 가독성 높은 코드를 작성하려 노력합니다. 코드를 개선함으로써 항상 더 나은 방향으로 전진하는 것을 즐기며, 팀의 코드가 지속적으로 향상되는 것을 목표로 삼고 있습니다.',
        '1년 근무',
        '안녕하세요! 4년차 크로스플랫폼 앱 개발자 서지민입니다. 클린코드와 리팩토링에 관심이 많으며, 누구나 읽기 쉬운 코드로 작성하는 걸 선호합니다.',
        now());
INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (12,
        'DevOps Engineer',
        'person12.jpg',
        'http://qmfmqfqmf',
        '학교 프로젝트에 참여하여 운영 및 개발에 기여하고 있습니다. 다양한 기술을 배우고 실제로 적용해본 경험을 가지고 있어 팀 내에서 기술적으로 도움을 줄 수 있습니다. 팀원들과 원활한 소통을 통해 공동의 목표를 달성하기 위해 노력하고 있습니다. 개인적인 의견보다는 팀의 의견을 중요시하며, 팀원들과 협력하여 최상의 결과물을 만들어내고자 합니다.',
        '신입',
        '꾸준히 성장하는 DevOps 엔지니어입니다!',
        now());
INSERT INTO resume_tb(person_id, title, profile, portfolio, introduce, career, simple_introduce, created_at)
VALUES (13,
        'Java-Spring 개발자, IT 인프라 엔지니어',
        'person13.jpg',
        'http://qmfmqfqmf',
        '사이드 프로젝트 this.code 팀의 리더로 6주간 다양한 경험이 있습니다. 팀원들의 모든 의견을 경청하여 그라운드 룰로 Test PDCA를 도입하며 프로젝트의 방향을 잡아 나갔습니다. 사람들과 소통하고 기록 공유하는 것을 좋아합니다. 9개월이 넘는 기간 동안 발표 및 북 스터디를 진행하고 있습니다. 스터디 내용을 github에 기록하여 공유하고 있으며 개인 블로그도 운영하고 있습니다.',
        '7년 근무',
        '소통하는 개발자 조정현입니다.',
        now());



--채용공고 입력(14~22)

-- 더미데이터 company_id변경 <= JOIN


-- SK(주) C&C
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (14,
        '데이터 분석가',
        '미들 (4~8년)',
        '회사 내규에 따름',
        '처우는 채용 전형 진행 후 합격자에 대해 개인 별 협의 예정',
        '09:00',
        '18:00',
        '채용 시 마감',
        '데이터 관리, 분석, 시각화, 모델링을 통해 데이터로부터 정보를 추출하고 인사이트를 도출합니다.',
        'company01.jpg',
        '경기 성남시 분당구',
        now());

INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (14,
        'React Native 개발자 (경력 1년 이상)',
        '주니어 (1~3년)',
        '회사 내규에 따름',
        '처우는 채용 전형 진행 후 합격자에 대해 개인 별 협의 예정',
        '09:00',
        '18:00',
        '채용 시 마감',
        'TypeScript, React Native 를 기반으로 Android / iOS 애플리케이션을 개발하고 배포합니다.',
        'company01.jpg',
        '경기 성남시 분당구',
        now());


-- 신한카드
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (15,
        '프론트엔드 SPA 리드개발자',
        '미들 (4~8년)',
        '회사 내규에 따름',
        '시차 출퇴근 형태의 유연근무제를 이용할 수 있음',
        '09:00',
        '18:00',
        '채용 시 마감',
        '신한카드의 hybrid application과 모바일web에서 모바일 웹 서비스를 개발하고, Single Page Application 방식으로 개발을 리드',
        'company02.jpg',
        '서울 중구 을지로',
        now());

-- NHN KCP
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (16,
        'NHN KCP JAVA 백엔드 웹개발자 모집',
        '미들 (4~8년)',
        '회사 내규에 따름',
        '점심 식권포인트 제공(재택근무에도 사용가능)',
        '09:00',
        '18:00',
        '채용 시 마감',
        'PG, VAN 백엔드시스템 개발',
        'company03.jpg',
        '서울 구로구 디지털로',
        now());

-- 인프랩(인프런)
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (17,
        '[인턴] 프론트엔드 개발자 (JavaScript)',
        '인턴',
        '회사 내규에 따름',
        '처우는 채용 전형 진행 후 합격자에 대해 개인 별 협의 예정',
        '09:00',
        '18:00',
        '채용 시 마감',
        'VanillaJS (ES6) 를 기반으로 프론트엔드 기능을 개발하고 배포합니다.',
        'company04.jpg',
        '경기 성남시 분당구',
        now());

INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (17,
        '[인턴] 백엔드 개발자 - node.js',
        '인턴',
        '회사 내규에 따름',
        '우수 인턴 수료자가 수료일로부터 12개월 이내 지원하는 경우, 서류 및 과제 전형을 면제합니다.',
        '09:00',
        '18:00',
        '채용 시 마감',
        'Node.js 기반으로 백엔드 비즈니스 로직을 개발하고 배포합니다.',
        'company04.jpg',
        '경기 성남시 분당구',
        now());

-- 휴먼스케이프
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (18,
        '[마미톡] 백엔드 엔지니어 (5년 이상)',
        '미들 (4~8년)',
        '회사 내규에 따름',
        '영어 이름을 사용하여 직급/나이에 상관없이 존댓말로 대화해요.',
        '09:00',
        '18:00',
        '채용 시 마감',
        '최고의 개발 수준을 위한 탄탄한 프로세스 및 A/B 테스팅 플랫폼을 팀원들과 함께 구축해볼 수 있어요.',
        'company05.jpg',
        '서울 강남구 봉은사로',
        now());

-- 브레이브모바일 (숨고)
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (19,
        '[숨고] Front-end Engineer (TypeScript)',
        '미들 (4~8년)',
        '회사 내규에 따름',
        '루나랩 데스크, 노트북 등 최적의 업무 장비를 지원합니다 (포지션 별 상이)',
        '09:00',
        '18:00',
        '채용 시 마감',
        '숨고 구성원들이 사용하는 백오피스 도구의 개발과 유지 보수를 담당합니다',
        'company06.jpg',
        '경기 성남시 분당구',
        now());

-- 씨드앤
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (20,
        '데브옵스(DevOps) 엔지니어(1년 이상)',
        '주니어 (1~3년)',
        '회사 내규에 따름',
        '“반려동물과 일을 해야 능률이 오릅니다.” 반려동물과의 동반 출퇴근 환영!',
        '09:00',
        '18:00',
        '2024-03-18',
        'AIoT 기술을 활용해 냉난방 온도 운영을 편리하게 도와주는 서비스의 데브옵스(DevOps) 엔지니어를 모집합니다.',
        'company07.jpg',
        '경기 성남시 분당구',
        now());

-- 주식회사 피클플러스
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (21,
        '백엔드 엔지니어 (Python)',
        '주니어 (1~3년)',
        '회사 내규에 따름',
        '250만원 상당의 허먼밀러 의자 등 최고급 업무 장비를 지원합니다.',
        '09:00',
        '18:00',
        '2024-03-18',
        'Django기반 피클플러스의 백엔드 시스템을 개발하고 개선합니다.',
        'company08.jpg',
        '서울 중구 한강대로',
        now());
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (21,
        '웹 프론트엔드 엔지니어',
        '주니어 (1~3년)',
        '회사 내규에 따름',
        '250만원 상당의 허먼밀러 의자 등 최고급 업무 장비를 지원합니다.',
        '09:00',
        '18:00',
        '2024-03-18',
        'TypeScript, React, Next.js 기반 피클플러스의 웹 프론트엔드 시스템을 개발하고 개선합니다.',
        'company08.jpg',
        '서울 중구 한강대로',
        now());

-- 와디즈
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (22,
        '[와디즈] 자바 백엔드 개발 - 펀딩/스토어개발 (경력)',
        '미들 (4~8년)',
        '회사 내규에 따름',
        '와디즈 펀딩 포인트 연 100만원 지급',
        '09:00',
        '18:00',
        '2024-03-18',
        'PO 중심의 조직 단위로 업무를 수행하며, 기획자/디자이너/FE개발자/앱개발자/사업부/고객센터 등 유관 부서와 협업하여, 담당 Product를 성장시키기 위해 사용자 - 활동 데이터 분석 및 사업부/고객 요구사항 분석을 통해 업무 목표와 우선순위를 정하고 실행해요.',
        'company09.jpg',
        '경기도 성남시 분당구',
        now());
INSERT INTO post_tb(company_id, title, career, pay, work_condition, work_start_time, work_end_time, deadline, task, profile, working_area, created_at)
VALUES (22,
        '[와디즈] 디자인 팀장 (경력)',
        '시니어 (9년 이상)',
        '회사 내규에 따름',
        '와디즈 펀딩 포인트 연 100만원 지급',
        '09:00',
        '18:00',
        '2024-03-18',
        '유관부서와 협업하며 온사이트 성과를 높이고, 팀 내 디자인 퀄리티 컨트롤, 일정 관리와 매니징을 진행해요.',
        'company09.jpg',
        '경기도 성남시 분당구',
        now());

-- entity수정 career데이터 varchar로 고치기
--스킬
-- Java, Spring HTML, JavaScript, SQL, Android, React, Node.js, Express, Flutter
--이력서에서(1~13)
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Java', 1, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Spring', 1, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('SQL', 1, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Flutter', 1, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Java', 2, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Spring', 2, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('SQL', 2, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Flutter', 2, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Java', 3, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Spring', 3, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('SQL', 3, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Flutter', 3, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Java', 4, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('HTML', 4, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Node.js', 4, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('React', 4, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Java', 5, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('HTML', 5, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Node.js', 5, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('JavaScript', 5, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Java', 6, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Spring', 6, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Node.js', 6, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('JavaScript', 6, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Flutter', 7, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Spring', 7, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Node.js', 7, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('JavaScript', 7, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('SQL', 8, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('HTML', 8, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Node.js', 8, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('JavaScript', 8, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('SQL', 9, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Express', 9, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Node.js', 9, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Android', 9, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('SQL', 10, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Express', 10, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Node.js', 10, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Android', 10, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('SQL', 11, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Spring', 11, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Express', 11, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('JavaScript', 11, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('SQL', 12, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Android', 12, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Express', 12, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('JavaScript', 12, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('React', 13, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Android', 13, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Express', 13, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Java', 13, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('React', 14, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Android', 14, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Express', 14, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Java', 14, now());

INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('React', 15, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Android', 15, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Express', 15, now());
INSERT INTO skill_tb(skill, resume_id, created_at)
VALUES ('Java', 15, now());

--공고에서(1~13)
-- Java, Spring HTML, JavaScript, SQL, Android, React, Node.js, Express, Flutter
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('JAVA', 1, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('SQL', 1, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Spring', 1, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('JAVA', 2, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('JavaScript', 2, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Android', 2, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('React', 3, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Express', 3, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Flutter', 3, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('JAVA', 4, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('SQL', 4, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Spring', 4, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Flutter', 5, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('HTML', 5, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Android', 5, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('HTML', 6, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('SQL', 6, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Spring', 6, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('JAVA', 7, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('React', 7, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Spring', 7, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('HTML', 8, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('SQL', 8, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('React', 8, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Express', 9, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Flutter', 9, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Java', 9, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('JAVA', 10, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('SQL', 10, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Spring', 10, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('React', 11, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('SQL', 11, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Spring', 11, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('JAVA', 12, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('SQL', 12, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Spring', 12, now());

INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('JAVA', 13, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('JavaScript', 13, now());
INSERT INTO skill_tb(skill, post_id, created_at)
VALUES ('Node.js', 13, now());

--지원
-- resume_id(1~13), post_id(1~13), company_id(14~22), person_id(1~13), 합격, 불합격, 심사중
-- 14번 회사
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (1, 1, 14, 1, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (4, 1, 14, 2, '불합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (6, 2, 14, 4, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (8, 2, 14, 9, '불합격');

-- 15번 회사
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (15, 3, 15, 13, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (14, 3, 15, 12, '불합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (9, 3, 15, 7, '합격');

-- 16번 회사
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (5, 4, 16, 3, '불합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (10, 4, 16, 8, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (12, 4, 16, 10, '합격');

-- 17번 회사
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (5, 5, 17, 3, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (1, 6, 17, 1, '불합격');

-- 18번 회사
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (6, 7, 18, 4, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (13, 7, 18, 11, '불합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (14, 7, 18, 12, '합격');

-- 19번 회사
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (3, 8, 19, 1, '불합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (6, 8, 19, 4, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (9, 8, 19, 7, '합격');

-- 20번 회사
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (13, 9, 20, 11, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (7, 9, 20, 5, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (2, 9, 20, 1, '불합격');

-- 21번 회사
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (3, 10, 21, 1, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (6, 10, 21, 4, '불합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (9, 11, 21, 7, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (4, 11, 21, 2, '합격');

-- 22번 회사
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (10, 12, 22, 8, '불합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (11, 12, 22, 9, '합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (5, 13, 22, 3, '불합격');
INSERT INTO apply_tb(resume_id, post_id, company_id, person_id, is_pass)
VALUES (1, 13, 22, 1, '합격');



--제안
--offer_tb content 삭제, 더미 추가
--post_id가 5개 뿐이라 3을 4번 넣음
-- 1번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (1, 1, 14, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (1, 3, 15, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (1, 11, 21, 1, now());

-- 2번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (2, 6, 17, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (2, 11, 21, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (2, 7, 18, 1, now());



-- 3번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (3, 9, 20, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (3, 4, 16, 1, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (3, 13, 22, 1, now());

-- 4번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (4, 1, 14, 2, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (4, 7, 18, 2, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (4, 13, 22, 2, now());

-- 5번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (5, 6, 17, 3, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (5, 8, 19, 3, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (5, 10, 21, 3, now());

-- 6번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (6, 12, 22, 4, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (6, 4, 16, 4, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (6, 5, 17, 4, now());

-- 7번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (7, 12, 22, 5, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (7, 11, 21, 5, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (7, 2, 14, 5, now());

-- 8번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (8, 9, 20, 6, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (8, 8, 19, 6, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (8, 10, 21, 6, now());

-- 9번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (9, 5, 17, 7, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (9, 7, 18, 7, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (9, 12, 22, 7, now());

-- 10번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (10, 7, 18, 8, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (10, 9, 20, 8, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (10, 3, 15, 8, now());

-- 11번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (111, 1, 14, 9, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (111, 3, 15, 9, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (111, 5, 17, 9, now());

-- 12번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (12, 6, 17, 10, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (12, 7, 18, 10, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (12, 8, 19, 10, now());

-- 13번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (13, 3, 15, 11, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (13, 4, 16, 11, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (13, 5, 17, 11, now());

-- 14번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (14, 5, 17, 12, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (14, 1, 14, 12, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (14, 11, 21, 12, now());

-- 15번 이력서
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (15, 13, 22, 13, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (15, 10, 21, 13, now());
INSERT INTO offer_tb(resume_id, post_id, company_id, person_id, created_at)
VALUES (15, 5, 17, 13, now());


--ispass varchar타입에서 int로 바꾸기
--스크랩
--회사 이력서스크랩
-- INSERT INTO  scrap_tb(resume_id, company_id, created_at)
-- VALUES (1, 2, now()); -- 원래 있던 데이터인데 숫자가 너무 차이나서 혹시 틀렸나 싶어서 주석처리함
-- 14번 회사
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (1, 14, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (3, 14, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (5, 14, now());

-- 15번 회사
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (7, 15, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (9, 15, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (11, 15, now());

-- 16번 회사
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (13, 16, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (15, 16, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (2, 16, now());

-- 17번 회사
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (4, 17, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (6, 17, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (8, 17, now());

-- 18번 회사
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (10, 18, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (12, 18, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (14, 18, now());

-- 19번 회사
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (1, 19, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (7, 19, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (5, 19, now());

-- 20번 회사
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (2, 20, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (6, 20, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (10, 20, now());

-- 21번 회사
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (15, 21, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (12, 21, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (9, 21, now());

-- 22번 회사
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (4, 22, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (8, 22, now());
INSERT INTO  scrap_tb(resume_id, company_id, created_at)
VALUES (13, 22, now());


--개인 채용공고스크랩
-- 1번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (1, 1, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (3, 1, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (5, 1, now());

-- 2번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (7, 2, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (9, 2, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (11, 2, now());

-- 3번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (13, 3, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (2, 3, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (4, 3, now());

-- 4번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (6, 4, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (8, 4, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (10, 4, now());

-- 5번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (12, 5, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (1, 5, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (7, 5, now());

-- 6번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (8, 6, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (4, 6, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (1, 6, now());

-- 17번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (9, 7, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (10, 7, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (11, 7, now());

-- 8번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (2, 8, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (7, 8, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (8, 8, now());

-- 9번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (3, 9, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (4, 9, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (9, 9, now());

-- 10번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (3, 10, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (9, 10, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (10, 10, now());

-- 11번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (5, 11, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (2, 11, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (1, 11, now());

-- 12번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (5, 12, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (7, 12, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (9, 12, now());

-- 13번 구직자
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (10, 13, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (12, 13, now());
INSERT INTO scrap_tb(post_id, person_id, created_at)
VALUES (13, 13, now());