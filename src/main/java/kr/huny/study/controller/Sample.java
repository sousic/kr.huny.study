package kr.huny.study.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import kr.huny.study.service.SampleService;
import kr.huny.study.vo.tbBoardVO;

@Controller
public class Sample {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	@RequestMapping(value="/sample/test", method = RequestMethod.GET)
	public void smapletest(Model model)
	{
		model.addAttribute("test","test");
		logger.debug("인터셉터 테스트");
	}
	
	@RequestMapping(value="/sample/boardList", method = RequestMethod.GET )
	public void boardList(Model model)
	{	
		List<tbBoardVO> list = sampleService.selecdtBoardList();
		logger.debug(new Gson().toJson(list));		
		model.addAttribute("list", list);
	}
}
