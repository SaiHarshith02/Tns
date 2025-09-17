package com.tns.java;
import java.util.Scanner;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  the number to check palindrome or not :");
		int x= sc.nextInt();
		int temp=x;
		int sum =0;
		while(temp>0) {
			int dig=temp%10;
			temp=temp/10;
			sum=(sum*10)+dig;
		}
		if (x==sum)
			System.out.println(x+" IS palindrom");
		else
			System.out.println(x+" IS NOT palindrom");
			
		

	}

}
