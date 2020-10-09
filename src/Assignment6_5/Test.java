/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 08/10/2020
 *
 */

package Assignment6_5;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        System.out.println("Please enter the first number: ");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        System.out.println("Please enter the second number: ");
        double num2 = input.nextDouble();
        System.out.println("Please enter the third number: ");
        double num3 = input.nextDouble();

        SortThreeNumbers.displaySortedNumbers(num1,num2,num3);

    }
}
