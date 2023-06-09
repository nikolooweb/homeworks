package io.codelex.collections.practice;

import java.util.*;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String userInput = null;

        do {
            System.out.println("Enter number: ");
            userInput = in.nextLine();
        } while (!userInput.matches("\\d+"));

        System.out.println("Is number " + userInput + " happy? ----> " + isHappy(userInput));
    }

    public static boolean isHappy(String str) {

        List<String> digits = new ArrayList<String>(Arrays.asList(str.split("")));

        while (true) {
            int number = 0;
            if (String.join("", digits).equals("1")) {
                return true;
            }
            if (String.join("", digits).length() == 1) {
                return false;
            }
            for (String digit : digits) {
                int i = Integer.parseInt(digit);
                number += ((int) (Math.pow(i, 2)));
            }
            digits.clear();
            Collections.addAll(digits, Integer.toString(number).split(""));
        }
    }
}
