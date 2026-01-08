package gr.aueb.cf.cf9.christmas_review;

import java.util.Arrays;

/**
 *  * Δίνονται δύο πίνακες -ένας για την Alice και ένας για τον Bob -με 3 βαθμολογίες κάθε ένας.
 *  * Συγκρίνετε τις βαθμολογίες και επιστρέψτε τους πόντους κάθε παίκτη.
 *  * Οι Alice και Bob αξιολογούνται σε 3 κατηγορίες (π.χ., Μουσική, Προγραμματισμός, Γρήγορη Σκέψη).
 *  * Κάθε κατηγορία δίνει βαθμολογία από 1 έως 100.
 *  *
 *  * Αν η Alice έχει μεγαλύτερη βαθμολογία σε μια κατηγορία, παίρνει 1 πόντο.
 *  * Αν ο Bob έχει μεγαλύτερη βαθμολογία, παίρνει εκείνος 1 πόντο.
 *  * Αν είναι ίσοι, κανείς δεν παίρνει πόντο.
 *  *
 *  * Επιστροφή: Πίνακας με 2 θέσεις [πόντοι_Alice, πόντοι_Bob]
 *  */
public class compareTriplets {

    public static void main(String[] args) {
        int[] bob = {70, 85, 100};
        int[] alice = {80, 80, 90};

        System.out.println(Arrays.toString(compareScores(bob, alice)));
    }

    public static int[] compareScores(int[] bob, int[] alice) {
        int[] scores = new int[2];

        for (int i = 0; i < bob.length; i++) {
            if (bob[i] > alice[i]) scores[0] ++;
            else if (alice[i] > bob[i]) scores[1]++;
        }
        return scores;
    }
}
