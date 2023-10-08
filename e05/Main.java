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
        int a = Integer.parseInt(console.readLine());
        int b = Integer.parseInt(console.readLine());
        System.out.println(sum(a, b));
    }

    /**
     * Returns the sum of two integers.
     * @param a first integer
     * @param b second integer
     * @return sum of a and b
     */
    public static int sum(final int a, final int b) {
        return a + b;
    }
}
