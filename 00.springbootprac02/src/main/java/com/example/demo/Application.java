package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springboot.Config;
import com.study.springboot.Member;
import com.study.springboot.Printer;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);
		  ApplicationContext context=new AnnotationConfigApplicationContext(Config.class);
	        Member member1=(Member)context.getBean("member1");
	        member1.print();
	        //3.Member Bean 가져오기
//	      Member member2=(Member)context.getBean("hello",Member.class);
	        Member member2=(Member)context.getBean("hello");
	        member2.print();
	        //4.PrinterB Bean 가져오기
    Printer printer=context.getBean("printerB",Printer.class);
//	      Printer printer=context.getBean("printerB"); --> 하면오류남
	   //     Printer printer=(Printer)context.getBean("printerB");
	        member1.setPrinter(printer);
	        member1.print();
//	      console결과
//	      PrinterA :hello홍길동:도사
//	      PrinterA :hello전우치:도사
//	      PrinterB :hello홍길동:도사

	}

}
