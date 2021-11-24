/*
과일 - fruit
	과일명 fr_name / varchar(30) / PK 
    가격 fr_price / int / not null / 0
    재고 fr_amount / int / not null / 0
    단위 fr_unit / varchar(10) 
    
납품 - buy
	납품번호 bu_num / int / PK / 자동증가
    과일명 bu_fr_name / varchar(30) / FK-과일 / not null
    수량 bu_amount / int / not null / 0
    날짜 bu_date / datetime / not null / now()
	단위 bu_unit / varchar(10) 
    납품가게명 bu_st_name / varchar(20) / FK-납품가게 / not null 
납품가게 - store
	납품가게명 st_name / varchar(20) / PK
    위치 st_address/ varchar(50) 
    
판매 - sell
	판매번호 se_num / int / PK / 자동증가
    과일명 se_fr_name / varchar(30) /  FK-과일 / not null
    구매량 se_amount / int / not null / 0
    단위 se_unit / varchar(10) 
    구매금액 se_price / int / not null / 0
    구매일 se_date / datetime / not null / now()
    결제방식 se_type / varchar(4) / not null 
소비자
    
*/
-- create database fruit_khj;
-- use fruit_khj;

CREATE TABLE `fruit` (
	`fr_name`	varchar(30)	NOT NULL,
	`fr_price`	int	NOT NULL DEFAULT 0,
	`fr_amount`	int	NOT NULL DEFAULT 0,
	`fr_unit`	varchar(10)	NULL
);

CREATE TABLE `buy` (
	`bu_num`	int	NOT NULL auto_increment, 
	`bu_fr_name`	varchar(30)	NOT NULL,
	`bu_amount`	int	NOT NULL DEFAULT 0,
	`bu_date`	datetime NOT NULL DEFAULT current_timestamp,
	`bu_unit`	varchar(10)	NULL,
	`bu_st_name`	varchar(20)	NOT NULL,
    PRIMARY KEY(`bu_num`)
);

CREATE TABLE `store` (
	`st_name`	varchar(20)	NOT NULL,
	`st_address` varchar(50)	NULL
);

CREATE TABLE `sell` (
	`se_num`	int	NOT NULL auto_increment,
	`se_fr_name` varchar(30) NOT NULL,
	`se_amount`	int	 NOT NULL default 0,
	`se_unit`	varchar(10)	NULL,
	`se_price`	int	NOT NULL DEFAULT 0,
	`se_date`	datetime	NOT NULL DEFAULT now(),
	`se_type`	varchar(4)	NOT NULL,
    PRIMARY KEY(`se_num`)
);

ALTER TABLE `fruit` ADD CONSTRAINT `PK_FRUIT` PRIMARY KEY (
	`fr_name`
);

ALTER TABLE `store` ADD CONSTRAINT `PK_STORE` PRIMARY KEY (
	`st_name`
);

ALTER TABLE `buy` ADD CONSTRAINT `FK_BUY_FRUIT` foreign key (
	`bu_fr_name`
)    REFERENCES  `fruit`(`fr_name`);

ALTER TABLE `buy` ADD CONSTRAINT `FK_BUY_STORE` foreign key (
	`bu_st_name`
)    REFERENCES  `store`(`st_name`);

ALTER TABLE `sell` ADD CONSTRAINT `FK_SELL_FRUIT` foreign key (
	`se_fr_name`
)    REFERENCES  `fruit`(`fr_name`);
