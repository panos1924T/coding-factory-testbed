package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * This program takes an input from the user
 * and prints the result.
 * It stops when the number 5 is given.
 * It also checks if the user gives an inappropriate input.
 */
public class MenuWhileApp {

    public static void main(String[] args) {

        //Declaration of variables.
        Scanner input = new Scanner(System.in);
        int inputNum = 0;

        //Processing the data.
        while (true) {

            //Presenting the menu to the user.
            System.out.println("1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Update");
            System.out.println("4. Search");
            System.out.println("5. Exit");

            //Reading the input.
            System.out.println("Please enter a valid number to use the menu: ");
            inputNum = input.nextInt();

            // Checking for invalid inputs.
            if (inputNum < 1 || inputNum > 5) {
                System.out.println("The number is invalid. Please try again.");
                continue;
            }

            //Processing the data and printing the result.
            if (inputNum == 5) {
                System.out.println("Exiting the program");
                break;
            } else if (inputNum == 1) {
                System.out.println("You chose Insert.");
            } else if (inputNum == 2) {
                System.out.println("You chose Delete.");
            } else if (inputNum == 3) {
                System.out.println("You chose Update.");
            } else if (inputNum == 4) {
                System.out.println("You chose Search.");
            }
        }
    }
}
