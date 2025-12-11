package gr.aueb.cf.cf9.ch13;

public class StringUtils {

    private StringUtils() {
    }

    public static String reverseString(String str) {
//        String reversed = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            reversed += str.charAt(i);
//        }
//        return reversed;
//    }

        if (str == null) return null;
        if (str.length() == 1) return str;
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

    public static String stringToUppercase(String str) {
        return str.toUpperCase();
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        if (str.length() <= 1) return true;

//         first way using first class method
//        if (str.equals(reverseString(str))) return true;

        // second more efficient way
        int i = 0;
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
}