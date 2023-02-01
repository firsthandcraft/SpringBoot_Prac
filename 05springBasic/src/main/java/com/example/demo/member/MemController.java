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
@RequestMapping("/member") //현재 컨트롤러의 공통 패스
public class MemController {

	@Autowired  //의존성 자동 주입
	private MemberService service;
	
//	@RequestMapping("/member/join")//요청 url등록
//	public String joinForm() {//뷰 페이지 경로 반환
//		return "member/join";
//	}
		
//	@RequestMapping("/member/join")//요청 url등록. 전송방식은 get, post 다 됨
//	public void joinForm() {//리턴값이 void이면 요청 url과 동일한 뷰 페이지로 처리
//	}
	
	@GetMapping("/join")//웹 브라우저에 /member/join 실행
	public void joinForm() {

	}
	
//	@PostMapping("/member/join")//회원가입 폼에서 가입 버튼 누르면 실행
//	public String join(Member m) {//m: 커맨드 객체. 입력폼의 값을 담아옴.자동으로 뷰페이지에 전달. 이름은 소문자 클래스명.
//		return "member/join_result";
//	}
	
	@PostMapping("/join")//회원가입 폼에서 가입 버튼 누르면 실행
	public String join(@ModelAttribute("m") Member m) {//@ModelAttribute: 커맨드 객체를 뷰페이지에서 부를 이름 지정
		return "member/join_result";
	}
	
	@GetMapping("/login")
	public void loginForm() {
		
	}
	
	@PostMapping("/login")
	public void login(String id, String pwd) {
		System.out.println(id);
		System.out.println(pwd);
	}
	
	@RequestMapping("/getstr")
	public void getstr(Map map) {//requestmapping되는 메서드의 파라메터가 커맨드 객체, Map, ModelMap이면 자동으로 뷰 페이지로 전달
		//Map x = new HashMap();//뷰 페이지에 전달 안됨
		String str = service.getStr();
		Member m = service.getMember();
		map.put("str", str);
		map.put("m", m);
	}
	
	@RequestMapping("/getmembers")
	public ModelAndView getmembers() {
		//ModelAndView mav = new ModelAndView();  //ModelAndView: 뷰페이지에 전달할 데이터와 뷰 페이지 경로 지정
		ModelAndView mav = new ModelAndView("member/list");
		ArrayList<Member> list = service.getAll();
		mav.addObject("list", list);
		return mav;
	}
	
}
