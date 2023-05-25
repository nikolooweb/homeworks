package io.codelex.exceptions.practice;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        while (true) {
            String numerator = "";
            try {
                System.out.println("Enter the numerator");
                numerator = scanner.next();
                if (!numerator.matches("\\d+")) {
                    throw new InputMismatchException();
                }
                System.out.println("Enter the divisor");
                int divisor = scanner.nextInt();
                System.out.println(numerator + " / " + divisor + " = " + Integer.parseInt(numerator) / divisor);
            } catch (ArithmeticException ae) {
                System.out.println("You can't divide " + numerator + " by 0");
            } catch (InputMismatchException ime) {
                if (numerator.equals("quit")) {
                    break;
                }
                System.out.println("Bad data");
                System.out.println("Please try again.");
            }
        }
    }
}
