package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * Αυτό το πρόγραμμα εμφανίζει ένα μενού επιλογών στον χρήστη
 * για να εκτυπώσει διάφορα μοτίβα με αστεράκια (*),
 * όπως οριζόντιες γραμμές, τετράγωνα και τρίγωνα.
 */
public class StarMethodsPrint {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int choice = 0;
        final int EXIT = 6;

        while(true) {
            printMenu();
            choice = giveInput();

            if (choice == EXIT) {
                System.out.println("Exiting the program! ");
                break;
            }

            switch (choice) {
                case 1 -> horizontal();
                case 2 -> vertical();
                case 3 -> square();
                case 4 -> rightTriangle();
                case 5 -> reverseRightTriangle();
                default -> System.out.println("Your choice should be between 1-6!");
            }
        }
    }

    public static void printMenu() {
        System.out.println("1. Εκτύπωση αστεριών οριζόντια");
        System.out.println("2. Εκτύπωση αστεριών κάθετα");
        System.out.println("3. Εκτύπωση αστεριών ως NxN");
        System.out.println("4. Εκτύπωση αστεριών σε ορθογώνιο τρίγωνο");
        System.out.println("5. Εκτύπωση αστεριών σε ανάποδο ορθογώνιο τρίγωνο");
        System.out.println("6. Έξοδος");
        System.out.println("Επιλέξτε ένα από τα παραπάνω:");
    }

    public static int giveInput() {
        return input.nextInt();
    }

    public static void horizontal() {
        System.out.println("Please give the number of repetitions: ");
        int n = giveInput();

        for (int i = 1; i <= n; i++) {
            System.out.print("*");
        }
        System.out.println();
    }

    public static void vertical() {
        System.out.println("Please give the number of repetitions: ");
        int n = giveInput();

        for (int i = 1; i <= n; i++) {
            System.out.println("*");
        }
        System.out.println();
    }

    public static void square() {
        System.out.println("Please give a number to represent the height " +
                "and width of a square using stars: ");
        int n = giveInput();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void rightTriangle() {
        System.out.println("Please give the number of repetitions: ");
        int n = giveInput();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void reverseRightTriangle() {
        System.out.println("Please give the number of repetitions: ");
        int n = giveInput();

        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
