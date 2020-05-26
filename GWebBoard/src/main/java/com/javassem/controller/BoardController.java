package com.javassem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.javassem.domain.BoardVO;
import com.javassem.service.BoardService;

@Controller
public class BoardController {
	@Autowired
	private BoardService service;
	@RequestMapping(value = "/getBoardList.do")
	public void getBoardList(BoardVO vo, Model model){
		//검색 기능 때문에 BoardVO를 지정
		List<BoardVO> list = service.getBoardList(vo);
		model.addAttribute("boardList", list);
	}// view page : getBoardList.jsp
	
	
	@RequestMapping(value = "{step}.do")
	public String changePage(@PathVariable String step) {return step;}
	//화면만 전환하기위해서 생성함. 하는일 없는 함수를 생성하는것을 막기위해
	
	//@RequestMapping(value = "/insertBoard.do")
	//public void insertBoard() {	}	
	//view page : insertBoard.jsp

	@RequestMapping(value = "/saveBoard.do")
	public String saveBoard(BoardVO vo) {
		service.insertBoard(vo);
		return "redirect:getBoardList.do";
	}//view page : boardList.jsp
	//redirect : getBoardList.do
	
	@RequestMapping(value = "/getBoard.do")
	public void getBoard(BoardVO vo,Model m) {
		m.addAttribute("board", service.getBoard(vo));
	}
	
	@RequestMapping(value = "/deleteBoard.do")
	public String deleteBoard(BoardVO vo) {
		service.deleteBoard(vo);
		return "redirect:getBoardList.do";
	}
	
	@RequestMapping(value = "/updateBoard.do")
	public String updateBoard(BoardVO vo) {
		service.updateBoard(vo);
		return "redirect:getBoardList.do";
	}
}
