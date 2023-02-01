package com.study.demo.controller;

import java.lang.reflect.Member;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class myController {

	  @RequestMapping("/")
	    public @ResponseBody String root() throws Exception{
	        return "Form데이터 전달받아 사용하기";
	    }
	    
	    @RequestMapping("/test1")
	    public String test1(HttpServletRequest httpServletRequest,Model model) {//test1?id=qqq&name=ttt
	        String id=httpServletRequest.getParameter("id");
	        String name=httpServletRequest.getParameter("name");
	        model.addAttribute("id",id);
	        model.addAttribute("name",name);
	        return "test1";
	    }
	    
	    @RequestMapping("/test2")
	    public String test1(@RequestParam("id")String id,@RequestParam("name")String name, Model model) {
	        //단점 파라미터가 많아지면 불편
	        model.addAttribute("id",id);
	        model.addAttribute("name",name);
	        return "test2";
	    }
	    
	    @RequestMapping("/test3")
	    public String test3(Member member,Model model) {
	        //파라미터와 일치하는 빈을 만들어서 사용할 수 있다. 
	        //View페이지에서 model을 사용하지 않고 member를 사용한다. 
	        return "test3";
	    }
	    
	    @RequestMapping("/test4/{studentid}/{name}")
	    public String test4(@PathVariable("id")String studentid,@PathVariable("name")String name,Model model) {
	        //PathVariable 패스 자체에 변수를 넣어 줄수도 있다.
	        
	        //test4/34/sss --> 아이디 이름 
	        model.addAttribute("id",studentid);
	        model.addAttribute("name",name);
	        return "test4";
	    }

}
