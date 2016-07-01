package kr.huny.study.dao;

	import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDAO<T> {	
	@Autowired
	SqlSession session;
	
	public List<T> selectList(String queryId) {
		return session.selectList(queryId);
	}
}
