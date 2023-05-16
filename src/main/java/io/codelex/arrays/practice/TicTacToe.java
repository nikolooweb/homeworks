package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {
    public static char symbol = 'X';
    private static char[][] board = new char[3][3];

    public static void main(String[] args) {

        initBoard();
        displayBoard();

        while (true) {
            position(symbol);
            if (isGameFinished(symbol)) {
                break;
            }
            displayBoard();
            whoTurn();
        }
    }

    public static void position(char symbol) {
        Scanner keyboard = new Scanner(System.in);
        int[] positionXY;
        String[] inputStringArray;

        while (true) {

            System.out.print("'" + symbol + "', choose your location (row, column):  ");
            String position = keyboard.nextLine();

            inputStringArray = position.split(" ");
            positionXY = new int[inputStringArray.length];

            for (int i = 0; i < inputStringArray.length; i++) {
                positionXY[i] = Integer.parseInt(inputStringArray[i]);
            }
            if (positionXY.length == 2 && isSpaceAvailable(positionXY[0], positionXY[1])) {
                break;
            } else {
                System.out.println("choose empty place and enter two digits with one space between");
            }
        }

        int row = positionXY[0];
        int column = positionXY[1];
        board[row][column] = symbol;
    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }

    public static boolean isSpaceAvailable(int x, int y) {
        try {
            return board[x][y] == ' ';
        } catch (ArrayIndexOutOfBoundsException a) {
            System.out.println("out of bounds");
            return false;
        }
    }

    public static void whoTurn() {
        if (symbol == 'X') {
            symbol = 'O';
        } else {
            symbol = 'X';
        }
    }

    public static boolean isGameFinished(char symbol) {

        if ((board[0][0] == symbol && board[0][1] == symbol && board[0][2] == symbol) ||
                (board[1][0] == symbol && board[1][1] == symbol && board[1][2] == symbol) ||
                (board[2][0] == symbol && board[2][1] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][0] == symbol && board[2][0] == symbol) ||
                (board[0][1] == symbol && board[1][1] == symbol && board[2][1] == symbol) ||
                (board[0][2] == symbol && board[1][2] == symbol && board[2][2] == symbol) ||

                (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) ||
                (board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol)) {
            displayBoard();
            System.out.println("Player: " + symbol + " won !!!");
            return true;

        }
        for (char[] row : board) {
            for (char element : row) {
                if (element == ' ') {
                    return false;
                }
            }
        }
        System.out.println("Game over Board is full");
        return true;
    }
}