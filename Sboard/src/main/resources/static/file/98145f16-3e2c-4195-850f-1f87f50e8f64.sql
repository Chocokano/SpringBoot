select count(`uid`) from `km_member` where `uid`='dd';kmarket

ALTER TABLE `user2` ADD COLUMN `rdate` DATETIME;
 AFTER `uid`;
SELECT SHA2('1234', 256);

CREATE TABLE `weather`(

	`col1` VARCHAR(10) COMMENT '지역명',
	`col2` VARCHAR(10) COMMENT '현재일기',
	`col3` VARCHAR(10) COMMENT '시정km',
	`col4` TINYINT COMMENT '운량1/10',
	`col5` TINYINT COMMENT '중하운량',
	`col6` FLOAT COMMENT '현재기온',
	`col7` FLOAT COMMENT '이슬점온도',
	`col8` FLOAT COMMENT '체감온도',
	`col9` FLOAT COMMENT '일강수mm',
	`col10` FLOAT COMMENT '적설cm',
	`col11` TINYINT COMMENT '습도 %',
	`col12` VARCHAR(10) COMMENT '풍향',
	`col13` FLOAT COMMENT '풍속m/s',
	`col14` FLOAT COMMENT '해면기압',
	`rdate` DATETIME
);