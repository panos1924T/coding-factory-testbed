package gr.aueb.cf.cf9.ch7;

/**
 * Κρυπτογράφηση: Μία μέθοδος που λαμβάνει ως
 * είσοδο ένα String που το κρυπτογραφεί
 * αντικαθιστώντας κάθε χαρακτήρα του String με τον
 * λεξικογραφικά επόμενο. Επιστρέφει το
 * κρυπτογραφημένο
 * – Αποκρυπτογράφηση: Μία μέθοδος που λαμβάνει ως
 * είσοδο ένα κρυπτογραφημένο String και το
 * αποκρυπτογραφεί / αντικαθιστώντας κάθε χαρακτήρα
 * του String με τον λεξικογραφικά προηγούμενο
 */
public class EncryptionApp {

    public static void main(String[] args) {
        String str = "secret";

        System.out.println("Before encryption: " + str);
        String str2 = encryption(str);
        System.out.println("After encryption: " + str2);

        String str3 = decryption(str2);
        System.out.println("After decryption: " + str3);
    }

    /**
     * Η μέθοδος αυτή δέχεται ένα string και το
     * κρυπτογραφεί μετατρέποντας κάθε γράμμα με
     * το αμέσως επόμενο αλφαβητικά.
     * @param str       η λέξη για κρυπτογράφηση
     * @return          η κρυπτογραφημένη λέξη
     */
    public static String encryption(String str) {
        StringBuilder sb = new StringBuilder(str);
        char nextChar = 0;

        for (int i = 0; i < str.length(); i++) {
            nextChar = (char) (sb.charAt(i) + 1);
            sb.setCharAt((i), nextChar);
        }

        return sb.toString();
    }

    /**
     * Η μέθοδος αυτή δέχεται ένα string και το
     * αποκρυπτογραφεί μετατρέποντας κάθε γράμμα με
     * το αμέσως προηγούμενο αλφαβητικά.
     * @param str       η λέξη για αποκρυπτογράφηση
     * @return          η αποκρυπτογραφημένη λέξη
     */
    public static String decryption(String str) {
        StringBuilder sb = new StringBuilder(str);
        char prevChar = 0;

        for (int i = 0; i < str.length(); i++) {
            prevChar = (char) (sb.charAt(i) - 1);
            sb.setCharAt((i), prevChar);
        }

        return sb.toString();
    }
}
