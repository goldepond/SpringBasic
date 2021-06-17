package com.simple.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.omg.CORBA.Request;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.simple.command.ReqVo;
import com.simple.command.res_quiz01_command;

@Controller
@RequestMapping("/request") // 클래스의 requestMapping은 메서드의 오청경로를 묶어서사용
public class RequestController {

	@RequestMapping(value = "/req_ex01")
	public String req_ex01() {
		System.out.println("실행실행실행");
		return "request/req_ex01";
		// 나가는 경로는 view리저브가 관장
	}
//	
//	@RequestMapping(value ="/basic01", method = RequestMethod.GET)
//	public String basic01() {
//		System.out.println("ㅎGet방식");
//		return "request/req_ex01";
//		//나가는 경로는 view리저브가 관장
//	}
//	
//	@RequestMapping(value ="/basic02", method = RequestMethod.POST)
//	public String basic02() {
//		System.out.println("Post");
//		return "request/req_ex01";
//		//나가는 경로는 view리저브가 관장
//	}
//	
//	@RequestMapping(value ="/basic03")
//	public String basic03() {
//		System.out.println("Post");
//		return "request/req_ex01";
//		//나가는 경로는 view리저브가 관장
//	}

	@RequestMapping({ "/basic01", "/basic02", "/basic03" })
	public void basic() {
		System.out.println("123");

	}

	// ===========================================

	@RequestMapping("/req_ex02")
	public String req_ex02() {
		return "request/req_ex02";
	}

	// ===========================================

//	@RequestMapping("/param")
//	public String param(HttpServletRequest request) {
//		System.out.println(request.getParameter("id"));
//		return "request/req_ex2_result";
//	}

//	@RequestMapping("/param")
//	public String param(@RequestParam("id") String id , 
//						@RequestParam("pw") String pw ,
//						@RequestParam(value = "inter", required = false, defaultValue = "") ArrayList<String> inter) {
//		
//		System.out.println(id);
//		System.out.println(pw);
//		System.out.println(inter);
//		return "request/req_ex2_result";
//	}

	@RequestMapping("/param")
	public String param(ReqVo vo) {
		System.out.println(vo.toString());
		return "request/req_ex2_result";
	}

	// ===================================

	@RequestMapping("/req_quiz01")
	public String req_quiz01() {
		return "request/req_quiz01";
	}

	@RequestMapping("/quiz01")
	public String req_quiz01(@RequestParam(value = "id", required = false, defaultValue = "") String id,
			@RequestParam(value = "pw", required = false, defaultValue = "") String pw) {
		if (id.equals("abc123")  && pw.compareTo("xxx123") == 0) {
			return "request/req_quiz01_ok";

		} else {
			return "request/req_quiz01_no";

		}
	}
	// ===============================

	@RequestMapping("/res_quiz01")
	public String res_quiz01() {
		return "request/res_quiz01";
	}



}
