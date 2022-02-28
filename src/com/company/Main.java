package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        try {
            Triangle triangle = new Triangle(1,3,1);
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}
