package com.tns.java;
import java.util.Scanner;
public class evenORodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number : ");
		int x= sc.nextInt();
		if (x%2==0) 
			System.out.println(x+" is Even Number");
		else
			System.out.println(x+" is Odd Number");
		

	}

}
