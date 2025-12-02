package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Ζητήστε από τον χρήστη να εισάγει έξι ακεραίους από
 * 1 έως 49 και ελέγξτε αν αυτή η εξάδα περνάει από τα
 * παρακάτω φίλτρα (predicates)
 * 1. Δεν έχει πάνω από 3 άρτιους
 * 2. Δεν έχει πάνω από 3 περιττούς
 * 3. Δεν έχει πάνω από 3 συνεχόμενους
 * 4. Δεν έχει πάνω από 3 αριθμούς με τον ίδιο λήγοντα
 * 5. Δεν έχει πάνω από 3 αριθμούς στην ίδια δεκάδα
 */
public class PredicatesApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //Δηλώσεις μεταβλητών.
        int[] arr = new int[6];

        //Γέμισμα του πίνακα με input από τον χρήστη.
        System.out.println("Please give six numbers within 1 and 49 : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getInput();
            if (arr[i] < 1 || arr[i] > 49) {
                throw new RuntimeException("Your choice number is out" +
                        " of bounds. Please try again! ");
            }
        }

        //Ερώτημα 1.
        System.out.println("Does the array has 3 or less" +
                " even numbers? " + hasLessThanThreeEven(arr));

        //Ερώτημα 2.
        System.out.println("Does the array has 3 or less" +
                " odd numbers? " + hasLessThanThreeOdd(arr));

        //Ερώτημα 3.
        sortArr(arr);
        System.out.println("Does the array have 3 or less consecutive numbers? "
        + hasAtMostThreeConsecutiveNumbers(arr));

        //Ερώτημα 4.
        System.out.println("Does the array have 3 or less numbers with the same last digit? "
                + hasAtMostThreeSameEnding(arr));

        //Ερώτημα 5.
        System.out.println("Does the array have 3 or less numbers in the same decade? "
                + hasAtMostThreeInDecade(arr));
    }

    /**
     * Διάβασμα στοιχείων από τον χρήστη.
     * @return      input του χρήστη.
     */
    public static int getInput() {
        return input.nextInt();
    }

    /**
     * Χρησιμοποιούμε την μέθοδο για να βρούμε
     * αν ο πίνακας έχει πάνω από 3 ζυγούς.
     * @param arr       ο πίνακας
     * @return          true or false
     */
    public static boolean hasLessThanThreeEven(int[] arr) {
        int count = 0;
        for (int el : arr) {
            if (el % 2 == 0) count++;
            if (count > 3) return false;
        }
        return true;
    }

    /**
     * Χρησιμοποιούμε την μέθοδο για να βρούμε
     * αν ο πίνακας έχει πάνω από περιττούς.
     * @param arr       ο πίνακας
     * @return          true or false
     */
    public static boolean hasLessThanThreeOdd(int[] arr) {
        int count = 0;
        for (int el : arr) {
            if (el % 2 != 0) count++;
            if (count > 3) return false;
        }
        return true;
    }

    /**
     * Χρησιμοποιούμε την μέθοδο για να ταξινομήσουμε
     * τον πίνακα
     * @param arr       ο πίνακας
     */
    public static void sortArr(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    /**
     * Κάνει swap στοιχεία του πίνακα
     * @param arr       ο πίνακας
     * @param j         μεταβλητή για στοιχείο του πίνακα
     * @param i         μεταβλητή για στοιχείο του πίνακα.
     */
    public static void swap(int[] arr,int j,int i) {
        int temp = arr[j];
        arr[j] = arr[i];
        arr[i] = temp;
    }

    /**
     * Χρησιμοποιούμε την μέθοδο για να βρούμε
     * αν ο πίνακας έχει πάνω από τρεις
     * συνεχόμενους αριθμούς. (πχ, 1, 2, 3, 4, 12, 28)
     * @param arr       ο πίνακας
     * @return          true or false
     */
    public static boolean hasAtMostThreeConsecutiveNumbers(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] == 1) {
                count++;
            } else {
                count = 0;
            }
            if (count > 2) return false;
        }
        return true;
    }

    /**
     * Χρησιμοποιούμε την μέθοδο για να βρούμε
     * αν πάνω από τρεις αριθμοί του πίνακα
     * έχουν το ίδιο τελευταίο ψηφίο.
     * @param arr       ο πίνακας
     * @return          true or false
     */
    public static boolean hasAtMostThreeSameEnding(int[] arr) {
        int[] countArray = new int[10];
        for (int el : arr) {
            if (++countArray[el % 10] > 3) return false;
        }
        return true;
    }

    /**
     * Χρησιμοποιούμε την μέθοδο για να βρούμε
     * αν πάνω από τρεις αριθμοί του πίνακα
     * ανήκουν στην ίδια δεκάδα (πχ 0-9, 10-19, κλπ).
     * @param arr       ο πίνακας
     * @return          true or false.
     */
    public static boolean hasAtMostThreeInDecade(int[] arr) {
        int[] countArray = new int[5];
        for (int el : arr) {
            if (++countArray[el / 10] > 3) return false;
        }
        return true;
    }
}
