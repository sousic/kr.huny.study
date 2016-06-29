package kr.huny.study.vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@ToString
@Data
public class tbBoardVO {
	private long idx;
	private long parent_idx;
	private String title;
	private String contents;
	private long hit_cnt;
	private String del_gb;
	private Date crea_dtm;
	private String crea_id;
}
