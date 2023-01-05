package com.study.springboot;

public class ChildKalTicket implements InterTicket{

	@Override
	public void InterTicketMethod(String interMS) {
		// TODO Auto-generated method stub
		System.out.println("Kal::InterTicketMethod"+interMS);

	}

	
}
