package com.study.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration //스프링 설정으로 사용됨을 의미
public class Config {
	//빈 (bean) :Spring이 IoC 방시긍로 관리하는 객체
    //빈 팩토리(BeanFactory>: 스프링 Ioc를 당담하는 핵심 컨테이너
    //어플리케이션 컨텍스트(ApplicationContexts):빈팩토리를 확장한Ioc컨테이너
    @ Bean
    public Member member1() {
        //setter 메서드를 이용한 의존성 주입
        Member member1=new Member();
        member1.setName("홍길동");
        member1.setNickname("도사");
        member1.setPrinter(new PrinterA());
        return member1;
    }
    
    @Bean(name="hello")
    public Member member2() {
        //Constructor Injection(생성자를 이용한 의존성 주입)
        return new Member("박소영","배혀누",new PrinterA());
    }
    
    
    @Bean
    public PrinterB printerB() {
        return new PrinterB();
    }
}

