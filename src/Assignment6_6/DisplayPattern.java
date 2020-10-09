/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 09/10/2020
 *
 */

package Assignment6_6;
// Display patterns, write a method to display a pattern as follows:
// 1
// 12
// 123
// ...
// n n-1 ... 321

public class DisplayPattern {
    public static void main(String[] args) {

        int maxValue = 8;

        for (int i = 1; i <= maxValue; i++) {
            visEnLinje(i);
        }
    }

    public static void visEnLinje(int x){
        for (int i = 1; i <= x; i++) {
            System.out.print(i);
        }
        for (int i = (x-1); i > 0; i--) {
            System.out.print(i);
        }
        System.out.println("");
    }
}
