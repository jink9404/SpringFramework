package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AutoScanController {

	@RequestMapping("/autoScan.do")
	public ModelAndView test() {
		System.out.println("autoScan.do 요청 들어옴");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("01_autoScan");
		
		return mv;
	}
}
