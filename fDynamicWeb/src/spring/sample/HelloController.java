package spring.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController{
	
	@RequestMapping("/start.do")
	public ModelAndView start() {
		System.out.println("start 요청 되었습니다.");
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("hello");  // /WEB-INF/common-servlet.xml에서 앞에 경로와 확장자를 붙여줌
								  // mv.setViewName("/WEB-INF/springConfig/hello.jsp")
		mv.addObject("message", "즐거운 스프링");
		
		return mv;
	}
}
