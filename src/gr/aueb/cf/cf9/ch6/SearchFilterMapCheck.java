package gr.aueb.cf.cf9.ch6;

import java.util.Scanner;

/**
 * Έστω ένας πίνακας με στοιχεία της επιλογής σας. Γράψτε
 * μεθόδους που κάνουν τα παρακάτω:
 * • 1. Αναζήτηση ενός στοιχείου στον πίνακα (Επιστρέφει την θέση
 * του στοιχείου)
 * • 2. Φιλτράρισμα των ζυγών (επιστρέφει void, μόνο εκτύπωση των
 * ζυγών)
 * • 3. Mapping κάθε στοιχείου του πίνακα με το διπλάσιο (η μέθοδος
 * επιστρέφει πίνακα)
 * • 4. Έλεγχος αν υπάρχει έστω ένας θετικός αριθμός (η μέθοδος
 * πρέπει να επιστρέφει boolean)
 * • 5. Έλεγχος αν όλα τα στοιχεία του πίνακα είναι θετικοί (η
 * μέθοδος πρέπει να επιστρέφει boolean)
 */
public class SearchFilterMapCheck {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[] {1, 5, 3, 7, 4, 8};

        //Searching for an element.
        System.out.println("Please give the number you want to Search: ");
        int choice = giveInput();
        int choicePosition = searchElement(arr, choice);

        if (choicePosition == -1) {
            System.out.println("The element you chose doesn't exist " +
                    "in the array!");
        } else {
            System.out.println("The position's array of your element is: "
            + choicePosition);
        }

        //Filtering for a target.
        System.out.println("Filtering the array for Even numbers: ");
        giveEvens(arr);

        //Mapping for the elements doubles.
        System.out.println("Original array: ");
        for (int el : arr) {
            System.out.print(el + " ");
        }

        int[] doubledArray = mapDouble(arr);

        System.out.println("Doubled array: ");
        for (int el : doubledArray) {
            System.out.print(el + " ");
        }

        //Check if there is at least one positive num in the array.
        System.out.println("Are there at least one positive number " +
                "in the array? " + atLeastOnePos(arr));

        //Check if all the array's elements are positive numbers.
        System.out.println("Are all the elements of the array positive " +
                "numbers? " + areAllPositiveNums(arr));
    }

    /**
     * Χρησιμοποιείται για να διαβάσει input
     * από τον χρήστη.
     * @return      user's input
     */
    public static int giveInput() {
        return input.nextInt();
    }

    /**
     * Χρησιμοποιείται για να βρει έναν αριθμό
     * μέσα στον πίνακα.
     * @param arr       ο πίνακας
     * @param choice    το target
     * @return          η θέση του target ή -1
     *                  αν δεν υπάρχει.
     */
    public static int searchElement(int[] arr, int choice) {

        for (int i = 0; i < arr.length; i++) {
            if (choice == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    /**
     * Κάνει filter τον πίνακα για να βρει τους
     * ζυγούς και τους εκτυπώνει.
     * @param arr       ο πίνακας
     */
    public static void giveEvens(int[] arr) {
        for (int el : arr) {
            if (el % 2 == 0) {
                System.out.print(el + "  ");
            }
        }
        System.out.println();
    }

    /**
     * Διπλασιάζει τις τιμές του πίνακα
     * @param arr       ο πίνακας
     * @return          ο καινούργιος πίνακας
     */
    public static int[] mapDouble(int[] arr) {
        int[] doubledArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            doubledArray[i] = arr[i] * 2;
        }
        return doubledArray;
    }

    /**
     * Ψάχνει για έναν τουλάχιστον θετικό αριθμό.
     * Αν τον βρει τελειώνει η μέθοδος.
     * @param arr       ο πίνακας
     * @return          true or false ανάλογα αν βρήκε
     *                  θετικό ή όχι.
     */
    public static boolean atLeastOnePos(int[] arr) {
        int count = 0;
        for (int el : arr) {
            if (el > 0) count++;
            if (count >= 1) return true;
        }
        return false;

//        public static boolean atLeastOnePos(int[] arr) {
//            for (int el : arr) {
//                if (el > 0) return true;  // ✅ Άμεση επιστροφή
//            }
//            return false;
//        }
    }

    /**
     * Ελέγχει αν είναι όλα τα στοιχεία θετικοί αριθμοί.
     * @param arr       ο πίνακας
     * @return          true or false ανάλογα το αποτέλεσμα.
     */
    public static boolean areAllPositiveNums(int[] arr) {
        for (int el : arr) {
            if (el < 0) return false;
        }
        return true;
    }
}

