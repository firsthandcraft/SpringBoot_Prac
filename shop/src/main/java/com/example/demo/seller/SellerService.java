package com.example.demo.seller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {

	@Autowired
	private ProductMapper mapper;
	public void addProduct(Product p) {
		mapper.insert(p);
	}
	public Product getProductByNum(int num) {
		return mapper.selectByNum(num);
	}
	public List<Product> getProductByName(String name){
		return mapper.selectByName(name);
	}
	public List<Product> getProductByPrice(int min,int max){
		Map map = new HashMap();
		map.put("min",min);
		map.put("max",max);
		return mapper.selectByPrice(map);
	}
	public List<Product> getProductBySellerId(String seller_id){
		return mapper.selectBySeller(seller_id);
	}
	public List<Product> getProductByC1(int c1){
		return mapper.selectByC1(c1);
	}
	public List<Product> getProductByC2(int c2){
		return mapper.selectByC1(c2);
	}
	public List<Product> getProductByC3(int c3){
		return mapper.selectByC1(c3);
	}
	public List<Product> getProductAll(){
		return mapper.All();
	}
	
	public void editProduct(Product p) {
		mapper.update(p);
	}
	public void delProduct(int num) {
		mapper.delete(num);
	} 
	public int getNum() {
		return mapper.getNum();
	}
}
