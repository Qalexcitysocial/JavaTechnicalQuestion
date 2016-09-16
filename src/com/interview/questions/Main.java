package com.interview.questions;

public class Main {

    public static void main(String[] args) {
	// write your code here

        for(int i = 0; i < 50; i++) {
            if (i % (3*5)  == 0)
                System.out.println(" FizzBuzz");
            else if (i % 3 == 0)
                System.out.println(" Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);

        }

    }
}
