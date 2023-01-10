package com.example.demo.member;

import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/member")
public class MemberController {

	@Autowired
	private MemberService service;
	
	@GetMapping("/join")//웹 브라우저에 /member/join으로 검색해야함
	public String joinForm() {
		return "member/join";
	}
	@PostMapping("/join")
	public String join(@ModelAttribute("m") Member m) {
	//@ModelAttribute  :메서드 변수안 또는 위의 처럼 매서드안 속성으로 (메서드 위에) 기술되어 특정 객체를 Model객체로 등록하여 
	//jsp 와 같은 view 에서 사용가능 하도록 하는 Annotation
	//	public String join(@ModelAttribute("m") Member m) { ->이런식으로 
	//== requestgetparameter 와 같다. 
	//@ModelAttribute("m") "m"을 찾아서 Member m에 넣는다. 
		return "member/join_result";
	}
	
	@GetMapping("/login")//웹 브라우저에 /member/login으로 검색해야함
	public String loginForm() {
		return "member/login";
	}
	@PostMapping("/login")
	public void login(String id, String pwd) {
		System.out.println("id : "+id);
		System.out.println("pwd : "+pwd);
		//로그인 form에서 입력한 값이 콘솔에 나온다. 
	}
	
	@RequestMapping("/getstr")///문자열 하나 반환하기 위해 
	public void getstr(Map map) {
		String str=service.getStr();
		Member m = service.getMember();
		map.put("str", str);
		map.put("m",m);
	}
	@RequestMapping("/getmembers")//data 검색하기 
	public ModelAndView getMembers(){//ModelAndView 모델과 뷰를 담은것 클라이언트에게 공유하는것
		ModelAndView mav  =new ModelAndView("member/list");
		ArrayList<Member> list = service.getAll();
		//addObject : attributename과 attributeobject를 가져온다. 
		mav.addObject("list", list);
		return mav;
	}
}
