package kr.huny.study.dao;

import java.util.List;

import kr.huny.study.vo.tbBoardVO;

public interface SampleDAO {
	
	public List<tbBoardVO> selectBoardList()  throws Exception;
}
