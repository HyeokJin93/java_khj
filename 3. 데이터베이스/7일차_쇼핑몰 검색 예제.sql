-- 아우터 모든 제품을 확인.
select gd_name as '아우터 제품' from category
	join goods on ca_num = gd_ca_num
    where ca_main = '아우터';
-- 분류가 아우터이고, 구매가능한 모든 제품을 확인
select gd_name as '구매가능 아우터' from category
	join goods on ca_num = gd_ca_num
    join `option` on gd_num = op_gd_num
    where ca_main = '아우터' && op_stock >= 1 ;
    
-- 분류가 아우터이고, 가장 많이 팔린 제품 4가지를 확인
select goods.* from goods
	join `option` on gd_num = op_gd_num
    join `order` on or_op_num = op_num
    join category on ca_num = gd_ca_num
    where ca_main = '아우터' && or_state != '주문취소' && or_state != '환불'
    group by gd_name
    order by sum(or_amount) desc
    limit 4;
    
    
-- 등록된 아우터 제품의 개수 확인
select count(*) as '아우터 제품 수' from goods
	join category on ca_num = gd_ca_num
    where ca_main = '아우터';
    
-- 등록된 아우터 제품을 10개씩 화면에 출력할 때 2페이지에 해당하는 제품을 확인
select * from goods
	join category on ca_num = gd_ca_num
    where ca_main = '아우터'
    limit 10, 10;


-- abc123 회원이 주문한 횟수
select count(*) as 'abc123 회원 주문횟수' from `order`
	where or_me_id = 'abc123';
-- abc123 회원의 상반기 사용 금액
select sum(or_total_price) from `order`
	where or_me_id = 'abc123' and or_state = '결제완료' and
		or_date like '2021%' and or_date < '2021-07-01';
select * from `order`;
select * from goods;

-- 아크 폭스터 패딩에 달린 리뷰들을 확인
select * from review
	join goods on gd_num = re_gd_num
    where gd_name = '아크 폭스터 패딩';