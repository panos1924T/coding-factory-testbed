package gr.aueb.cf.cf9.ch6;

/**
 * • Έστω ένας ταξινομημένος πίνακας με επαναλαμβανόμενα
 * στοιχεία. Γράψτε μία μέθοδο int[] getLowAndHighIndexOf(int[]
 * arr, int key) που να υπολογίζει και να επιστρέφει τα low και high
 * index ενός πίνακα arr, για ένα ακέραιο key που λαμβάνει ως
 * παράμετρο.
 * • Γράψτε και μία main() που να βρίσκει το low και high index για
 * τον πίνακα {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8}. Για παράδειγμα, αν
 * δώσουμε ως τιμή το 8, θα πρέπει να επιστρέφει {7, 11}.
 * • Hint. Ελέγξτε αν το key περιέχεται στον πίνακα και σε ποια θέση.
 * Αν ναι, τότε από τη θέση αυτή μετρήστε τα στοιχεία όσο
 * υπάρχουν στοιχεία με ίδια τιμή και μέχρι να βρείτε το τέλος του
 * πίνακα.
 */
public class GetLowAndHighIndexCorrect {

    public static void main(String[] args) {
        int[] arr = new int[] {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
        int key = 8;

        int[] lowAndHighKeyOfArr = getLowAndHighIndexOf(arr, key);

        System.out.printf("Low: %d, High: %d", lowAndHighKeyOfArr[0], lowAndHighKeyOfArr[1]);
    }

    /**
     * υπολογίζει και να επιστρέφει τα low και high
     * index ενός πίνακα arr, για ένα ακέραιο key που λαμβάνει ως
     * παράμετρο.
     * @param arr       ο πίνακας
     * @param key       παράμετρος
     * @return          low και high
     *                  index του πίνακα
     */
    public static int[] getLowAndHighIndexOf(int[] arr, int key) {
        int lowIndex = -1;
        int highIndex = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                if (lowIndex == -1) lowIndex = i;
                highIndex = i;
            } else if (arr[i] > key) {
                break;
            }
        }

        return new int[] {lowIndex, highIndex};
    }
}
