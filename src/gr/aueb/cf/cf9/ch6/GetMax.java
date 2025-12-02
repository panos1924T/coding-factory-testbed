package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Αναπτύξτε μία γενική μέθοδο εύρεσης του
 * μέγιστου ενός πίνακα getMaxPosition (int[]
 * arr, int low, int high) που επιστρέφει τη
 * θέση στον πίνακα arr του μέγιστου
 * στοιχείου του πίνακα
 */
public class GetMax {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[] {1, 4, 2, 5, 7, 4};

        System.out.println("Please give a number for low: ");
        int low = getRange();
        System.out.println("Please give a number for high: ");
        int high = getRange();

        int highPosition = getMaxPosition(arr, low, high);

        System.out.println("Array's position with the biggest element is: " + highPosition);
    }

    public static int getRange() {
        return input.nextInt();
    }

    public static int getMaxPosition(int[] arr, int low, int high) {
        int highPosition = low;
        int maxEl = arr[low];

        for (int i = low + 1; i <= high; i++) {
            if (arr[i] > maxEl) {
                maxEl = arr[i];
                highPosition = i;
            }
        }

        return highPosition;
    }
}
