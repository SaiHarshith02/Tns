package com.tns.Encapsulation;

class Student {
    // private variables (cannot be accessed directly)
    private String name;
    private int age;

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for age
    public void setAge(int age) {
        if (age > 0) { // simple validation
            this.age = age;
        } else {
            System.out.println("Invalid age!");
        }
    }

    // Getter for age
    public int getAge() {
        return age;
    }
}

public class GetterSetterExample {
    public static void main(String[] args) {
        Student s1 = new Student();

        // using setter methods
        s1.setName("Harshith");
        s1.setAge(20);

        // using getter methods
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}

