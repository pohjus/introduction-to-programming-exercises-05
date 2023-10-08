/**
 * Class containing custom math-related methods.
 */
public class MyMath {

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
