package gr.aueb.cf.cf9.ch5;

import java.util.Scanner;

/**
 * This program takes an input from the user (Celsius degrees)
 * and converts it to Fahrenheit. This conversion happens
 * inside a method tha is being called from the main.
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double cels = 0;

        System.out.println("Please enter the Celsius degrees " +
                "you want to convert: ");
        cels = input.nextDouble();

        double fahre = convertDegrees(cels);

        System.out.printf("The %.2f Celsius degrees you convert are: " +
                "%.2f Fahrenheit!%n",cels, fahre);
    }

    public static double convertDegrees(double cels) {
         double fahre = cels * (9.0/5.0) + 32;
         return fahre;
    }
}
