package com.tns.staticFinal;
	class  Counter {
	    static int count = 0; // shared by all objects

	    Counter() {
	        count++;
	    }

	    static void displayCount() {
	        System.out.println("Count = " + count);
	    }
	}

	public class staticEx {
	    public static void main(String[] args) {
	        new Counter();
	        new Counter();
	        Counter.displayCount(); // Output: Count = 2
	    }
}
