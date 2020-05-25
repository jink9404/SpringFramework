package example.member.controller;

import java.io.InputStream;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import example.member.model.Member;

@Controller
public class ParamController {
	@RequestMapping("/param.do")
	public String test(@RequestParam(value = "id") String userId,
						@RequestParam(defaultValue = "0") int age) {
		System.out.println("param.do 요청 : "+ userId);
		return "04_param";
	}
	@RequestMapping("/paramForm.do")
	public String test1(@ModelAttribute("vo") Member vo,HttpSession session) {
		//Member vo라고 변수를 선언하면 vo는 현재 메소드 안에서 vo 사용가능
		//다른 영역에서는 스프링이 지정한 변수명으로만 사용가능
		//클래스명과 동일하고 첫글자가 소문자임
		
		//실제 데이터 연결 값
		String userId = "MJ";
		String userPw = "0413";
		
		if(vo.getId().equals(userId) && vo.getPass().equals(userPw)) {
			//로그인 성공
			session.setAttribute("login", userId);
		}
		return "04_paramResult";
	}
}
