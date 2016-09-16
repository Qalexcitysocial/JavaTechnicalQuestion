package com.interview.questions;

/**
 *Write a Java program to print Fibonacci series upto 100
 This is one of the most popular coding interview question asked in Java programming language.
 Even though, Writing program for Fibonacci series is one of the basic Java program, not every Java developer get it right in interview.
 */


import java.util.Scanner;

/** * Java program to calculate and print Fibonacci number using both recursion
 ** and Iteration.
 ** Fibonacci number is sum of previous two Fibonacci numbers fn= fn-1+ fn-2
 ** first 10 Fibonacci numbers are 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
 ***/

public class Fibonacci {

    public static void main(String args[]) {
            //input to print Fibonacci series upto how many numbers
            System.out.println("Enter number upto which Fibonacci series to print: ");
            int number = new Scanner(System.in).nextInt();
                System.out.println("Fibonacci series upto " + number +" numbers : ");
                //printing Fibonacci series upto number
                        for(int i=1; i<=number; i++){
                            System.out.print((i) + i-1); } }
    }

