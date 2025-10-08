package com.tns.interfaceDemo;

public interface inhInf extends nestInf {
	 public void display();
}
class impcls implements inhInf {
	public void show() {
		System.out.println("this is show method");
	}
	public void display() {
		System.out.println("this is display method");
	}
}
