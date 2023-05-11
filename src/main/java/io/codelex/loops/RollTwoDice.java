package io.codelex.loops;

import java.util.Scanner;

public class RollTwoDice {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int desiredSum;
        do {
            System.out.println("Desired sum (2-12): ");
            while (!in.hasNextInt()) {
                System.out.println("not a number! type again: ");
                in.next();
            }
            desiredSum = in.nextInt();
        } while (desiredSum > 12 || desiredSum < 2);
        System.out.println(desiredSum);

        while (true) {
            int randomNumberOne = (int) (Math.random() * 6) + 1;
            int randomNumberTwo = (int) (Math.random() * 6) + 1;
            int sum = randomNumberOne + randomNumberTwo;
            System.out.println(randomNumberOne + " and " + randomNumberTwo + " = " + sum);

            if (sum == desiredSum) {
                break;
            }
        }
    }
}
