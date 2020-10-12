package Assignment6_12;
/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 09/10/2020
 *
 */

import java.util.Scanner;

public class DisplayNumbers {

    // Write a method that prints numbers using the following header:
    // public static void printNumbers(int num1, int num2, int numberPerLine)
    // This method prints characters between num1 and num2 with specified numbers per line. Write a test program that
    // print ten characters per line from 1 to 100. Numbers are separated by exactly one space.


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        System.out.println("Enter numbers per line: ");
        int numberPerLine = input.nextInt();

        System.out.println("Numbers between " + num1 + " and " + num2 + " is: ");
        for (int i = num1; i <= num2; i++) {
            for (int k = 1; k <= numberPerLine; k++) {
                System.out.print(i + " ");
            }
            System.out.println("");
        }
    }
    public static void printNumbers(int num1, int num2, int numberPerLine){


    }


}
