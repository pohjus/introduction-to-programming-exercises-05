/**
 * Main class for exercise.
 *
 * @author Jussi Pohjolainen
 */
@SuppressWarnings("checkstyle:VisibilityModifier")  // note update sun_checks.xml!
public class Main {
    /**
     * Variable can be used in all methods.
     */
    public static int a;

    /**
     * Variable can be used in all methods.
     */
    public static int b;

    /**
     * Variable can be used in all methods.
     */
    public static int summa;

    /**
     * Entry point of the program.
     * @param args final command-line arguments.
     */
    public static void main(final String[] args) {
        asetaA();
        asetaB();
        laskeYhteen();
        tulosta();
    }

    /**
     * Sets value of a.
     */
    public static void asetaA() {
        final int sumVariable = 5;
        a = sumVariable;
    }

    /**
     * Sets value of b.
     */
    public static void asetaB() {
        final int sumVariable = 5;
        b = sumVariable;
    }

    /**
     * Calculates the sum of a and b.
     */
    public static void laskeYhteen() {
        summa = a + b;
    }

    /**
     * Prints the sum.
     */
    public static void tulosta() {
        System.out.println(summa);
    }
}
