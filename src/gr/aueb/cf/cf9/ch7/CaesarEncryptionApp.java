package gr.aueb.cf.cf9.ch7;

import java.util.Scanner;

/**
 *Ο αλγόριθμος του Καίσαρα.
 * Κάθε γράμμα στο αρχικό μήνυμα (plaintext) μετατοπίζεται
 * κατά έναν συγκεκριμένο αριθμό θέσεων στο
 * αλφάβητο. Ο αριθμός θέσεων ονομάζεται "κλειδί". Κάθε γράμμα
 * στο αρχικό μήνυμα μετατοπίζεται προς τα δεξιά κατά έναν σταθερό
 * αριθμό θέσεων στο αλφάβητο. Για παράδειγμα, με κλειδί 3: Α γίνεται Δ.
 * Οι μη αλφαβητικοί χαρακτήρες (π.χ. αριθμοί, σημεία στίξης)
 * συνήθως παραμένουν αμετάβλητοι. Για την αποκρυπτογράφηση,
 * η διαδικασία αντιστρέφεται.
 */
public class CaesarEncryptionApp {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please give the sentence/word you want" +
                " to encrypt: ");
        String str = input.nextLine();

        System.out.println("Now give the key for encryption (should be" +
                " between 1 - 23): ");
        int key = input.nextInt();
        input.nextLine();

        if (key < 1 || key > 23) {
            throw new RuntimeException("The key you chose is out" +
                    " of bounds! Please, try again.");
        }

        System.out.println("Before encryption: " + str);
        String encryptedStr = encrypt(str, key);
        System.out.println("After encryption: " + encryptedStr);

        String decryptedStr = decrypt(encryptedStr, key);
        System.out.println("After decryption: " + decryptedStr);
    }

    /**
     * Η μέθοδος αυτή δέχεται ένα string και το
     * κρυπτογραφεί προσθέτοντας το key σε κάθε
     * γράμμα αλφαβητικά.
     * @param str       η φράση για encrypt
     * @param key       το κλειδί για τη μετατροπή
     * @return          η κρυπτογραφημένη φράση
     */
    public static String encrypt(String str, int key) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            char keyChar = (char) (sb.charAt(i) + key);
            sb.setCharAt(i, keyChar);
        }

        return sb.toString();
    }

    /**
     * Η μέθοδος αυτή δέχεται ένα string και το
     * αποκρυπτογραφεί αφαιρώντας το key σε κάθε
     * γράμμα αλφαβητικά.
     * @param str       η φράση για decrypt
     * @param key       το κλειδί για τη μετατροπή
     * @return          η αποκρυπτογραφημένη φράση.
     */
    public static String decrypt(String str, int key) {
        StringBuilder sb = new StringBuilder(str);

        for (int i = 0; i < str.length(); i++) {
            char keyChar = (char) (sb.charAt(i) - key);
            sb.setCharAt(i, keyChar);
        }

        return sb.toString();
    }
}
