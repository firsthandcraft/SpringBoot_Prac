package com.study.springboot;


public class Member {
	private String Member1;
	private String Member2;
	private InterTicket interMemberTicket;
	public Member(String member1, String member2, InterTicket interMemberTicket) {
		super();
		Member1 = member1;
		Member2 = member2;
		this.interMemberTicket = interMemberTicket;
	}
	public Member() {
		super();
	}
	public String getMember1() {
		return Member1;
	}
	public void setMember1(String member1) {
		Member1 = member1;
	}
	public String getMember2() {
		return Member2;
	}
	public void setMember2(String member2) {
		Member2 = member2;
	}
	public InterTicket getInterMemberTicket() {
		return interMemberTicket;
	}
	public void setInterMemberTicket(InterTicket interMemberTicket) {
		this.interMemberTicket = interMemberTicket;
	}
	@Override
	public String toString() {
		return "Member [Member1=" + Member1 + ", Member2=" + Member2 + ", interMemberTicket=" + interMemberTicket + "]";
	}
	//메소드 지정 
	public void membermethod() {
		interMemberTicket.InterTicketMethod("Member1"+Member1+"Member2"+Member2);
	}
}
