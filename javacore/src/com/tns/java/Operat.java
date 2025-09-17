package com.tns.java;

//OperatorsDemo.java
public class Operat {
 public static void main(String[] args) {
     
     int a = 10, b = 5;
     
     // Arithmetic Operators
     System.out.println("Arithmetic Operators:");
     System.out.println("a + b = " + (a + b));
     System.out.println("a - b = " + (a - b));
     System.out.println("a * b = " + (a * b));
     System.out.println("a / b = " + (a / b));
     System.out.println("a % b = " + (a % b));

     // Relational Operators
     System.out.println("\nRelational Operators:");
     System.out.println("a == b: " + (a == b));
     System.out.println("a != b: " + (a != b));
     System.out.println("a > b: " + (a > b));
     System.out.println("a < b: " + (a < b));
     System.out.println("a >= b: " + (a >= b));
     System.out.println("a <= b: " + (a <= b));

     // Logical Operators
     boolean x = true, y = false;
     System.out.println("\nLogical Operators:");
     System.out.println("x && y: " + (x && y));
     System.out.println("x || y: " + (x || y));
     System.out.println("!x: " + (!x));

     // Assignment Operators
     System.out.println("\nAssignment Operators:");
     int c = a; // c = 10
     System.out.println("c = " + c);
     c += 5; 
     System.out.println("c += 5 -> " + c);
     c *= 2; 
     System.out.println("c *= 2 -> " + c);

     // Bitwise Operators
     System.out.println("\nBitwise Operators:");
     System.out.println("a & b = " + (a & b));
     System.out.println("a | b = " + (a | b));
     System.out.println("a ^ b = " + (a ^ b));
     System.out.println("~a = " + (~a));
     System.out.println("a << 1 = " + (a << 1));
     System.out.println("a >> 1 = " + (a >> 1));
 }
}

