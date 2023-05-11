package io.codelex.flowcontrol.practice;

import java.util.Scanner;

public class TenBillion {

    //TODO: Write a Java program that reads an positive integer and count the number of digits the number (less than ten billion) has.
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input an integer number less than ten billion: ");

        if (in.hasNextLong()) {
            long n = in.nextLong();
            if (n < 0) {
                n *= -1;
            }
            if (n >= Long.parseLong("10000000000") ) {
                System.out.println("Number is greater or equals 10,000,000,000!");
            } else {
                int digits = 1;
                int longDigits = Long.toString(n).length();
                if (longDigits == 2) {
                    digits = 2;
                } else if (longDigits == 3) {
                    digits = 3;
                } else if (longDigits == 4) {
                    digits = 4;
                } else if (longDigits == 5) {
                    digits = 5;
                } else if (longDigits == 6) {
                    digits = 6;
                } else if (longDigits == 7) {
                    digits = 7;
                } else if (longDigits == 8) {
                    digits = 8;
                } else if (longDigits == 9) {
                    digits = 9;
                } else if (longDigits == 10) {
                    digits = 10;
                }
                System.out.println("Number of digits in the number: " + digits);
            }
        } else {
            System.out.println("The number is not a long");
        }

    }

}
