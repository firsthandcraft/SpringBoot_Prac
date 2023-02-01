package com.example.demo.member;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

@Service // 이 클래스가 서비스임
public class MemberService {
	
	public String getStr() {//문자열 하나 반환
		return "hello data";
	}

	public ArrayList<Member> getAll() {//전체 검색
		ArrayList<Member> list = new ArrayList<>();
		list.add(new Member("aaa", "111", "namea", "aaa@email.com"));
		list.add(new Member("bbb", "222", "nameb", "bbb@email.com"));
		list.add(new Member("ccc", "333", "namec", "ccc@email.com"));
		return list;
	}

	public Member getMember() {//하나 검색
		return new Member("ccc", "333", "namec", "ccc@email.com");
	}
}
