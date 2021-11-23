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
insert into lecture(le_pr_num, le_su_num)
	values('2000160001', '1');
-- 20001160001 교수님이 1번 과목을 강의한다. 이 내용을 lecture 테이블에 추가하는 코드를 작성하세요.
select * from lecture;



-- 2021160123 홍길동 학생이 1번 과목을 수강신청 했다. 이 내용을 추가하는 쿼리문을 작성하세요.
insert into course(co_st_num, co_su_num)
	values('2021160123', '1');
select * from course;

-- 2000160001교수님이 1번 과목을 강의할 강의 시간표의 일정이 새로 나왔다. 월 1,2,로 결정되었고, 분반은 3분반이다. 
-- 다음을 실행하는 쿼리문을 작성하세요.



