package com.example.demo.seller;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;


public interface ProductMapper {
	void insert(Product p);
	Product selectByNum(int num);
	List<Product> selectByName(String name);
	List<Product> selectByPrice(Map map);
	List<Product> selectBySeller(String seller_id);
	List<Product> selectByC1(int c1);
	List<Product> selectByC2(int c2);
	List<Product> selectByC3(int c3);
	List<Product> All();
	void update(Product p);
	void delete(int num);
	int getNum();
}
