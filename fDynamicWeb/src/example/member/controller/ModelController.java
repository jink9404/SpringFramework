package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ModelController {
	@RequestMapping(value = "/model.do")
	public void xxxxx(Model m) {
		m.addAttribute("message", "ㅋㅋ루ㅋㅋ");
		m.addAttribute("addr", "가산");
	}
//	기본적으로 view로 데이터 넘기는법
//	1. ModelAndView 객체
//	2. Map 객체 (자바의 HashMap)
//	3. Model 객체 (return으로 넘기지 않고 parameter로 지정)
//	4. @ModelAttribute 이용
}
