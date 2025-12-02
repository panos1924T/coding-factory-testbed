package gr.aueb.cf.cf9.ch3;

import java.util.Scanner;

/**
 * This program accepts a number as an input for a year and tests
 * if the year is leap or not.
 */
public class TestLeapYearApp {

    public static void main(String[] args) {

        //Declaration of the variables.
        Scanner in = new Scanner(System.in);
        int inputYear = 0;

        //Reading the input.
        System.out.println("Please enter a number for a calendar year: ");
        inputYear = in.nextInt();

        //Variable processing.
        if (inputYear % 400 == 0){
            System.out.printf("The calendar year %d is leap!%n", inputYear);
        } else if (inputYear % 4 == 0 && inputYear % 100 != 0) {
            System.out.printf("The calendar year %d is leap!%n", inputYear);
        } else {
            System.out.printf("The calendar year %d is not leap!%n", inputYear);
        }
    }
}
