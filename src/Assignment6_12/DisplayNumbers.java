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
    // print ten characters per line from 1 to 100.


    public static void main(String[] args) {
        printNumbers(1,10,5);
    }

    public static void printNumbers(int num1, int num2, int numberPerLine){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        num2 = input.nextInt();
        System.out.println("Enter numbers per line: ");
        numberPerLine = input.nextInt();

        System.out.println("Numbers between " + num1 + " and " + num2 + " is: ");
        int counter = 1;
        for (int i = num1; i <= num2; i++, counter++)
            if (counter % numberPerLine == 0)
                System.out.printf("%4d\n", i);
            else
                System.out.printf("%4d ", i);

    }
}
