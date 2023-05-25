package io.codelex.enums.practice;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean gameOn = true;
        int gameCount = 0;
        int playerScore = 0;
        int computerScore = 0;

        while (gameOn) {

            System.out.println("Scissor-Paper-Rock");
            RockPaperScissorGameElements computerChoice = generateComputerChoice();
            RockPaperScissorGameElements playerChoice = null;

            while (true) {
                try {
                    System.out.print("\tYour turn (Enter s for scissor, p for paper, r for rock, q to quit):   ");
                    String choice = in.next();

                    switch (choice) {
                        case "s" -> playerChoice = RockPaperScissorGameElements.SCISSOR;
                        case "p" -> playerChoice = RockPaperScissorGameElements.PAPER;
                        case "r" -> playerChoice = RockPaperScissorGameElements.ROCK;
                        case "q" -> gameOn = false;
                        default -> throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("\tInvalid input, try again...");
                }
            }
            if (!gameOn) break;

            System.out.println("\tMy turn: " + playerChoice);
            RockPaperScissorGameElements winner = returnWinner(playerChoice, computerChoice);

            if (winner != null) {
                if (winner.equals(playerChoice)) {
                    playerScore++;
                } else if (winner.equals(computerChoice)) {
                    computerScore++;
                }
            }
            gameCount++;
        }

        finalMessage(gameCount, playerScore, computerScore);

    }

    public static RockPaperScissorGameElements generateComputerChoice() {
        Random rand = new Random();
        int randomNumber = rand.nextInt(RockPaperScissorGameElements.values().length);
        return RockPaperScissorGameElements.values()[randomNumber];
    }

    public static RockPaperScissorGameElements returnWinner(RockPaperScissorGameElements player, RockPaperScissorGameElements computer) {

        if (player.equals(computer)) {
            System.out.println("\tTie!");
        } else if (Arrays.asList(player.beat).contains(computer)) {
            System.out.println("\tPlayer won");
            return player;
        } else {
            System.out.println("\tComputer won");
            return computer;
        }
        return null;
    }

    public static void finalMessage(int count, int playerScore, int computerScore) {
        System.out.println("Number of trials: " + count);
        if (count > 0) {
            System.out.println("I won " + playerScore + "(" + (double) playerScore / (double) (playerScore + computerScore) * 100 + "%). Computer won " + computerScore + "(" + (double) computerScore / (double) (playerScore + computerScore) * 100 + "%).");
        }
        System.out.println("Bye!");
    }
}


