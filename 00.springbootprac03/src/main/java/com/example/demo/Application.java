package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.Config;
import com.study.springboot.InterTicket;
import com.study.springboot.Member;



@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		ApplicationContext context= new AnnotationConfigApplicationContext(Config.class);
		Member airplanh=(Member)context.getBean("configMember1");
		airplanh.membermethod();
		
		Member member =(Member)context.getBean("understand");
		member.membermethod();
		
		InterTicket inter =context.getBean("KalTicket",InterTicket.class);
		member.setInterMemberTicket(inter);
		System.out.println("member.setInterMemberTicket(inter);");
		System.out.println("---");
		member.membermethod();
		
	}

}
