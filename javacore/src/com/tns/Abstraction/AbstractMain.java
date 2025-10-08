package com.tns.Abstraction;

public class AbstractMain {

	public static void main(String[] args) {
		square sq =new square(8);
		sq.calarea();
		sq.show();
		reactangle r= new reactangle(4,3);
		r.calarea();
		r.show();
	}

}
