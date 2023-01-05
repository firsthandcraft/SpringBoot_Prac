package com.study.springboot;

public class ChildAsianaTicket implements InterTicket {


	@Override
	public void InterTicketMethod(String interMS) {
		// TODO Auto-generated method stub
		System.out.println("Asiana::InterTicketMethod"+interMS);
	}

}
