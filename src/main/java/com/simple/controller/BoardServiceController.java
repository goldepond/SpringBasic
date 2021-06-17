package com.simple.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.BoardVO;
import com.simple.service.BoardService;


@Controller
@RequestMapping("/service")
public class BoardServiceController {

	@Autowired
	@Qualifier("BoardService")
	private BoardService boardService;

	@RequestMapping("/boardList")
	public void boardList(Model model) {
		model.addAttribute("list",boardService.getList());
	}

	@RequestMapping("/boardResult")
	public void boardResult() {
	}

	@RequestMapping("/boardRegister")
	public void boardRegister() {
	}
	@RequestMapping("/boardDelete")
	public String boardDelete(@RequestParam("num") int num, RedirectAttributes RA) {
		boardService.boardDelete(num);
		return "redirect:/service/boardList";
	}
	@RequestMapping("/boardForm")
	public String  AboardRegister(BoardVO vo) {
		boardService.boardRegist(vo);
		return "service/boardResult";
	}
}
