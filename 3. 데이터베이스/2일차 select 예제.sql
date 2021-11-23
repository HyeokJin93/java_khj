select * from student;
select * from university_khj.student;
select * from `university_khj`.`student`;
select st_num, st_id, st_pw, st_name, st_reg_num from student;
select * from student where st_num = '2021123005';


-- 입학한 학생 전체를 확인하는 쿼리문을 작성하세요.
select * from student;

-- 홍길동 학생의 정보를 확인하는 쿼리문을 작성하세요.
select * from student where st_name = '홍길동';

-- 홍길동 학생이 아닌 학생들의 정보를 확인하는 쿼리문을 작성하세요.
select * from student where st_name != '홍길동';
select * from student where st_name <> '홍길동';

select * from professor;

-- 교수번호가 2000160001인 이순신 교수님의 정보를 추가하는 쿼리문을 작성하세요.
-- id : lee, pw : leelee, reg_num : 550505-1234567

insert into professor values ('2000160001', 'lee', 'leelee', '이순신', '550505-1234567');

-- 과목명이 컴퓨터개론이고, 과목 코드는 MSC001, 일정과 분반은 미정인 과목을 추가하는 쿼리문을 작성하세요.
insert into subject(`su_code`, `su_title`)
	values('MSC001', '컴퓨터개론');
select * from subject;

insert into subject(`su_title`)
	values('컴퓨터개론');
select * from subject;

insert into lecture(le_pr_num, le_su_num)
	values('2000160001', '1');
-- 20001160001 교수님이 1번 과목을 강의한다. 이 내용을 lecture 테이블에 추가하는 코드를 작성하세요.
select * from lecture;



-- 2021160123 홍길동 학생이 1번 과목을 수강신청 했다. 이 내용을 추가하는 쿼리문을 작성하세요.
insert into course(co_st_num, co_su_num)
	values('2021160123', '1');
select * from course;

-- 시간표 일정이 등록된 과목들
select * from subject where `su_schedule` is not null;
select * from subject where `su_schedule` is null;

-- 과목 제목이 컴퓨터가 들어간 과목들
select * from subject where su_title like '%컴퓨터%';
-- 과목 제목이 컴퓨터로 시작하는 과목들
select * from subject where su_title like '컴퓨터%';
-- 과목 제목이 컴퓨터로 끝나는 과목들
select * from subject where su_title like '%컴퓨터';
-- 과목 제목이 컴퓨터로 시작하고, 과목 제목의 글자수가 5자인 과목들
select * from subject where su_title like '컴퓨터__';

-- 21학번 학생들을 확인하는 쿼리문을 작성하세요.
select * from student where st_num like '2021%';
select * from student where st_num like '2021______';
select * from student where st_num like '2021000000' and st_num < '2022000000';

-- 컴공 학생들을 확인하는 쿼리문을 작성하세요. 컴공과 번호 160
select * from student where st_num like '____160%';

-- 학생들 중 여학생들을 학인하는 쿼리문을 작성하세요.
select * from student where st_reg_num like '______-4%' or st_reg_num like '______-2%'; 
select * from student where st_reg_num like '%-4%' or st_reg_num like '%-2%';

-- 학생정보를 이름순으로 정렬하는 쿼리문을 작성하세요.
select * from student order by st_name desc, st_num desc;


