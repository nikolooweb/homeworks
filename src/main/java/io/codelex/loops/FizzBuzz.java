package io.codelex.loops;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("from 1 to what value: ");
        int valueTo = in.nextInt();

        for (int i = 1; i <= valueTo; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.print("FizzBuzz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else {
                System.out.print(i + " ");
            }

            if (i % 20 == 0) {
                System.out.println();
            }

        }


    }
}
