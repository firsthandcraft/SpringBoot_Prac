package com.example.demo.member;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemController {
	@Autowired
	private MemberService service;
	
	@GetMapping(value="/member/loginForm")
	public void loginForm() {
		
	}
	
	@RequestMapping(value="/member/joinForm")
	public void form(HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("idCheck",false);
	}
	
	@RequestMapping(value="/member/idCheck")
	public ModelAndView idCheck(HttpServletRequest req,@RequestParam(value="id")String id) {
		System.out.println("MemberController id:"+id);
		HttpSession session=req.getSession(false);
		ModelAndView mav= new ModelAndView("member/idCheck");
		String result="";
		Member m=service.getMember(id);
		if(m==null){
			result="사용가능";
			session.setAttribute("idCheck",true);
		} else {
			result="사용불가능";
			session.setAttribute("idCheck",false);
		}
		System.out.println(session.getAttribute("idCheck"));
		mav.addObject("result",result);
		return mav;
	}
	@RequestMapping(value="/member/join")
	public String join(Member m) {
		service.addMember(m);
		return "member.loginForm";
	}

	@RequestMapping(value="/member/login")
	public String login(HttpServletRequest req,Member m) {
		Member m2= service.getMember(m.getId());
		if(m2==null || !m2.getPwd().equals(m.getPwd())) {
			System.out.println("로그인 실패");
			return "member/loginForm";
		} else {
			HttpSession session = req.getSession();
			session.setAttribute("id",m2.getId());
			session.setAttribute("type",m2.getType());
			return "member/main";
		}
	}
	
	@RequestMapping(value="/member/editForm")
	public ModelAndView editForm(HttpServletRequest req) {
		ModelAndView mav=new ModelAndView("member/editForm");
		HttpSession session =req.getSession(false);
		String id=(String)session.getAttribute("id");
		Member m=service.getMember(id);
		mav.addObject("m",m);
		return mav;
	}
	@RequestMapping (value="/member/edit")
	public String edit(Member m) {
		service.editMember(m);
		return "mamber/main";
	}
	@RequestMapping (value="/member/logout")
	public String logout(HttpServletRequest req) {
		HttpSession session =req.getSession(false);
		session.removeAttribute("id");
		session.invalidate();
		return "mamber/loginForm";
	}
	@RequestMapping (value="/member/out")
	public String out(HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		String id= (String)session.getAttribute("id");
		service.delMember(id);
		session.removeAttribute("id");
		session.invalidate();
		return "mamber/loginForm";
	}
	@RequestMapping(value="/member/adminpage")
	public String adminPage() {
		return "member/adminPage";
	}
}
