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
        // Using Console for input
        Console console = System.console();
        String name = console.readLine();
        tulostaJokinNimi(name);
    }

    /**
     * Prints the input name to the console.
     * @param nimi the name to print
     */
    public static void tulostaJokinNimi(String nimi) {
        System.out.println(nimi);
    }
}
