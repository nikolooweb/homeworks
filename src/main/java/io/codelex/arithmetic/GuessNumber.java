package io.codelex.arithmetic;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {

        int randomNumber = (int) (Math.random() * 100) + 1;

        System.out.println("I'm thinking of a number between 1-100.  Try to guess it.");
        Scanner in = new Scanner(System.in);
        int guess = in.nextInt();

        if (randomNumber == guess) {
            System.out.println("You guessed it!  What are the odds?!?");
        } else if (guess > randomNumber) {
            System.out.printf("Sorry, you are too high. I was thinking of %d.", randomNumber);
        } else {
            System.out.printf("Sorry, you are too low. I was thinking of %d.", randomNumber);
        }
    }
}
