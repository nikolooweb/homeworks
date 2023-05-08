package io.codelex.typesandvariables;

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfInputNumbers {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers to sum calculate the sum of all numbers (to calculate enter stop)");
        while (true) {
            System.out.println("enter whole number: ");
            String userInput = in.nextLine();
            if (userInput.equals("stop")) {
                break;
            } else {
                numbers.add(Integer.parseInt(userInput));
            }
        }
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        System.out.println(sum);

    }
}
