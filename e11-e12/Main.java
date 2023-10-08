/**
 * Main class for exercise.
 *
 * @author Jussi Pohjolainen
 */
public class Main {
    /**
     * Main method - starting point for the app.
     *
     * @param args Command line arguments
     */
    public static void main(final String[] args) {
        System.out.println(isPalindrome("saippuakauppias"));
        System.out.println(isPalindrome("saip pua kaupp ias", false));
    }

    /**
     * Checks if the given string is a palindrome.
     * @param original Original string.
     * @return True if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(final String original) {
        String reversed = "";
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed += original.charAt(i);
        }
        return original.equals(reversed);
    }

    /**
     * Checks if the given string is a palindrome.
     * @param original Original string.
     * @param includeWhiteSpaces Flag to include or ignore white spaces.
     * @return True if the string is a palindrome, false otherwise.
     */
    public static boolean isPalindrome(final String original,
                                       final boolean includeWhiteSpaces) {
        String modifiedOriginal = original;
        if (!includeWhiteSpaces) {
            modifiedOriginal = "";
            for (int i = 0; i < original.length(); i++) {
                char character = original.charAt(i);
                if (character != ' ') {
                    modifiedOriginal += character;
                }
            }
        }
        return isPalindrome(modifiedOriginal);
    }
}
