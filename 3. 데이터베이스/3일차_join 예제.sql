-- 컴퓨터개론을 강의하는 교수의 교수번호를 확인하는 쿼리문을 작성하세요.
-- inner join : 테이블 순서에 상관없이 동일한 결과가 나옴
select le_pr_num from subject
	inner join lecture
    on le_su_num = su_num
    where su_title = '컴퓨터 개론';

select le_pr_num from lecture
	inner join subject
    on le_su_num = su_num
    where su_title = '컴퓨터 개론';


-- 컴퓨터개론 3분반 강의를 듣는 학생들의 명단을 확인하는 쿼리를 작성하세요
select * from lecture;
select * from student;
select * from subject;
select * from course;
select * from professor;
 select st_num, st_name from course
	join subject
		on co_su_num = su_num 
    join student
		on co_st_num = st_num
    where su_title = '컴퓨터 개론' and su_class_num = '3';
    
-- 2021160123학번 학생이 1번 강의인 컴퓨터개론 3분반 강의를 신청했다.이 때 알맞은 쿼리문을 작성하세요
 select st_num, st_name, su_title, su_class_num from course
	join student
		on co_st_num = st_num
    join subject
		on su_num = co_su_num
	where st_num = '2021160123' and st_name = '홍길동';
    
-- 이순신 교수님의 강의를 듣는 학생들 명단을 확인하는 쿼리문을 작성하세요.
select st_name from lecture
	join professor	on le_pr_num = pr_num
	join course		on co_su_num = le_su_num
	join student		on co_st_num = st_num
	where pr_name = '이순신';
    
