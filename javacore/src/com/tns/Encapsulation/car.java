package com.tns.Encapsulation;

public class car {
	String color = "Blue";
	String model="SUV";
	int numSeats = 7;
	public void start () {
		System.out.println("engine is ON");
	}
	public void stop() {
		System.out.println("engine is OFF");
	}
	public void move() {
		System.out.println("Car is moving");
	}
	public void drift() {
		System.out.println("Car is drifting");
	}

}
