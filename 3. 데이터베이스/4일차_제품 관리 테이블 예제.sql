-- 단가가 3000원 이상, 6000원 이하인 제품들을 확인하는 쿼리를 작성하세요
-- SELECT (보고싶은 속성명) FROM 테이블 (WHERE 조건)
select 제조업체, 제품명, 재고량, 단가 from 제품 
	where 단가 >= 3000 and 단가 <=6000
    order by 제조업체, 제품명; 
    
-- BETWEEN - A이상 B이하일때 사용
select 제조업체, 제품명, 재고량, 단가 from 제품 
	where 단가 between 3000 and 6000
    order by 제조업체, 제품명; 
    
-- IN : 여러 값 중 하나를 만족하는 경우 사용 (하나의 속성에 대해서 or을 여러개 써야할 때)
-- 제조업체가 대한식품 또는 민국푸드인 제품들을 확인하는 쿼리를 작성하세요
SELECT * from 제품 WHERE 제조업체 IN('대한식품','민국푸드') order by 제조업체;
SELECT * from 제품 WHERE 제조업체 ='대한식품' or 제조업체 = '민국푸드' order by 제조업체;
    
-- 등급이 silver 또는 gold인 회원의 아이디를 확인하는 쿼리문 작성
SELECT * FROM 고객;
SELECT 고객아이디 FROM 고객 WHERE 등급 IN('silver', 'gold');
SELECT 고객아이디 FROM 고객 WHERE 등급 = 'silver' or 등급 = 'gold';

-- 등급이 silver 또는 gold인 회원이 주문한 제품명을 확인하는 쿼리
select * from 고객;
select * from 제품;
select * from 주문;
select distinct 제품명 from 고객 
	join 주문 on 고객.고객아이디 = 주문.주문고객
    join 제품 on 제품.제품번호 = 주문.주문제품
    where 등급 IN('silver', 'gold');
    
-- 가격이 2600원 이상인 제품의 제품명과 단가를 확인하는 쿼리
SELECT * from 제품;
SELECT 제품명, 단가 FROM 제품 WHERE 단가 >= 2600;

-- 서브쿼리 : 쿼리문 안에 들어가있는 쿼리
-- SELECT () FROM () [WHERE ()];
-- ()안에 모두 들어갈 수 있다.
-- 쿵떡파이의 가격보다 크거나 같은 제품의 제품명과 단가를 확인하는 쿼리 (서브쿼리 이용)
SELECT 제품명, 단가 FROM 제품 WHERE 단가 >= (SELECT 단가 FROM 제품 WHERE 제품명 = '쿵떡파이');

-- 그냥만두의 가격 보다 크거나 같고 얼큰라면의 가격보다 크거나 같은 제품의 제품명과 단가를 확인
SELECT * FROM 제품 order by 제조업체;

SELECT 제품명, 단가 FROM 제품 
	WHERE 단가 >= (SELECT 단가 FROM 제품 WHERE 제품명 = '그냥만두') 
    and 단가 >= (SELECT 단가 FROM 제품 WHERE 제품명 = '얼큰라면');

SELECT 제품명, 단가 FROM 제품 
	WHERE 단가 >= (SELECT MAX(단가) FROM 제품 WHERE 제품명 IN('얼큰라면','그냥만두'));
    
-- ALL() : 전부를 만족하는 경우들만 확인 AND
SELECT 제품명, 단가 FROM 제품 
	WHERE 단가 >= ALL(SELECT 단가 FROM 제품 WHERE 제품명 IN('얼큰라면','그냥만두'));
-- ANY() : 하나 이상 만족하는 경우들만 확인 OR
-- 그냥만두의 가격보다 크거나 같거나 얼큰라면의 가격보다 크거나 같은 제품의 제품명과 단가를 확인
SELECT 제품명, 단가 FROM 제품 
	WHERE 단가 >= (SELECT 단가 FROM 제품 WHERE 제품명 = '그냥만두') 
    or 단가 >= (SELECT 단가 FROM 제품 WHERE 제품명 = '얼큰라면');

SELECT 제품명, 단가 FROM 제품 
	WHERE 단가 >= (SELECT MIN(단가) FROM 제품 WHERE 제품명 IN('얼큰라면','그냥만두'));
    
-- ALL() : 전부를 만족하는 경우들만 확인 AND
SELECT 제품명, 단가 FROM 제품 
	WHERE 단가 >= ANY(SELECT 단가 FROM 제품 WHERE 제품명 IN('얼큰라면','그냥만두'));

-- GROUP BY : WHERE절 다음에 나와야 함, ORDER BY 앞, 같은 그룹끼리 묶어줌
-- SELECT () FROM () [WHERE() GROUP BY() ORDER BY()];
-- GROUP BY는 DISTINCT처럼 보일 수 있다
SELECT * FROM 제품 GROUP BY 제조업체;
SELECT distinct * FROM 제품 ;

-- 대한식품에서 만든 제품 개수 확인
SELECT count(*) as 대한식품제품수 FROM 제품 WHERE 제조업체 = '대한식품';
SELECT * from 제품;
select * from 제품 GROUP BY '대한식품';
    
-- 각 회사별 만든 제품 개수 확인
SELECT 제조업체, count(*) as '제품수'FROM 제품 GROUP BY 제조업체;
    
-- 1번이상 고객 별 주문한 주문 횟수
SELECT 주문고객, count(*) as '주문 횟수' FROM 주문 GROUP BY 주문고객;
    
-- 1번이상 주문한 고객별 고객의 총 주문 갯수
SELECT 주문고객, sum(수량) as '주문 갯수' FROM 주문 GROUP BY 주문고객;

-- 1번이상 주문한 고객별 고객의 총 주문 금액 확인, 총 주문 금액 순으로 정렬
SELECT 주문고객, sum(단가*수량) as '총 주문 금액' FROM 주문 
	JOIN 제품 ON 주문제품 = 제품번호
    GROUP BY 주문고객
    ORDER BY `총 주문 금액`;

-- 1번이상 주문한 고객중 총 주문 금액이 100000원 이상인 고객 확인
-- WHERE절에는 GROUP BY로 작업한 집약함수를 이용한 조건을 걸 수 없다
-- HAVING 절은 GROUP BY로 작업한 내용에 조건을 걸어줄 때 사용
SELECT 주문고객, sum(단가*수량) as '총 주문 금액' FROM 주문 
	JOIN 제품 ON 주문제품 = 제품번호
    GROUP BY 주문고객
    HAVING `총 주문 금액` >= 100000
    ORDER BY `총 주문 금액` DESC;    
-- ASC 오름차순 : 1 2 3 4 5 (기본값)
-- DESC 내림차순 : 5 4 3 2 1

-- 제품별 주문한 제품번호와 주문수량을 확인하는 코드를 작성
select * from 주문;
SELECT * from 제품;
SELECT 주문제품, sum(수량) as 누적주문량, 제조업체 FROM 주문
	JOIN 제품 ON 주문제품 = 제품번호
    GROUP BY 제품번호
    order by 제조업체; 
    
-- 제조업체별 가장 많이 팔린 제품을 제조업체, 제품번호, 주문수량을 확인하는 코드를 작성

SELECT * FROM 
	(SELECT 주문제품, sum(수량) as 누적주문량, 제조업체 FROM 주문
	JOIN 제품 ON 주문제품 = 제품번호
    GROUP BY 제품번호
    order by 제조업체) AS `제품별 판매량`
	GROUP BY 제조업체
    HAVING max(`누적주문량`);
    
    SELECT 제조업체, 주문제품 as 제품번호, MAX(`누적주문량`) as '주문수량' FROM 
	(SELECT 주문제품, sum(수량) as 누적주문량, 제조업체 FROM 주문
	JOIN 제품 ON 주문제품 = 제품번호
    GROUP BY 제품번호
    order by 제조업체) AS `제품별 판매량`
	GROUP BY 제조업체;
    
    -- WITH ROLLUP : 부분 총합을 구해줌
    
	SELECT 주문제품, 주문고객, SUM(수량) FROM 주문
		GROUP BY 주문제품, 주문고객
        with rollup;
    -- LIMIT : 검색 결과의 갯수를 제한할 때 사용
    -- LIMIT 정수1 : 정수1개만큼 결과를 보여줌
    -- LIMIT 번지, 정수1 : 번지부터 정수 1개의 결과를 보여줌
    
    SELECT * FROM 주문 LIMIT 5; -- 처음 5개
    -- 한번에 주문 내역을 확인할 수 있는 갯수가 5개인 경우로, 1페이지에 해당
    SELECT * FROM 주문 LIMIT 0,5; -- 0번지 부터 5개
    -- 한번에 주문 내역을 확인할 수 있는 갯수가 5개인 경우로, 1페이지에 해당
    SELECT * FROM 주문 LIMIT 5,5; -- 5번지 부터 5개
    -- 한번에 주문 내역을 확인할 수 있는 갯수가 5개인 경우로, 2페이지에 해당
	SELECT * FROM 주문 LIMIT 10,5; -- 10번지 부터 5개
    -- 한번에 주문 내역을 확인할 수 있는 갯수가 5개인 경우로, 3페이지에 해당  
    SELECT * FROM 주문 LIMIT 10,5; -- 10번지 부터 5개 5 * ( 3 - 1 ) : 갯수 * (페이지번호 - 1);
    -- 한번에 주문 내역을 확인할 수 있는 갯수가 5개인 경우로, 3페이지에 해당alter
    
    
    
    
    SELECT * FROM 고객;
    SELECT * FROM 제품;
    SELECT * FROM 주문;
    
    -- 가장 많은 금액을 사용한 고객아이디를 확인
	SELECT 고객아이디, SUM(단가*수량) AS 사용금액 FROM 고객
        JOIN 주문 ON 고객아이디 = 주문고객
        JOIN 제품 ON 제품번호 = 주문제품
        GROUP BY 고객아이디
        order by 사용금액 DESC
        LIMIT 1;
        
    -- 가장 많은 제품 갯수를 구매한 고객아이디를 확인
	SELECT 고객아이디, SUM(수량) AS '구매갯수' FROM 고객
		JOIN 주문 ON 고객아이디 = 주문고객
        group by 고객아이디
        ORDER BY 구매갯수 DESC
        LIMIT 1;
        
    -- 20대가 구매한 제품목록을 확인
    SELECT 제품명  FROM 고객
		JOIN 주문 ON 고객아이디 = 주문고객
        JOIN 제품 ON 제품.제품번호 = 주문.주문제품
        WHERE 나이 BETWEEN 20 AND 29
        GROUP BY 제품명;
                
	SELECT 제품명 AS '20대 구매제품' FROM 고객
		JOIN 주문 ON 고객아이디 = 주문고객
        JOIN 제품 ON 제품.제품번호 = 주문.주문제품
        WHERE 나이 BETWEEN 20 AND 29
        GROUP BY 제품명;            
                
    -- 20대가 구매를 가장 많이한 제품을 확인
    SELECT 제품명, MAX(`누적수량`) AS '구매수량' FROM (SELECT 제품명, SUM(수량) AS '누적수량' FROM 고객
		JOIN 주문 ON 고객아이디 = 주문고객
        JOIN 제품 ON 제품.제품번호 = 주문.주문제품
        WHERE 나이 BETWEEN 20 AND 29
        group by 제품명
        ) AS `20대 구매목록`;
        
        SELECT 제품명 AS '20대 최다 구매 제품', SUM(수량) AS '누적수량' FROM 고객
		JOIN 주문 ON 고객아이디 = 주문고객
        JOIN 제품 ON 제품.제품번호 = 주문.주문제품
        WHERE 나이 BETWEEN 20 AND 29
        group by 제품명 
        ORDER BY 누적수량 DESC LIMIT 1;
        
        
	SELECT * FROM 주문
		JOIN 제품 ON 주문제품 = 제품번호
        JOIN 고객 ON 고객아이디 = 주문고객;