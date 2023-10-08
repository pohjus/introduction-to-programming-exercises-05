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
        final int amountOfChars = 4;
        System.out.println(generateString(amountOfChars, 'x'));
    }

    /**
     * Generates a string of repeated characters.
     * @param amount number of times to repeat the character
     * @param character the character to repeat
     * @return generated string
     */
    public static String generateString(final int amount,
                                        final char character) {
        String returnValue = "";
        for (int i = 0; i < amount; i++) {
            returnValue += character;
        }
        return returnValue;
    }
}
