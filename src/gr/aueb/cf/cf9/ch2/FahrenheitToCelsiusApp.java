package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * This program reads an integer as Fahrenheit degrees and converts it in Celsius.
 */
public class FahrenheitToCelsiusApp {

    public static void main(String[] args) {

        //Variable declaration:
        Scanner scanner = new Scanner(System.in);
        int inputFahrenheit = 0;
        int celsius = 0;

        //Commands:
        System.out.println("Παρακαλώ δώστε έναν αριθμό που θέλετε να μετατρέψετε: ");
        inputFahrenheit = scanner.nextInt();
        celsius = 5 * (inputFahrenheit - 32) / 9;

        //Output
        System.out.printf("Οι βαθμοί Φαρενάιτ %d που μετατρέψατε είναι: %d\n", inputFahrenheit, celsius);

    }
}
