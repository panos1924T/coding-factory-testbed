package gr.aueb.cf.cf9.christmas_review;

/**
 * Δίνεται ένας τετραγωνικός πίνακας.
 * Να υπολογιστεί η απόλυτη διαφορά μεταξύ των αθροισμάτων των διαγωνίων του.
 * Παράδειγμα:

 *     {1, 2, 3},
 *     {4, 5, 6},
 *     {9, 8, 9}
 *
 * Κύρια Διαγώνιος (1, 5, 9):
 * 1 + 5 + 9 = 15
 *
 * Δευτερεύουσα Διαγώνιος (3, 5, 9):
 * 3 + 5 + 9 = 17
 *
 * Διαφορά:
 * |15 - 17| = 2
 */
public class diagonalDiff {

    public static void main(String[] args) {
        int[][] array = { {3, 1, 3},
                          {1, 2, 3},
                          {3, 2, 1} };

        System.out.println("The difference is: " + diagonalDif(array));
    }

//    public static int diagonalDif(int[][] arr) {
//
//        int diagA = arr[0][0] + arr[1][1] + arr[2][2];
//        int diagB = arr[0][2] + arr[1][1] + arr[2][0];
//
//        return Math.abs(diagA - diagB);
//    }

    public static int diagonalDif(int[][] arr) {
        int diagA = 0;
        int diagB = 0;

        for (int i = 0; i < arr.length; i++) {  // θέλω να μπει μόνο τρεις φορές, για 0,1,2
            diagA += arr[i][i];
            diagB += arr[i][arr.length - i - 1];
        }

        return Math.abs(diagA - diagB);
    }


}
