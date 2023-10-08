/**
 * Main class for exercise.
 *
 * @author Jussi Pohjolainen
 */
public class Main {
    static int a;
    static int b;
    static int summa;

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
        a = 5;
    }

    /**
     * Sets value of b.
     */
    public static void asetaB() {
        b = 5;
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
