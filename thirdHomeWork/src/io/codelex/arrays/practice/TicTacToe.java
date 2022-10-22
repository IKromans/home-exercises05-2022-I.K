package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {
    private static final char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Welcome to Tic-Tac-Toe Java game!");
        System.out.print("Player one, define your name: ");
        String player1 = keyboard.nextLine().toUpperCase();
        System.out.print("Player two, enter your name: ");
        String player2 = keyboard.nextLine().toUpperCase();
        System.out.println("Let the battle begin!!");

        initBoard();
        boolean isPlayersOneTurn = true;
        boolean gameOver = false;
        while (!gameOver) {

            displayBoard();

            if (isPlayersOneTurn) {
                System.out.print(player1);
            } else {
                System.out.print(player2);
            }

            char playersTurnSymbol = ' ';
            if (isPlayersOneTurn) {
                playersTurnSymbol = 'X';
            } else {
                playersTurnSymbol = 'O';
            }

            int row = 0;
            int col = 0;

            while (true) {

                System.out.print(", choose your location (row, column): ");
                row = keyboard.nextInt();
                col = keyboard.nextInt();

                if (row < 0 || col < 0 || row >= 3 || col >= 3) {
                    System.out.println("This move is not allowed! Try again. (row, column):");
                } else if (board[row][col] != ' ') {
                    System.out.println("Someone has already made a move at this position! Try again. (row, column):");
                } else {
                    board[row][col] = playersTurnSymbol;
                    break;
                }
            }

            if (playerHasWon(board) == 'X') {
                System.out.println("Congratulations!!!" + player1 + " has won!");
                gameOver = true;
            } else if (playerHasWon(board) == 'O') {
                System.out.println("Congratulations!!!" + player2 + " has won a game!");
                gameOver = true;
            } else {

                if (boardIsFull(board)) {
                    System.out.println("It's a tie!");
                    gameOver = true;
                } else {
                    isPlayersOneTurn = !isPlayersOneTurn;
                }
            }
        }
        initBoard();
    }

    private static char playerHasWon(char[][] board) {
        for (int i = 0; i < board.length; i++) {

            boolean inARow = true;
            char value = board[i][0];
            if (value == ' ') {
                inARow = false;
            } else {
                for (int j = 1; j < board[i].length; j++) {
                    if (board[i][j] != value) {
                        inARow = false;
                        break;
                    }
                }
            }
            if (inARow) {
                return value;
            }
        }

        for (int j = 0; j < board[0].length; j++) {
            boolean inACol = true;
            char value = board[0][j];
            if (value == '-') {
                inACol = false;
            } else {
                for (int i = 1; i < board.length; i++) {
                    if (board[i][j] != value) {
                        inACol = false;
                        break;
                    }
                }
            }
            if (inACol) {
                return value;
            }
        }

        boolean inADiag1 = true;
        char value1 = board[0][0];
        if (value1 == ' ') {
            inADiag1 = false;
        } else {
            for (int i = 1; i < board.length; i++) {
                if (board[i][i] != value1) {
                    inADiag1 = false;
                    break;
                }
            }
        }
        if (inADiag1) {
            return value1;
        }

        boolean inADiag2 = true;
        char value2 = board[0][board.length - 1];
        if (value2 == ' ') {
            inADiag2 = false;
        } else {
            for (int i = 1; i < board.length; i++) {
                if (board[i][board.length - 1 - i] != value2) {
                    inADiag2 = false;
                    break;
                }
            }
        }
        if (inADiag2) {
            return value2;
        }
        return ' ';
    }

    private static boolean boardIsFull(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (board[i][j] == ' ') {
                    return false;
                }
            }
        }
        return true;
    }

    public static void initBoard() {
        for (int row = 0; row < 3; row++)
            for (int col = 0; col < 3; col++)
                board[row][col] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "|" + board[0][1] + "|" + board[0][2]);
        System.out.println("    --+-+--");
        System.out.println("  1  " + board[1][0] + "|" + board[1][1] + "|" + board[1][2]);
        System.out.println("    --+-+--");
        System.out.println("  2  " + board[2][0] + "|" + board[2][1] + "|" + board[2][2]);
        System.out.println("     0 1 2 ");
    }
}