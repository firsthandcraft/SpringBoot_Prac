package com.study.springbean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// 클래스가 스프링 빈 설정클래스임을 의미한다. 
//사용됨을 의미
//@ComponentScan이 처리될때 자신뿐아니라 이클래스의 @Bean으로 설정된 모든 빈들도 초기화 진행
public class Config {//Config==Service와 같은거
	@Bean
	//@Bean : Spring이 Ioc(제어의 역전) 방식으로 관리하는 객체
	//@Bean: 스프링 컨테이너가 생성해준 자바 객체
	//ApplicationContext:빈팩토리를 확장한 IOC 컨테이너
	//* IOC 컨테이너는 스프링에서 쓰이는 여러 객체들을 생성, 관리하는 객체 ,Bean이라는 인스턴스 형태로 관리)
	public SportCar Sports() {
		SportCar Sports=new SportCar();//SportCar.java 생성
		Sports.go();//syso : SportsCar go...이 출력될것임
		return Sports;
	}
	
	@Bean(name="hello")
	//name을 넣은다면 반드시 메인에 Truck.class를 넣어야한다.
	//즉 메인에   Truck truck=context.getBean("hello",Truck.class); 요렇게
	public Truck truck() {
        Truck truck=new Truck();//Truck.java 생성
        truck.go();//syso : Truck go...이 출력될것임
        return truck;
    };
    
    

}
