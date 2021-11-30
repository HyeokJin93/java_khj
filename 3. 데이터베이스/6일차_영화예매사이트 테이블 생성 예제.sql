/*영화 티케 예메 사이트를 구축하기 위한 ERD를 설계하세요.
- CGV 참고
- 예매는 회원만
- 예매는 한번에 여러 좌석 가능
- 인물
  - 하나의 인물은 여러개의 영화에 출연 o
  - 인물번호(pk), 이름, 출생, 국적, 직업, 학력, 가족, 취미, 신체, 사이트, 바이오그래피 등
  - 가족을 테이블로 관리할 수 있지만 영화와 관련해서 배우 가족은 중요하지 않으므로 하나의 속성으로 관리
  - 학력은 최종학력만 기술
  - 취미도 테이블로 만들 수 있지만 속성으로 관리
  - 직업도 테이블로 만들 수 있지만 속성으로 관리
- 영화
  - 하나의 영화에 여러명의 인물 출연 o
  - 하나의 영화에 여러 장르 o
  - 주연, 조연 등의 세부사항은 표현x
  - 역할로 배우, 감독 구분 가능
  - 인물번호(pk), 제목, 연령, 런닝타임, 개봉일, 영화상세, 장르번호(fk)
- 영화 장르
  - 영화장르번호(pk), 영화번호(fk), 장르명(fk)
- 장르
  - 장르명(pk)
- 관람등급
  - 등급명(pk)
- 참여
  - 참여번호(pk), 영화번호(fk), 인물번호(fk), 역할
- 극장
  - 극장번호(pk), 지역, 지점명, 주소, 교통안내, 주차안내, 관 갯수, 총 좌석수
- 좌석
  - 좌석번호(pk), 좌석명, 극장번호(fk), 관번호, 좌석상태, 좌석타입
- 상영시간
  - 상영번호(pk), 영화번호(fk), 극장번호(fk), 상영날짜, 상영시간, 관번호, 옵션(2D,4D등), 총 좌석수, 예약가능좌석수
- 회원
  - 아이디(pk), 비밀번호, 기타 등
- 예매
  - 예매번호(pk), 아이디(fk), 상영번호(fk), [영화명]
- 예매리스트
  - 예매리스트번호(pk), 예매번호(fk), 좌석번호(fk)
  - 조조,심야 할인은 x
  - 예매번호는 ABCDE12345
  
*/
CREATE DATABASE cgv_khj;
USE cgv_khj;

DROP TABLE IF EXISTS `movie`;

CREATE TABLE `movie` (
	`mo_num`	int	NOT NULL,
	`mo_title`	varchar(50)	NULL,
	`mo_runtime`	int	NULL,
	`mo_date`	date	NULL,
	`mo_detail`	longtext	NULL,
	`mo_rt_name`	varchar(50)	NOT NULL
);

DROP TABLE IF EXISTS `movie_genre`;

CREATE TABLE `movie_genre` (
	`mg_num`	int	NOT NULL,
	`mg_mo_num`	int	NOT NULL,
	`mg_ge_name`	varchar(50)	NOT NULL
);

DROP TABLE IF EXISTS `genre`;

CREATE TABLE `genre` (
	`ge_name`	varchar(50)	NOT NULL
);

DROP TABLE IF EXISTS `rating`;

CREATE TABLE `rating` (
	`rt_name`	varchar(50)	NOT NULL
);

DROP TABLE IF EXISTS `character`;

CREATE TABLE `character` (
	`ch_num`	int	NOT NULL,
	`ch_name`	varchar(50)	NULL,
	`ch_birthday`	varchar(10)	NULL,
	`ch_nationality`	varchar(50)	NULL,
	`ch_job`	varchar(50)	NULL
);

DROP TABLE IF EXISTS `participation`;

CREATE TABLE `participation` (
	`pt_num`	int	NOT NULL,
	`pt_mo_num`	int	NOT NULL,
	`pt_ch_num`	int	NOT NULL,
	`pt_roll`	varchar(50)	NULL
);

DROP TABLE IF EXISTS `theater`;

CREATE TABLE `theater` (
	`th_num`	int	NOT NULL,
	`th_area`	varchar(50)	NULL,
	`th_name`	varchar(50)	NULL,
	`th_address`	varchar(50)	NULL,
	`th_traffic`	longtext	NULL,
	`th_parking`	longtext	NULL,
	`th_room_count`	int	NULL,
	`th_seat_coung`	int	NULL
);

DROP TABLE IF EXISTS `seat`;

CREATE TABLE `seat` (
	`st_num`	int	NOT NULL,
	`st_name`	char(3)	NULL,
	`st_th_num`	int	NOT NULL,
	`st_room_num`	int	NULL,
	`st_state`	varchar(50)	NULL,
	`st_type`	varchar(50)	NULL
);

DROP TABLE IF EXISTS `schedule`;

CREATE TABLE `schedule` (
	`sc_num`	int	NOT NULL,
	`sc_mo_num`	int	NOT NULL,
	`sc_th_num`	int	NOT NULL,
	`sc_date`	date	NULL,
	`sc_time`	varchar(10)	NULL,
	`sc_room_num`	int	NULL,
	`sc_option`	varchar(10)	NULL,
	`sc_total_seat`	int	NULL,
	`sc_seat`	int	NULL
);

DROP TABLE IF EXISTS `member`;

CREATE TABLE `member` (
	`me_id`	varchar(50)	NOT NULL,
	`me_pw`	varchar(255)	NULL
);

DROP TABLE IF EXISTS `ticketing`;

CREATE TABLE `ticketing` (
	`tk_num`	varchar(10)	NOT NULL,
	`tk_me_id`	varchar(50)	NOT NULL,
	`tk_sc_num`	int	NOT NULL
);

DROP TABLE IF EXISTS `ticketing_list`;

CREATE TABLE `ticketing_list` (
	`tl_num`	iint	NOT NULL,
	`tl_tk_num`	varchar(10)	NOT NULL,
	`tl_st_num`	int	NOT NULL
);

ALTER TABLE `movie` ADD CONSTRAINT `PK_MOVIE` PRIMARY KEY (
	`mo_num`
);

ALTER TABLE `movie_genre` ADD CONSTRAINT `PK_MOVIE_GENRE` PRIMARY KEY (
	`mg_num`
);

ALTER TABLE `genre` ADD CONSTRAINT `PK_GENRE` PRIMARY KEY (
	`ge_name`
);

ALTER TABLE `rating` ADD CONSTRAINT `PK_RATING` PRIMARY KEY (
	`rt_name`
);

ALTER TABLE `character` ADD CONSTRAINT `PK_CHARACTER` PRIMARY KEY (
	`ch_num`
);

ALTER TABLE `participation` ADD CONSTRAINT `PK_PARTICIPATION` PRIMARY KEY (
	`pt_num`
);

ALTER TABLE `theater` ADD CONSTRAINT `PK_THEATER` PRIMARY KEY (
	`th_num`
);

ALTER TABLE `seat` ADD CONSTRAINT `PK_SEAT` PRIMARY KEY (
	`st_num`
);

ALTER TABLE `schedule` ADD CONSTRAINT `PK_SCHEDULE` PRIMARY KEY (
	`sc_num`
);

ALTER TABLE `member` ADD CONSTRAINT `PK_MEMBER` PRIMARY KEY (
	`me_id`
);

ALTER TABLE `ticketing` ADD CONSTRAINT `PK_TICKETING` PRIMARY KEY (
	`tk_num`
);

ALTER TABLE `ticketing_list` ADD CONSTRAINT `PK_TICKETING_LIST` PRIMARY KEY (
	`tl_num`
);

ALTER TABLE `movie` ADD CONSTRAINT `FK_rating_TO_movie_1` FOREIGN KEY (
	`mo_rt_name`
)
REFERENCES `rating` (
	`rt_name`
);

ALTER TABLE `movie_genre` ADD CONSTRAINT `FK_movie_TO_movie_genre_1` FOREIGN KEY (
	`mg_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `movie_genre` ADD CONSTRAINT `FK_genre_TO_movie_genre_1` FOREIGN KEY (
	`mg_ge_name`
)
REFERENCES `genre` (
	`ge_name`
);

ALTER TABLE `participation` ADD CONSTRAINT `FK_movie_TO_participation_1` FOREIGN KEY (
	`pt_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `participation` ADD CONSTRAINT `FK_character_TO_participation_1` FOREIGN KEY (
	`pt_ch_num`
)
REFERENCES `character` (
	`ch_num`
);

ALTER TABLE `seat` ADD CONSTRAINT `FK_theater_TO_seat_1` FOREIGN KEY (
	`st_th_num`
)
REFERENCES `theater` (
	`th_num`
);

ALTER TABLE `schedule` ADD CONSTRAINT `FK_movie_TO_schedule_1` FOREIGN KEY (
	`sc_mo_num`
)
REFERENCES `movie` (
	`mo_num`
);

ALTER TABLE `schedule` ADD CONSTRAINT `FK_theater_TO_schedule_1` FOREIGN KEY (
	`sc_th_num`
)
REFERENCES `theater` (
	`th_num`
);

ALTER TABLE `ticketing` ADD CONSTRAINT `FK_member_TO_ticketing_1` FOREIGN KEY (
	`tk_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `ticketing` ADD CONSTRAINT `FK_schedule_TO_ticketing_1` FOREIGN KEY (
	`tk_sc_num`
)
REFERENCES `schedule` (
	`sc_num`
);

ALTER TABLE `ticketing_list` ADD CONSTRAINT `FK_ticketing_TO_ticketing_list_1` FOREIGN KEY (
	`tl_tk_num`
)
REFERENCES `ticketing` (
	`tk_num`
);

ALTER TABLE `ticketing_list` ADD CONSTRAINT `FK_seat_TO_ticketing_list_1` FOREIGN KEY (
	`tl_st_num`
)
REFERENCES `seat` (
	`st_num`
);

