/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 08/10/2020
 *
 */

package Assignment6_7;

// Financial application: compute the future investment value.
// Write a method that computes future investment value at a given interest rate for a specified number of years.
// The future investment is determined using the formula in Programming Exercise 2.21.

import java.util.Scanner;

public class FinancialApplication {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.println("Enter the monthly investment rate in %: ");
        double monthlyInvestmentRate = input.nextDouble();
        double monthlyInvestmentRateDecimal = (monthlyInvestmentRate/100)/12;

        System.out.println("Enter the years: ");
        int years = input.nextInt();

        System.out.println("The result of your future investment value is: " +
                futureInvestmentValue(investmentAmount, monthlyInvestmentRateDecimal, years));
    }

    public static double futureInvestmentValue(double investmentAmount, double monthlyInvestmentRateDecimal, int years){
        double result = investmentAmount * Math.pow(1 + monthlyInvestmentRateDecimal, years * 12);
        return result;
    }
}
