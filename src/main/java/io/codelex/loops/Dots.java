package io.codelex.loops;

import java.util.Scanner;

public class Dots {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Enter first word: ");
        String firstWord = in.nextLine();
        System.out.print("Enter second word: ");
        String secondWord = in.nextLine();

        char dotSymbol = '.';
        StringBuilder finalString = new StringBuilder();

        finalString.append(firstWord);
        while (finalString.length() < (30-secondWord.length())) {
            finalString.append(dotSymbol);
        }
        finalString.append(secondWord);
        System.out.println(finalString);



    }
}
