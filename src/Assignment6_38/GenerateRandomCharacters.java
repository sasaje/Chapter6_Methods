/*
 * Developed by Sara Sandager (sara590x@edu.easj.dk)
 * Licensed under the MIT License
 * 09/10/2020
 *
 */

package Assignment6_38;

public class GenerateRandomCharacters {

    // Generate random characters. Use methods in RandomCharacter in Listing 6.10 to print 200 uppercase letters and
    // then 200 single digits, printing ten per line.

    public static void main(String[] args) {

        // Random 200 uppercase letters
        System.out.println("This is 200 random uppercase letters: ");

        for (int j = 1; j <= 20; j++) {
            int maxNumberPerLine = 10;
            for (int k = 1; k <= maxNumberPerLine; k++) {
                System.out.print(getRandomUpperCaseLetter() + "  ");
            }
            System.out.println("");
        }
        System.out.println("");


        // Random 200 single digits numbers
        System.out.println("This is 200 random single digits: ");
        for (int j = 1; j <= 20; j++) {
            int maxNumberPerLine = 10;
            for (int k = 1; k <= maxNumberPerLine; k++) {
                System.out.print(getRandomDigitCharacters() + "  ");
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static char getRandomCharacter(char ch1, char ch2){
        // Random 1 uppercase letter
//        System.out.println(getRandomCharacter('A','Z'));
        return (char)(ch1+Math.random()*(ch2-ch1+1));
    }

    public static char getRandomUpperCaseLetter(){
        return getRandomCharacter('A','Z');
    }

    public static int getRandomDigitCharacters(){
        int singleDigit = (int)(Math.random()*10);
        return singleDigit;
    }
}