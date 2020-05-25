package spring.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController{
	
	@RequestMapping("/start.do")
	public void start() {
		System.out.println("start 요청 되었습니다.");
	}
}
