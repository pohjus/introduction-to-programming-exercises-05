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
        print(4, 'x');
    }

    /**
     * Prints a character multiple times.
     * @param amount number of times to print the character
     * @param character the character to print
     */
    public static void print(int amount, char character) {
        for(int i = 0; i < amount; i++) {
            System.out.print(character);
        }
    }
}
