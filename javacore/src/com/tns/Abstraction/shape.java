package com.tns.Abstraction;

public abstract class shape {
	protected float area ;
	abstract  void calarea();
	public void show (){
		System.out.println("The area of the given shape is "+ area);
	}
}