package example.member.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import example.member.model.MemberVOList;

@Controller
public class ListPropertyController {
	@RequestMapping("multiInsert.do")
	public void test(MemberVOList memberList) {}
}
