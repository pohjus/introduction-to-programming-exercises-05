import java.io.Console;

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
        Console console = System.console();
        String input = console.readLine();
        int height = Integer.parseInt(input);

        for(int i = 0; i < height; i++) {
            System.out.println(generateString(height, 'X'));
        }
    }

    /**
     * Generates a string of repeated characters.
     * @param amount number of times to repeat the character
     * @param character the character to repeat
     * @return generated string
     */
    public static String generateString(int amount, char character) {
        String returnValue = "";
        for(int i = 0; i < amount; i++) {
            returnValue += character;
        }
        return returnValue;
    }
}
