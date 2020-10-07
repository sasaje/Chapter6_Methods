/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 07/10/2020
 *
 */

package Assignment6_2;

public class SumTheDigitsInAnInteger {
    // Write a program that computes the sum of the digits in an integer.

    public static int sumDigits(long n){
        int result = 0;

        while(true){
            //x = x+3;  ------->  x+=3
            result += (int)(n % 10);
            n = n/10;
            if(n/10 == 0){
                result += n;
                break;
            }
        }
        return result;
    }

    static void TestMethod(){
        System.out.printf("234 giver 9: %d%n", sumDigits(234));
        System.out.printf("100000 giver 1: %d%n", sumDigits(100000));
        System.out.printf("-234 giver -9: %d%n", sumDigits(-234));
        System.out.printf("999999999 giver 81: %d%n", sumDigits(999999999));
    }

    public static void main(String[] args) {
        TestMethod();
    }

}
