package kr.co.mlec.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import framework.ModelAndView;
import framework.RequestMapping;
import kr.co.mlec.jspboard.service.BoardService;
import kr.co.mlec.jspboard.service.BoardServiceImpl;

@Controller("kr.co.mlec.test.TestController")
public class TestController
{
	@Autowired
	private BoardService service;
	public TestController()
	{
		this.service = new BoardServiceImpl();
	}
	
	@RequestMapping("/test/list.do")
	public ModelAndView gogogo(String msg) throws Exception
	{
		ModelAndView mav = new ModelAndView("/test/list.jsp");
		mav.addAttribute("msg", msg);
		return mav;
	}
}
