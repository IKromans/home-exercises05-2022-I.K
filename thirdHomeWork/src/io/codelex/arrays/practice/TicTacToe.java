package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {
    private static final char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

//        Get player names
        System.out.println("Welcome to Tic-Tac-Toe Java game!");
        System.out.print("Player one, define your name: ");
        String player1 = keyboard.nextLine().toUpperCase();
        System.out.print("Player two, enter your name: ");
        String player2 = keyboard.nextLine().toUpperCase();
        System.out.println("Let the battle begin!!");

        initBoard();
//        Create boolean for player's turns
        boolean p1 = true;
//        Create boolean for while loop
        boolean gameOver = false;
        while (!gameOver) {

            displayBoard();

            if (p1) {
                System.out.print(player1);
            } else {
                System.out.print(player2);
            }

//            Symbol for player's turn
            char symbol = ' ';
            if (p1) {
                symbol = 'X';
            } else {
                symbol = 'O';
            }

//            Row and col variables for position on game board
            int row = 0;
            int col = 0;

//            Continue only when user enters a valid position
            while (true) {

                System.out.print(", choose your location (row, column): ");
                row = keyboard.nextInt();
                col = keyboard.nextInt();

//                Check if the row and col are correct
                if (row < 0 || col < 0 || row >= 3 || col >= 3) {
                    System.out.println("This move is not allowed! Try again. (row, column):");

//                    Check if the position is empty
                } else if (board[row][col] != ' ') {
                    System.out.println("Someone has already made a move at this position! Try again. (row, column):");
                } else {
                    board[row][col] = symbol;
                    break;
                }
            }

//            Check if someone has won the game
            if (playerHasWon(board) == 'X') {
                System.out.println("Congratulations!!!" + player1 + " has won!");
                gameOver = true;
            } else if (playerHasWon(board) == 'O') {
                System.out.println("Congratulations!!!" + player2 + " has won a game!");
                gameOver = true;
            } else {

//                If neither player has won, check to see if it is a tie
                if (boardIsFull(board)) {
                    System.out.println("It's a tie!");
                    gameOver = true;
                } else {
//                    If player1 is true, make it false, this way the players alternate each turn
                    p1 = !p1;
                }
            }
        }
        initBoard();
    }

    private static char playerHasWon(char[][] board) {
        for (int i = 0; i < board.length; i++) {

//            inARow is true if a player has won by putting 3 of their chars in row i and false otherwise
            boolean inARow = true;
//            The char value is one of the chars in row i; we can use this to check if every other char in row i is equal to value
            char value = board[i][0];

//            if the value is not " ", because if it is, that means that there is an empty spot in the row so we can automatically say that inARow is false
            if (value == ' ') {
                inARow = false;

//                Otherwise, we can check each position in the row starting at index 1  and check if that position equals value
            } else {
                for (int j = 1; j < board[i].length; j++) {
//                    If board[i][j] doesn't equal value, then we know that inARow is false
                    if (board[i][j] != value) {
                        inARow = false;
                        break;
                    }
                }
            }

//            If inARow is true a player has won so we can return value (the char of the winner)
            if (inARow) {
                return value;
            }

        }

//        We can use the same method to check each column
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

//        We can use a similar construction to check the diagonals
//        from upper left to bottom right

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

//        from upper right to bottom left
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

//        Otherwise nobody has not won yet
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
//        fills up the board with blanks
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