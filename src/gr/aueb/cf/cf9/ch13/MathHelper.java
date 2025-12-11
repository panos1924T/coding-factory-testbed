package gr.aueb.cf.cf9.ch13;

/**
 * Υλοποιήστε μία utility class με όνομα MathHelper
 * με public static μεθόδους για κοινές μαθηματικές
 * λειτουργίες όπως εύρεση του μέγιστου,
 * ελάχιστου, και μέσου όρου ενός array από
 * integers.
 */
public class MathHelper {

    private MathHelper() {}

    public static int getMaxPosition(int[] arr) {
        int max = Integer.MIN_VALUE;
        int maxPosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }

    public static int getMinPosition(int[] arr) {
        int min = arr[0];
        int minPosition = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static double getAverage(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return (double) (sum / (arr.length + 1));
    }
}
