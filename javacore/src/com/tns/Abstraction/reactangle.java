package com.tns.Abstraction;

public class reactangle extends shape {
	private int height =5,width=3;
	public  reactangle(int height,int width) {
		this.width=width;
		this.height=height;
	}
	void calarea() {
		super.area= height * width;
	}
} 
	


