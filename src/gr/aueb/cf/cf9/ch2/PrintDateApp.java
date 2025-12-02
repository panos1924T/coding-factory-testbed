package gr.aueb.cf.cf9.ch2;

import java.util.Scanner;

/**
 * This program reads three numbers from the user and prints the date.
 */
public class PrintDateApp {
    public static void main(String[] args) {

        //Variable Declaration:
        Scanner scanner = new Scanner(System.in);
        int numDays = 0;
        int numMonths = 0;
        int numYears = 0;

        //Commands:
        System.out.println("Παρακαλώ πληκτρολογείστε έναν θετικό ακέραιο αριθμό ως το 31 για τις ημέρες του μήνα:");
        numDays = scanner.nextInt();
        System.out.println("Παρακαλώ πληκτρολογείστε έναν θετικό ακέραιο αριθμό ως το 12 για τους μήνες μιας ημερομηνίας:");
        numMonths = scanner.nextInt();
        System.out.println("Παρακαλώ πληκτρολογείστε έναν τετραψήφιο ακέραιο αριθμό ως χρονολογία έτους (π.χ. 2025, 1998, 2000):");
        numYears = scanner.nextInt();

        //Printing the output:
        System.out.printf("The date you chose is: %d/%d/%d", numDays, numMonths, numYears);
    }
}
