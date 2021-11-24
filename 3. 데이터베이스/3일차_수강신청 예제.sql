-- 2021160001학번 학생이 컴퓨터 개론 3분반 강의를 신청했다. 이 때 알맞은 쿼리문을 작성하세요.
-- insert into course(co_st_num, co_su_num) values(2021160001,1);
    
-- 2021160015학번 학생이 컴퓨터 개론 3분반 강의를 신청했다. 이 때 알맞은 쿼리문을 작성하세요.
-- insert into course(co_st_num, co_su_num) 
--	select 2021160015, su_num from subject where su_class_num = '3' and su_title = '컴퓨터 개론';

-- 2021160123학번 홍길동 학생이 수강중인 컴퓨터 개론 3분반 성적이 A+이 나왔다. 이 때 알맞은 쿼리문을 작성하세요.
-- update course set co_score = 'A+' where  co_st_num = '2021160123' and co_su_num = 1;

-- 홍길동 학생이 수강한 수강 과목의 수를 확인
select * from course;
select * from student;
select count(*) as '홍길동 학생 수강 과목 수' from course
	join student on co_st_num = st_num
	where st_name = '홍길동';
    
-- 컴퓨터 개론 3분반 현재 수강 신청 학생수를 확인
select * from subject;
select * from course;
select count(*) as '컴개론 3분반 현재인원' from course
	join subject on co_su_num = su_num
    where su_title = '컴퓨터 개론' and su_class_num = '3';
    
-- 이순신 교수님이 강의하는 강의 수
select * from professor;
select * from lecture;
select count(*) as '이순신 교수님 강의 수' from lecture
	join professor on le_pr_num = pr_num
    where pr_name = '이순신';
    
    select count(*) as '이순신 교수님 강의 수' from lecture
	join (select * from professor where pr_name = '이순신') as t on le_pr_num = pr_num