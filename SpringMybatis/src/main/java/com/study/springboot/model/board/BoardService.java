package com.study.springboot.model.board;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardService {
	@Autowired
	private BoardMapper mapper;
	
	public void addBoard(Board b){
		mapper.insert(b);
	}
	public Board getById(int num){
		return mapper.selectById(num);
	}
	public ArrayList<Board> getByWriter(String writer){
		return mapper.selectByWriter(writer);
	}
	public ArrayList<Board> getByTitle(String title){
		return mapper.selectByTitle(title);
	}
	public ArrayList<Board> getAll(){
		return mapper.select();
	}
	public void editBoard(Board b){
		mapper.update(b);
	}
	public void delBoard(int num){
		mapper.delete(num);
	}
}
