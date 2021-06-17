package com.simple.controller;

import java.lang.reflect.Array;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.ScoreVO;
import com.simple.service.ScoreService;
import com.simple.service.ScoreServiceIMPL;

@Controller
//@RequestMapping("/service")
public class ScoreController {
//	2번방법
//	@Autowired
//	@Qualifier("ScoreService")
//	private ScoreService scoreService;
//	
	
	//3번쨰
	@Autowired
	@Qualifier("xxx")
	private ScoreService scoreService;
	
	
	@RequestMapping("/scoreList")
	public void scoreList(Model model) {
//		ArrayList<ScoreVO> list = scoreService.getList();
//		model.addAttribute("list",list);
		model.addAttribute("list",scoreService.getList());
		
	}
	@RequestMapping("/scoreResult")
	public void scoreResult() {
	}
	
	@RequestMapping("/scoreRegist")
	public void scoreRegist() {
	}
	
	@RequestMapping("/scoreDelete")
	public String scoreDelete(@RequestParam("num") int num, RedirectAttributes RA) {
		scoreService.delete(num);
		RA.addFlashAttribute("msg","삭제완료");
		return "redirect:/service/scoreList";
	}
	
	@RequestMapping("/regist")
	public String scoreRegist(ScoreVO vo) {
//		1번방법
//		ScoreService scoreServiceIMPL = new ScoreServiceIMPL();
		scoreService.regist(vo);
		return "service/scoreResult";
		
	}
	

}
