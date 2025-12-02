package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

public class MiniQuizzesSwitchFor {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        final int EXIT = 5;

        while (true) {
            printMenu();
            choice = getOneInt();

            if (choice == EXIT) {
                System.out.println("Exiting the program!");
                break;
            }

            switch (choice) {
                case 1 -> print20EvenNumbers();
                case 2 -> sum50Int();
                case 3 -> printCountdown();
                case 4 -> pyramidFromStars();
                default -> System.out.println("Λάθος! Παρακαλώ επιλέξτε από 1 έως 5.");
            }
        }

    }

    public static void printMenu() {
        System.out.println("1. Εκτυπώνει όλους τους ζυγούς αριθμούς από 1 έως 20");
        System.out.println("2. Βρίσκει το άθροισμα των ακεραίων από 1 έως 50");
        System.out.println("3. Εκτυπώνει από το 1 έως το 10 με αντίστροφη σειρά,\n" +
                "δηλ. 10 9 8 … 3 2 1");
        System.out.println("4. Φτιάχνει μία πυραμίδα από * με 4 σειρές");
        System.out.println("Παρακαλώ διαλέξτε τι θέλετε να κάνει το πρόγραμμα σας: ");
    }

    public static int getOneInt() {
        return input.nextInt();
    }

    public static void print20EvenNumbers() {
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void sum50Int() {
        int result = 0;
        for (int i = 1; i <= 50; i++) {
            result += i;
        }
        System.out.println("The result is: " + result);
    }

    public static void printCountdown() {
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }

    public static void pyramidFromStars() {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 4 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= ((2 * i) - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
