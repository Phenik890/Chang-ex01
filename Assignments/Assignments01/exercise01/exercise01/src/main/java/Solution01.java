import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hunter Chang
 */

class Solution01 {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);  // Creates a scanner
        System.out.println("What is your name? ");
        String yourname = name.nextLine();  // Reads user input

        name.close();

        System.out.println("Hello, " + yourname + ", nice to meet you!");  // Print line with input
    }
}