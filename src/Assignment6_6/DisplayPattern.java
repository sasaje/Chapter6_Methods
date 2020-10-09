/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 08/10/2020
 *
 */

package Assignment6_6;

// Display patterns, write a method to display a pattern as follows:
// 1
// 12
// 123
// ...
// n n-1 ... 321

import java.util.Scanner;

public class DisplayPattern {
    public static void main(String[] args) {
        displayPattern();

    }

    public static void displayPattern(){
        System.out.println("Please, enter a number: ");
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();

        for (int x = 1; x <= userInput; x++) {
            //The first row
            for (int y = 1; y <= x; y++) {
                System.out.print( y + " ");
            }

            //The same row as above but in reverse order
            for (int y = x-1; y >= 1; y--) {
                System.out.print( y + " ");
            }
            System.out.println(); // new line
        }
    }
}
