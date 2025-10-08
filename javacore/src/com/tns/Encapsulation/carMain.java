package com.tns.Encapsulation;

public class carMain {

	public static void main(String[] args) {
		car ob =new car();
		System.out.println(ob.color);
		System.out.println(ob.model);
		System.out.println(ob.numSeats);
		ob.start();
		ob.stop();
		ob.move();
		ob.drift();
		
		
	}

}
