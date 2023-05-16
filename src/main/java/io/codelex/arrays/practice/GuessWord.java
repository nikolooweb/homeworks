package io.codelex.arrays.practice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GuessWord {
    public static void main(String[] args) {

        String[] guessWords = {"string", "double", "method", "class", "java", "variable", "collection", "arrays", "coffee", "keyboard", "coding"};

        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        boolean continueGame = true;

        while (continueGame) {
            String randomWord = guessWords[rand.nextInt(guessWords.length)];
            System.out.println(randomWord);

            ArrayList<String> blankWordArray = new ArrayList<>(List.of("_".repeat(randomWord.length()).split("")));
            ArrayList<String> fullWordArray = new ArrayList<>(List.of(randomWord.split("")));
            String misses = "";
            int lives = 5;
            boolean gameOn = true;

            while (gameOn) {

                System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.println("Word: " + (String.join(" ", blankWordArray)));
                System.out.println("Misses: " + misses);

                System.out.print("Guess:  ");
                String guess = in.nextLine();

                boolean areEqual = false;
                for (String letter : fullWordArray) {
                    if (letter.equals(guess)) {
                        areEqual = true;
                        blankWordArray.set(fullWordArray.indexOf(letter), guess);
                        fullWordArray.set(fullWordArray.indexOf(letter), "_");
                        break;
                    }
                }
                if (!areEqual) {
                    misses += guess;
                    lives--;
                    if (lives == 0) {
                        System.out.println("Word was: " + randomWord);
                        gameOn = false;
                    }
                }

                if (randomWord.equals(String.join("", blankWordArray))) {
                    System.out.println("+__+_+_+_+_+__+_+_+_+___+__+__+_+_+__");
                    System.out.println("Word: " + (String.join(" ", blankWordArray)));
                    System.out.println("Yay you guess the word correctly!!");
                    gameOn = false;
                }
            }

            String answer;
            do {
                System.out.print("Play \"again\" or \"quit\"?");
                answer = in.nextLine();
                if (answer.equals("again")) {
                    break;
                } else if (answer.equals("quit")) {
                    continueGame = false;
                    break;
                }
            } while (!(answer.equals("again")) || !(answer.equals("quit")));
        }

    }
}
