package com.study.springboot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
	@Bean
	public Member configMember1() {
		Member interticket=new Member();//멤버 생성
		interticket.setMember1("이코노미미미   ");
		interticket.setMember2("퍼스트트트   ");
		interticket.setInterMemberTicket(new ChildAsianaTicket());
		return interticket;
	}
	
	@Bean(name="understand")
	public Member configunderstand() {
		Member member = new Member();
		member.setMember1("이거는 member1      ");
		member.setMember2("저거는 member2       ");
		member.setInterMemberTicket(new ChildKalTicket());
		return member;
	}
	
	@Bean
	public ChildKalTicket KalTicket() {
		return new ChildKalTicket();
	}
}
