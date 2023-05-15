package io.codelex.loops;

import java.util.Arrays;
import java.util.Scanner;

public class Piglet {
    public static void main(String[] arg) {

        System.out.println("Welcome to Piglet!");

        boolean gameOn = true;
        int points = 0;

        String[] commandsToContinue = {"yes", "y"};
        String[] commandsToQuit = {"no", "n", "exit"};

        Scanner in = new Scanner(System.in);

        while (gameOn) {

            int randomDice = (int) (Math.random() * 6) + 1;
            System.out.println("You rolled a " + randomDice + "!");

            if (randomDice != 1) {
                points += randomDice;
              
                System.out.println("Roll again?");

                boolean positiveAnswer = false;
                boolean negativeAnswer = false;

                while (true) {
                    String answer = in.nextLine();
                    if (Arrays.stream(commandsToContinue).anyMatch(command -> command.equals(answer.toLowerCase()))) {
                        positiveAnswer = true;
                        break;
                    }
                    if (Arrays.stream(commandsToQuit).anyMatch(command -> command.equals(answer.toLowerCase()))) {
                        negativeAnswer = true;
                        break;
                    }
                }

                if (positiveAnswer) {
                    System.out.println("good job!!!");
                } else if (negativeAnswer) {
                    System.out.printf("You got %d points.", points);
                    gameOn = false;
                }
            } else {
                System.out.println("You got 0 points.");
                gameOn = false;
            }
        }
    }
}
