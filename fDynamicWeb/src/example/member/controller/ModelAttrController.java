package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import example.member.model.MemberVO;

@Controller
public class ModelAttrController {
	@ModelAttribute("message")
	public String abc() {
		return "오늘은 어디까지 하실?";
	}
	@ModelAttribute("memberVO")
	public MemberVO cba() {
		MemberVO vo = new MemberVO();
		vo.setId("0001");
		vo.setName("홍길동");
		vo.setAge(33);
		return vo;
	}
	
	@RequestMapping("/modelAttr.do")
	public String test() {
		return "modelAtttribute";
	}
}
