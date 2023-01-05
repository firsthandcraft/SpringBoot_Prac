package com.study.springboot;

public class PrinterC implements Printer{

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		System.out.println("PrinterC : " + message);
	}

}
