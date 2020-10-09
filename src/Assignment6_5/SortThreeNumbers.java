/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 08/10/2020
 *
 */

package Assignment6_5;

public class SortThreeNumbers {
    // Write a method with the following header to display three numbers in decreasing order:
    // public static void displaySortedNumbers( double num1, double num3, double num3)
    // Write a test program that prompts the user to enter three numbers and invokes the method to display them in decreasing order.

    public static void displaySortedNumbers(double num1, double num2, double num3){

        double max = Math.max(Math.max(num1,num2),num3);
        double middle = 0;
        double min = Math.min(Math.min(num1,num2),num3);

        if(max != num1 && min != num1){
            middle = num1;
        }else if(max != num2 && min != num2){
            middle = num2;
        }else if(max != num3 && min != num3){
            middle = num3;
        }
/*
        System.out.println("The highest number is: " + max);
        System.out.println("The middle number is: " + middle);
        System.out.println("The lowest number is: " + min);
*/

        System.out.println("The decreasing order is: " + max + " , " + middle + " , " + min);
    }
}
