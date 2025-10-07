package com.tns.polymorphism;

public class Overriden {
	
		public void demo()
		{
			System.out.println("This is parent class");
		}
	}
	class Demo extends Overriden{
		public void demo()
		{
			System.out.println("This is child class");
	}
}

