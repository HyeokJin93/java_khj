/* 직급에 다음 데이터를 추가하는 쿼리를 작성하세요.
- 사원, 대리, 과장, 부장, 전무, 이사, 대표이사
사원 200 10
대리 230 15
과장 250 20
부장 280 30
전무 300 35
이사 350 40
대표이사 400 50
*/
/*
INSERT INTO `company`.`salary` (`sa_level`, `sa_base_salary`, `sa_add_salary`) VALUES ('사원', '200', '10');
INSERT INTO `company`.`salary` (`sa_level`, `sa_base_salary`, `sa_add_salary`) VALUES ('대리', '230', '15');
INSERT INTO `company`.`salary` (`sa_level`, `sa_base_salary`, `sa_add_salary`) VALUES ('과장', '250', '20');
INSERT INTO `company`.`salary` (`sa_level`, `sa_base_salary`, `sa_add_salary`) VALUES ('부장', '280', '30');
INSERT INTO `company`.`salary` (`sa_level`, `sa_base_salary`, `sa_add_salary`) VALUES ('전무', '300', '35');
INSERT INTO `company`.`salary` (`sa_level`, `sa_base_salary`, `sa_add_salary`) VALUES ('이사', '350', '40');
INSERT INTO `company`.`salary` (`sa_level`, `sa_base_salary`, `sa_add_salary`) VALUES ('대표이사', '400', '50');
*/
/*
아래 부서 정보를 추가하는 쿼리를 작성하세요.
영업
회계
관리
마케팅
개발

*/
-- INSERT INTO department Values('영업'), ('회계'), ('관리'), ('마케팅'), ('개발');

/* 사번이 2019001, 입사는 2년차, 부서는 회계부, 주민번호는 123456-1234567인 홍길동 사원의 정보를 추가
*/
-- INSERT INTO employee VALUES(2019001, '123456-1234567', '홍길동', '사원', 2, '회계', '2019');
-- INSERT INTO employee VALUES(2019002, '123456-1234561', '홍길동', '사원', 2, '회계', '2019');


    












