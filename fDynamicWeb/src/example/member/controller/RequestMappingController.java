package example.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import example.member.model.MemberVO;

@Controller
@RequestMapping("/board")
public class RequestMappingController {
	
	@RequestMapping(value = {"/a.do","b.do"})
	public String test() {
		System.out.println("a.do와 b.do 요청합니다");
		return "hello";
	}
	//**** return이 String인 경우 : View page 지정
	
	@RequestMapping(value = "/c.do", params = {"id=kim"}) //주소 c.do?id=kim인경우만 맵핑
	public void test2(String id) {
		System.out.println("c.do 요청 ["+id+"]");
	}
	//**** return이 void인 경우 : Request 요청과 동일 이름의  뷰페이지를 지정됨.
	@RequestMapping(value = "/request.do",method = RequestMethod.POST, produces="text/plain;charset=UTF-8")//method가 POST인 경우만처리
	// web.xml변경 후에도 method가 post 인경우 한글깨짐 처리
	public void test3(MemberVO vo) {
		System.out.println("request.do 요청 :"+ vo.getName());
	}
}
