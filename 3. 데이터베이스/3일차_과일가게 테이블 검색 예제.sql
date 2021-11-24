-- 과일 판매 내역을 확인하는 쿼리문
select se_date, se_fr_name, se_amount, se_price, se_type from sell;

/*
-- 1이 나오면 참
select now() > '2021-11-23';

-- 0이 나오면 거짓
select now() > '2021-11-25';
*/

-- 오늘 과일 판매내역을 확인
select se_date, se_fr_name, se_amount, se_price, se_type from sell where  se_date < '2021-11-25' and se_date >= '2021-11-24';
-- 2021-11-24 <= se_date < now();
select se_date, se_fr_name, se_amount, se_price, se_type from sell 
	where  se_date like '2021-11-24%';


select * from sell;
select sum(se_price) as '오늘 판매액' from sell where se_date < '2021-11-25' and se_date >= '2021-11-24';

-- 딸기 총 판매액을 확인
select sum(se_price) as '딸기 판매액' from sell where se_fr_name = '딸기' ;

-- 현금으로 판매한 금액
select sum(se_price) as '혐금 결제액' from sell where se_type = '현금' ;
