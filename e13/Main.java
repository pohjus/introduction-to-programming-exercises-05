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
        System.out.println(MyMath.getRandom(0, 1));
    }
}

/**
 * Class containing custom math-related methods.
 */
class MyMath {

    /**
     * Returns a random integer between min and max, inclusive.
     * @param min The minimum value.
     * @param max The maximum value.
     * @return A random integer between min and max.
     */
    public static int getRandom(final int min, final int max) {
        if (min > max) {
            throw new IllegalArgumentException("max must be > min");
        }
        int distance = max - min;
        return (int) (Math.round(Math.random() * distance) + min);
    }
}
