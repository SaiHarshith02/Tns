package com.tns.java;

public class WrapperExample {
    public static void main(String[] args) {
        int a = 10;
        Integer num = a;  
        System.out.println("Autoboxing: " + num);
        Integer obj = 25;
        int b = obj;
        System.out.println("Unboxing: " + b);
        String str = "123";
        int n = Integer.parseInt(str); 
        System.out.println("String to int: " + n);
        System.out.println("Max Integer: " + Integer.MAX_VALUE);
        System.out.println("Min Integer: " + Integer.MIN_VALUE);
        System.out.println("Binary of 10: " + Integer.toBinaryString(10));
    }
}
