package gr.aueb.cf.cf9.ch6;

public class GetLowAndHighIndex {

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
        int start = 0;
        int end = arr.length - 1;
        int lowIndex = -1;
        int highIndex = arr.length;

        // Finding the low index.
        while (start <= end) {
            int mid = end / 2;
            if (arr[mid] == key) lowIndex = mid;
            end = mid - 1;
            if (arr[mid] < key) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        //Check if the key doesn't exist and break.
        if (lowIndex == -1) return new int[] {-1, -1};

        //Finding the high index.
        start = lowIndex;
        end = arr.length -1;

        while (start <= end) {
            int mid = end / 2;
            if (arr[mid] == key) highIndex = mid;
            start = mid + 1;
        }

        return  new int[]{lowIndex, highIndex};
    }
}
