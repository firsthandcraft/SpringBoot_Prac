package com.example.demo.admin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {
	@Autowired
	private CategoryMapper mapper;
	
	public void addCategory(Category c, int type) {
		switch(type) {
		case 1:
			mapper.insertC1(c);
			break;
		case 2:
			mapper.insertC2(c);
			break;
		case 3:
			mapper.insertC3(c);
			break;
		}
	}
	public void getAll(int type, int p_id) {
		List list =null;
		
		switch(type) {
		case 1:
			list=mapper.seleteAllC1();//대분류
			break;
		case 2:
			list=mapper.selectAllC2(p_id);//중분류
			break;
		case 3:
			list=mapper.selectAllC3(p_id);//소분류
			break;
		}
	}
	public Category getCategory(int type, int id) {
		Category category =null;
		
		switch(type) {
		case 1:
			category=mapper.selectC1(id);//대분류
			break;
		case 2:
			category=mapper.selectC2(id);//중분류
			break;
		case 3:
			category=mapper.selectC3(id);//소분류
			break;
		}
		return category;
	}
	
}
