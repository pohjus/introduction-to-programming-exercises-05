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
        String mj1 = "abc:abc:";
        String mj2 = MyString.replaceAll(mj1, ':', "moi");
        System.out.println(mj2);  // abcmoiabcmoi
    }
}
