package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Αναπτύξτε ένα πρόγραμμα που βρίσκει το
 * 2ο μικρότερο στοιχείο ενός πίνακα, το
 * στοιχείο δηλαδή που είναι αμέσως
 * μεγαλύτερο από το ελάχιστο στοιχείο
 */
public class Find2ndMin {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int min2 = 0;
        int[] arr = new int[5];
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = getInput();
        }

        arrayBubbleSort(arr);

        findAndPrintSecondMin(arr);
    }

    /**
     * Χρησιμοποιείται για να διαβάσει input
     * από τον χρήστη.
     * @return      user's input
     */
    public static int getInput() {
        return input.nextInt();
    }

    /**
     * Ταξινομεί τον πίνακα με την μέθοδο
     * bubble sort
     * @param arr       ο πίνακας για sort
     */
    public static void arrayBubbleSort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }

    }

    /**
     * Η μέθοδος αυτή ανταλλάσει στοιχεία του
     * πίνακα ώστε να τον ταξινομήσουμε.
     * @param arr       ο πίνακας
     * @param j         το μπροστά στοιχείο
     *                  του πίνακα
     * @param i         το επόμενο στοιχείο
     *                  από το j
     */
    public static void swap(int[] arr, int j, int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    /**
     * Βρίσκει και τυπώνει το 2ο μικρότερο στοιχείο.
     * Αν όλα τα στοιχεία είναι ίσα, τυπώνει σχετικό μήνυμα.
     * @param αrr Ο ταξινομημένος πίνακας
     */
    public static void findAndPrintSecondMin(int[] αrr) {
        int min2 = 0;
        boolean found = false;

        for (int i = 0; i < αrr.length - 1; i++) {
            if (αrr[i + 1] > αrr[i]) {
                min2 = αrr[i + 1];
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("The second lowest element is: " + min2);
        } else {
            System.out.println("All elements are equal!");
        }
    }
}