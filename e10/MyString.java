/**
 * Class providing custom String manipulation methods.
 */
public class MyString {

    /**
     * Replaces all instances of a character in a String with another String.
     * @param original Original string.
     * @param characterToBeFound Character to replace.
     * @param replace String to replace character with.
     * @return New string with replacements.
     */
    public static String replaceAll(final String original, final char characterToBeFound, final String replace) {
        String newString = "";
        for (int i = 0; i < original.length(); i++) {
            char character = original.charAt(i);
            if (character == characterToBeFound) {
                newString += replace;
            } else {
                newString += character;
            }
        }
        return newString;
    }
}
