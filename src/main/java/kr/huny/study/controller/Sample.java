package kr.huny.study.controller;


import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.HashMap;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.google.gson.Gson;

import kr.huny.study.common.CommandMap;
import kr.huny.study.service.SampleService;
import kr.huny.study.vo.tbBoardVO;

@Controller
@RequestMapping("/sample")
public class Sample {
	Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@Resource(name="sampleService")
	private SampleService sampleService;
	
	@RequestMapping(value="/test", method = RequestMethod.GET)
	public void smapletest(Model model)
	{
		model.addAttribute("test","test");
		logger.debug("인터셉터 테스트");
	}
	
	@RequestMapping(value="/boardList", method = RequestMethod.GET )
	public void boardList(Model model)
	{	
		List<tbBoardVO> list = sampleService.selecdtBoardList();
		logger.debug(new Gson().toJson(list));		
		model.addAttribute("list", list);
	}
	
	@RequestMapping(value="/testMapResolver", method = RequestMethod.GET)
	public void testMapArgumentResolver(CommandMap map)
	{
		logger.debug("call testMapArgumentResover....");
		if(map.isEmpty() == false)
		{
			Iterator<Entry<String,Object>> iterator = map.getMap().entrySet().iterator();
			Entry<String, Object> entry = null;
			while(iterator.hasNext())
			{
				entry = iterator.next();				
				logger.debug("key : " + entry.getKey() + ", value : " + entry.getValue());
			}
		}
	}
	
	@RequestMapping(value="/boardWrite", method = RequestMethod.GET)
	public void openBoardWrite()
	{
		
	}
}
