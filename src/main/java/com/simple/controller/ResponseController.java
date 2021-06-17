package com.simple.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.simple.command.quiz02Vo;
import com.simple.command.res_quiz01_command;

@Controller
@RequestMapping("/response")
public class ResponseController {

	@RequestMapping("/res_ex01")
	public void res_ex01() {
		
	}
	
	@RequestMapping("/res_ex02")
	public String res_ex02(Model model) {
		model.addAttribute("servertime",new Date());
		model.addAttribute("name","고길동슬레쉬");
		return "response/res_ex02";
	}
	
	@RequestMapping("/res_ex03")
	public ModelAndView res_ex03() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("name","고길동슬레쉬");
		mv.addObject("servertime",new Date());
		mv.setViewName("response/res_ex03");
		return mv;
	}
	
	@RequestMapping("/res_ex04")
	public String res_ex04(@ModelAttribute("id") String a) {
		System.out.println(a);
		return "response/res_ex04";
	}
	@RequestMapping("/res_quiz01")
	public String res_quiz01() {
		return "response/res_quiz01";
	}
	@RequestMapping("/rsquiz01")
	public String rsquiz01(res_quiz01_command vo, RedirectAttributes RA) {

		if (vo.getId().equals("kim12")  && vo.getPw().equals("1234")) {
			return "response/res_quiz03";
		} else {
			return "response/res_quiz01";
			
			
//			RA.addFlashAttribute("msg", "아이디 비번확인요망");
//			return "redirect:/response/res_quiz01";//백투 로그인 화면
			//리다이렉트로 이동
			//redirect:/~~~~~~
			//다시 컨트롤러를 타서 넘어가는 절대경로 방식
			//RedirectAttribute 객체의 addFlashAttribute 를 이용합
		}
	}
	@RequestMapping("/res_redirect")
	public void res_redirect() {
		//자동으로 넘어가짐
	}
	//==================================================
	@RequestMapping("/quiz01")
	public void quiz01() {
		//자동으로 넘어가짐
	}
	
	@RequestMapping("/quiz01send")
	public String quiz01send( @ModelAttribute("year") String year,
							@ModelAttribute("month") String month,
							@ModelAttribute("day") String day) {
		
		return "response/quiz01_ok";
	}
	//==================================================
	@RequestMapping("/quiz02")
	public void quiz02() {
		//자동으로 넘어가짐
	}
	@RequestMapping("/join")
	public ModelAndView join(quiz02Vo vo) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("id",vo.getId());
		mv.addObject("pw",vo.getPw());
		mv.addObject("name",vo.getName());
		mv.addObject("email",vo.getEmail());
		mv.setViewName("response/quiz02_ok");
		return mv;
	}
	//==================================================
	
	@RequestMapping("/quiz03")
	public void quiz03() {
		//자동으로 넘어가짐
	}
	@RequestMapping("/quiz03_post")
	public String quiz03_post(	@ModelAttribute("id") String id	,
								@ModelAttribute("pw") String pw	,
								@ModelAttribute("pw_check") String pw_check	,
								 RedirectAttributes RA) 
	{
		if(id.equals(""))
		{
			RA.addFlashAttribute("msg", "아이디 확인요망");
			return "redirect:/response/quiz03";//백투 로그인 화면
		}
		else if(!pw.equals(pw_check))
		{
			RA.addFlashAttribute("msg", "비번확인랑 불일치");
			return "redirect:/response/quiz03";//백투 로그인 화면
		}
		return "response/quiz03_ok";
	}
	
}
