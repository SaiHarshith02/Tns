package com.tns.Abstraction;

public class square extends shape {
	private int side =2;
	public  square(int side) {
		this.side=side;
	}
	void calarea() {
		super.area= side * side;
	}
}
