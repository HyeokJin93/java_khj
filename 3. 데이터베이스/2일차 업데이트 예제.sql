-- 학번이 2021123001 학생의 id와 pw를 수정하는 쿼리문
update student 
	set 
		st_id = 'knagkidong', 
		st_pw = 'knagkidongpw' 
	where 
		st_num = 
			'2021160001';

update student 
	set 
		st_id = 'knagkidong', 
		st_pw = 'knagkidongpw' 
	where 
		st_name = 
			'유관순';


SELECT * FROM university_khj.student;


update subject
	set
		`su_schedule` = '월1, 월2',
        `su_class_num` = '3'
    
    where
		`su_num` = '1';
        
select * from subject;