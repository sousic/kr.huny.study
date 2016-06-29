CREATE TABLE `tb_board` (
	`idx` BIGINT(20) NOT NULL,
	`parent_idx` BIGINT(20) NULL DEFAULT NULL,
	`title` VARCHAR(100) NOT NULL COLLATE 'utf8_bin',
	`contents` VARCHAR(4000) NOT NULL COLLATE 'utf8_bin',
	`hit_cnt` BIGINT(20) NOT NULL,
	`del_gb` VARCHAR(1) NOT NULL DEFAULT 'N' COLLATE 'utf8_bin',
	`crea_dtm` DATETIME NULL DEFAULT CURRENT_TIMESTAMP,
	`crea_id` VARCHAR(30) NOT NULL COLLATE 'utf8_bin',
	PRIMARY KEY (`idx`)
)
COLLATE='utf8_bin'
ENGINE=InnoDB
;
