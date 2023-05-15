package io.codelex.typesandvariables;

import java.util.Scanner;

public class CountOfUpperLetters {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter string: ");
        String input = in.nextLine();

        String[] letters = input.replaceAll("[^A-Z]", "").split("");

        System.out.println("Your string contains " + letters.length + " uppercase letters");
    }
}
