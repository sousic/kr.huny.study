package kr.huny.study.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import kr.huny.study.dao.SampleDAO;
import kr.huny.study.vo.tbBoardVO;

@Service("sampleService")
public class SampleServiceImpl implements SampleService {
	Logger log = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="sampleDAO")
	private SampleDAO sampleDAO;
		
	@Override
	public List<tbBoardVO> selecdtBoardList() {
		// TODO Auto-generated method stub
		try {
			return sampleDAO.selectBoardList();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

}
