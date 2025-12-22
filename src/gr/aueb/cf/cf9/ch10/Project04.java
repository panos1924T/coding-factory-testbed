package gr.aueb.cf.cf9.ch10;

import java.util.Scanner;

public class Project04 {
    static final int ROWS = 3;
    static final int COLUMNS = 3;

    public static void main(String[] args) {
        char[][] ticTacToe = new char[ROWS][COLUMNS];
        Scanner userInput = new Scanner(System.in);
        char currentPlayer = 'X';
        boolean gameOn = true;
        int countMoves = 0;

        initializeArray(ticTacToe);

        while (gameOn) {
            printBoard(ticTacToe);
            System.out.println("Player " + currentPlayer + " enter your move " +
                    "(row and column): ");

            boolean validMove = false;
            while (!validMove) {
                System.out.println("Row (1-3): ");
                int row = userInput.nextInt() - 1;

                System.out.println("Column (1-3): ");
                int column = userInput.nextInt() - 1;

                if ((row < 0 || row > 2) || (column < 0 || column > 2)) {
                    System.out.println("Coordinates out of bounds! Try again. ");
                } else if (ticTacToe[row][column] != ' ') {
                    System.out.println("Spot already taken! Please, try another one. ");
                } else {
                    countMoves++;
                    ticTacToe[row][column] = currentPlayer;
                    validMove = true;
                    if (checkWin(ticTacToe,currentPlayer)) {
                        printBoard(ticTacToe);
                        System.out.println(currentPlayer + " Wins. Congratulations!");
                        gameOn = false;
                    } else if(countMoves == 9) {
                        printBoard(ticTacToe);
                        System.out.println("It's a draw!");
                        gameOn = false;
                    } else {
                        currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                    }
                }
            }

        }
    }

    public static void initializeArray(char[][] ticTacToe) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                ticTacToe[i][j] = ' ';
            }
        }
    }

    public static void printBoard(char[][] ticTacToe) {
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLUMNS; j++) {
                System.out.print(ticTacToe[i][j]);
                if (j < COLUMNS - 1) {
                    System.out.print("|");
                }
            }
            System.out.println();
            if (i < ROWS - 1) {
                System.out.println("-+-+-");
            }
        }
    }

    public static boolean checkWin(char[][] ticTacToe, char currentPlayer) {
        for (int i = 0; i < ROWS; i++) {
            if (ticTacToe[i][0] == currentPlayer && ticTacToe[i][1] == currentPlayer &&
                    ticTacToe[i][2] == currentPlayer) return true;
            if (ticTacToe[0][i] == currentPlayer && ticTacToe[1][i] == currentPlayer &&
                    ticTacToe[2][i] == currentPlayer) return true;
        }
        if (ticTacToe[0][0] == currentPlayer && ticTacToe[1][1] == currentPlayer &&
                ticTacToe[2][2] == currentPlayer) return true;
        if (ticTacToe[0][2] == currentPlayer && ticTacToe[1][1] == currentPlayer &&
                ticTacToe[2][0] == currentPlayer) return true;
        return false;
    }
}

