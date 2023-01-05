package com.example.demo.join;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class MemberController {
	@Autowired
	private MemberService service;
	
	@GetMapping("/member/join")
	public void joinForm(){
		
	}
	@PostMapping("/member/join")
	public String join(Member m){
		service.addMember(m);
		return "redirect:/member/login";
	}
	
	@GetMapping("/member/login")
	public void loginForm(){
		
	}
	@PostMapping("/member/login")
	public String login(HttpServletRequest req, @RequestParam("pwd") String pwd,Map<String,Boolean> map){
		String id=req.getParameter("id");
		Member m=service.getMember(id);
		HttpSession session = req.getSession();
		String result="";
		if(m !=null&&pwd.equals(m.getPwd())) {
			 session.setAttribute("id",id);
			 result="redirect:/member/result";
			 map.put("result", true);
		} else {
			result="redirect:/member/login";
			 map.put("result", false);
		}
		
		return result;
	}
	
	@GetMapping("/member/edit")
	public ModelAndView editForm(HttpServletRequest req) {
		HttpSession session = req.getSession(false);
		String id = (String) session.getAttribute("id");
		Member m = service.getMember(id);
		ModelAndView mav = new ModelAndView("member/deit");
		mav.addObject("m",m);
		return mav;
	}
	
	@RequestMapping("/member/logout")
	public String logout(HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		session.removeAttribute("id");
		session.invalidate();
		return "redirect:/member/login";
	
	}
	@RequestMapping("/member/out")
	public String out(HttpServletRequest req) {
		HttpSession session=req.getSession(false);
		String id=(String)session.getAttribute("id");
		service.delMember(id);
		return "redirect:/member/logout";
	
	}
	
	
}