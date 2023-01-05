package com.study.springboot;

public class Member {
	private String name;
	private String nickname;
	private Printer  printer;

    //생성자, setget 만들기
    
    public Member(String name, String nickname, Printer printer) {
        super();
        this.name = name;
        this.nickname = nickname;
        this.printer = printer;
    }

    public Member() {
        super();
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
    //메소드 지정
    public void print() {
        printer.print("hello"+name+":"+nickname);
    }

}
