package kr.huny.study.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.huny.study.vo.tbBoardVO;	

@Repository("sampleDAO")
public class SampleDAOImpl extends AbstractDAO<tbBoardVO> implements SampleDAO {
	
	@Autowired
	SqlSession session;
	
	protected String namespace = "kr.huny.study.mapper.sampleMapper.";

	@Override
	public List<tbBoardVO> selectBoardList() throws Exception {
		// TODO Auto-generated method stub
		return selectList(namespace + "selectBoardList");
	}
}
