package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.study.springbean.Config;
import com.study.springbean.SportCar;
import com.study.springbean.Truck;
//스프링 부트의 자동설정, 스프링 Bean 읽기와 생성을 모두 자동 설정됩니다.
@SpringBootApplication//자동 설정을 해주기 위한 어노테이션
public class Application {

	public static void main(String[] args) {
		 //1.Ioc컨테이너 생성
        //어플리케이션 컨텍스트(ApplicationContext):빈팩토리를 확장한 IOC컨테이너
        ApplicationContext context= 
          new AnnotationConfigApplicationContext(Config.class);
    
        SportCar Sports=(SportCar)context.getBean("Sports");
        Sports.go();
        
        Truck truck=context.getBean("hello",Truck.class);
        truck.go();

	
	}

}
