package gr.aueb.cf.cf9.ch4;

import java.util.Scanner;

/**
 * This program takes an input from the user (1-7)
 * and print the day of the week accordingly to the number.
 * Also it shows an appropriate message if the number
 * is not valid.
 * The program uses the Switch variable.
 */
public class SwitchWeekDaysApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice = 0;
        final int EXIT = 0;

        while (true) {
            System.out.println("Please enter a number for the corresponding \n" +
                    "day of the week (1 -> Monday, 2 -> Tuesday etc.) : ");
            choice = input.nextInt();

            if (choice == EXIT) {
                System.out.println("Exiting the program!");
                break;
            }

            switch (choice) {
                case 1 -> System.out.println("Monday");
                case 2 -> System.out.println("Tuesday");
                case 3 -> System.out.println("Wednesday");
                case 4 -> System.out.println("Thursday");
                case 5 -> System.out.println("Friday");
                case 6 -> System.out.println("Saturday");
                case 7 -> System.out.println("Sunday");
                default -> System.out.println("Your choice should be between 1-7 !!");
            }
        }
    }
}
