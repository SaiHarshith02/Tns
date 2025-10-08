package com.tns.interfaceDemo;

public interface basicInterface {
	int x=10;
	public void show();
}
	class implClass implements basicInterface {
		public void show (){
			System.out.println("This is an implementation Class");

		}
}
	
