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
        tulostaTervehdys();
        tulostaNimi();
    }

    /**
     * Method that outputs "Hei".
     */
    public static void tulostaTervehdys() {
        System.out.print("Hei ");
    }

    /**
    * Mehto that outputs "Jussi".
    */
    public static void tulostaNimi() {
        System.out.println("Jussi");
    }
}
