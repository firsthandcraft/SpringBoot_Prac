package com.study.springboot;

public class PrinterA implements Printer{

	@Override
	public void print(String message) {
		// TODO Auto-generated method stub
		System.out.println("PrinterA:" +message);
	}

}
