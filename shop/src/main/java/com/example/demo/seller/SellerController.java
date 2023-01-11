package com.example.demo.seller;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.admin.AdminService;
import com.example.demo.order.OrderService;

@Controller
public class SellerController {

	@Autowired 
	private SellerService service;
	public static String basePath="C:\\shopimg\\";
	
	@RequestMapping (value="/seller/myList")
	public ModelAndView myList(HttpServletRequest req) {
		ModelAndView mav=new ModelAndView("member/prodPage");
		HttpSession session =req.getSession(false);
		String seller_id=(String)session.getAttribute("id");
		ArrayList<Product> list= (ArrayList<Product>)service.getProductBySellerId(seller_id);
		mav.addObject("list",list);
		return mav;
	}
	@RequestMapping(value="/seller/form")
	public void form() {
		
	}
}
