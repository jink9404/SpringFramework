package com.javassem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

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
	}


}
