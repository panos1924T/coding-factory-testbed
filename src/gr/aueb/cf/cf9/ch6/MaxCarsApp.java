package gr.aueb.cf.cf9.ch6;

import java.util.Arrays;

/**
 *
 */
public class MaxCarsApp {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};

        // 1. Μέθοδος που φτιάχνει τον πίνακα γεγονότων
        int[][] events = createEventsTable(arr);

        // 2. Μέθοδος που ταξινομεί τον πίνακα
        sortEventsTable(events);

        // 3. Μέθοδος που υπολογίζει και τυπώνει το αποτέλεσμα
        calculateMaxCars(events);
    }

    public static int[][] createEventsTable(int[][] arr) {
        int[][] events = new int[2 * arr.length][2];

        for (int i = 0; i < arr.length; i++) {
            // Άφιξη: Ώρα και τύπος 1
            events[2 * i][0] = arr[i][0];
            events[2 * i][1] = 1;

            // Αναχώρηση: Ώρα και τύπος 0
            events[2 * i + 1][0] = arr[i][1];
            events[2 * i + 1][1] = 0;
        }
        return events;
    }

    public static void sortEventsTable(int[][] events) {
        // Χρησιμοποιούμε την ενσωματωμένη sort με έναν "Lambda expression" κανόνα
        Arrays.sort(events, (a, b) -> Integer.compare(a[0], b[0]));
        //Αυτή η γραμμή λέει στην Java:
        // "Όταν έχεις να συγκρίνεις δύο γραμμές a και b,
        // σύγκρινε τον αριθμό στη θέση 0 της γραμμής a
        // με τον αριθμό στη θέση 0 της γραμμής b".
        // Έτσι, ο πίνακας θα ταξινομηθεί αύξουσα με βάση την ώρα.


    }

    public static void calculateMaxCars(int[][] events) {
        int maxCars = 0;
        int currentCars = 0;

        // Διατρέχουμε τον ταξινομημένο πίνακα γεγονότων γραμμή-γραμμή
        for (int[] event : events) {

            // events[i][1] είναι ο Τύπος (1 = Άφιξη, 0 = Αναχώρηση)
            int type = event[1];

            if (type == 1) {
                // Αν είναι Άφιξη, αυξάνουμε τα παρόντα αυτοκίνητα
                currentCars++;
            } else {
                // Αν είναι Αναχώρηση (τύπος 0), μειώνουμε τα παρόντα αυτοκίνητα
                currentCars--;
            }

            // ΣΕ ΚΑΘΕ βήμα, ελέγχουμε αν σπάσαμε το ρεκόρ
            if (currentCars > maxCars) {
                maxCars = currentCars;
            }
        }

        System.out.println("Ο μέγιστος αριθμός σταθμευμένων αυτοκινήτων ήταν: " + maxCars);
    }
}
