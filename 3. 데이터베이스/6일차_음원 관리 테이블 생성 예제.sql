/*음원을 관리하는 사이트를 구축하려 한다. 이 때 필요한 ERD를 설계하세요.
- 멜론, 지니 등을 참고
- 각자 제한 조건을 기술하고, 해당 제한 조건에 맞는 ERD를 설계
- 음원
  - 노래 하나하나
- 앨범
  - 여러 음원이 하나로 묶여 있는 테이블
- 아티스트
  - 가수 개인
- 그룹
  - 앨범을 발매할 때 포함되는 아티스트로, 솔로도 그룹으로 포함
- 결제는x
- 회원 등급x
*/

CREATE TABLE `member` (
	`me_id`	varchar(20)	NOT NULL,
	`me_pw`	varchar(255)	NULL,
	`me_name`	varchar(20)	NULL,
	`me_phone`	varchar(13)	NULL,
	`me_gender`	varchar(10)	NULL
);

CREATE TABLE `album` (
	`al_num`	varchar(50)	NOT NULL,
	`al_name`	varchar(50)	NULL,
	`al_group`	varchar(50)	NULL,
	`al_like`	int	NULL,
	`al_date`	varchar(50)	NULL
);

CREATE TABLE `artist` (
	`ar_num`	varchar(50)	NOT NULL,
	`ar_name`	varchar(50)	NULL,
	`ar_agency`	varchar(50)	NULL,
	`ar_type`	varchar(10)	NULL
);

CREATE TABLE `chart` (
	`ch_rank`	int	NOT NULL,
	`ch_ar_num`	varchar(50)	NOT NULL,
	`ch_so_num`	varchar(50)	NOT NULL
);

CREATE TABLE `song` (
	`so_num`	varchar(50)	NOT NULL,
	`so_al_num`	varchar(50)	NOT NULL,
	`so_name`	varchar(50)	NULL,
	`so_group`	varchar(50)	NULL,
	`so_like`	int	NULL
);

CREATE TABLE `playlist` (
	`ls_num`	int	NOT NULL,
	`ls_me_id`	varchar(20)	NOT NULL,
	`ls_name`	varchar(50)	NULL,
	`ls_list`	varchar(50)	NULL,
	`ls_so_num`	varchar(50)	NOT NULL
);

ALTER TABLE `member` ADD CONSTRAINT `PK_MEMBER` PRIMARY KEY (
	`me_id`
);

ALTER TABLE `album` ADD CONSTRAINT `PK_ALBUM` PRIMARY KEY (
	`al_num`
);

ALTER TABLE `artist` ADD CONSTRAINT `PK_ARTIST` PRIMARY KEY (
	`ar_num`
);

ALTER TABLE `chart` ADD CONSTRAINT `PK_CHART` PRIMARY KEY (
	`ch_rank`
);

ALTER TABLE `song` ADD CONSTRAINT `PK_SONG` PRIMARY KEY (
	`so_num`
);

ALTER TABLE `playlist` ADD CONSTRAINT `PK_PLAYLIST` PRIMARY KEY (
	`ls_num`
);

ALTER TABLE `chart` ADD CONSTRAINT `FK_artist_TO_chart_1` FOREIGN KEY (
	`ch_ar_num`
)
REFERENCES `artist` (
	`ar_num`
);

ALTER TABLE `chart` ADD CONSTRAINT `FK_song_TO_chart_1` FOREIGN KEY (
	`ch_so_num`
)
REFERENCES `song` (
	`so_num`
);

ALTER TABLE `song` ADD CONSTRAINT `FK_album_TO_song_1` FOREIGN KEY (
	`so_al_num`
)
REFERENCES `album` (
	`al_num`
);

ALTER TABLE `playlist` ADD CONSTRAINT `FK_member_TO_playlist_1` FOREIGN KEY (
	`ls_me_id`
)
REFERENCES `member` (
	`me_id`
);

ALTER TABLE `playlist` ADD CONSTRAINT `FK_song_TO_playlist_1` FOREIGN KEY (
	`ls_so_num`
)
REFERENCES `song` (
	`so_num`
);

