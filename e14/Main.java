import java.io.Console;

/**
 * Class E15 for a simple board game involving a player and bombs.
 */
public class Main {
    /**
     * The start of a board slot.
     */
    public static final String SLOT_START = "[";

    /**
     * The end of a board slot.
     */
    public static final String SLOT_END = "]";

    /**
     * Representation of an empty slot.
     */
    public static final String EMPTY = SLOT_START + " " + SLOT_END;

    /**
     * Representation of a player slot.
     */
    public static final String PLAYER = SLOT_START + "P" + SLOT_END;

    /**
     * Representation of a bomb slot.
     */
    public static final String BOMB = SLOT_START + "B" + SLOT_END;

    /**
     * Representation of a slot containing both a bomb and a player.
     */
    public static final String BOMB_AND_PLAYER = SLOT_START + "BP" + SLOT_END;

    /**
     * Main method for the game logic.
     * @param args command-line arguments (not used).
     */
    public static void main(final String[] args) {
        Console console = System.console();

        // Generate board with bombs
        String[] board = generateBoard(10);

        // Initial board display
        printBoard(board, false, false);

        int place = getUserInput("Anna pelaajan paikka: ", 0, board.length - 1, console);

        // Place the player
        if (EMPTY.equals(board[place])) {
            board[place] = PLAYER;
        } else if (BOMB.equals(board[place])) {
            board[place] = BOMB_AND_PLAYER;
        }

        // Display board with player
        printBoard(board, true, false);

        System.out.println("Kortit käännetään");

        // Display board with player and bombs
        printBoard(board, true, true);

        // Bomb check
        if (BOMB_AND_PLAYER.equals(board[place])) {
            System.out.println("CRASH!");
        }
    }

    /**
     * Get and validate user input
     * @param prompt Prompt to show the user.
     * @param min Minimum acceptable value.
     * @param max Maximum acceptable value.
     * @param console Console for user input.
     * @return Validated user input.
     */
    public static int getUserInput(String prompt, int min, int max, Console console) {
        int place = -1;
        boolean valid = false;
        while (!valid) {
            try {
                String input = console.readLine(prompt);
                place = Integer.parseInt(input);
                if (place >= min && place <= max) {
                    valid = true;
                } else {
                    System.out.println("Invalid input. Try again.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Must be a number.");
            }
        }
        return place;
    }


    /**
     * Method to print the game board.
     * @param board Array representing the game board.
     * @param showPlayer Whether to show the player's position.
     * @param showBombs Whether to show the bomb positions.
     */
    public static void printBoard(final String[] board, final boolean showPlayer, final boolean showBombs) {
        for (String s : board) {
            if (showPlayer && showBombs) {
                System.out.print(s);
            } else if (showPlayer) {
                System.out.print(s.equals(PLAYER) ? PLAYER : EMPTY);
            } else {
                System.out.print(EMPTY);
            }
        }
        System.out.println();
    }

    /**
     * Method to generate the game board.
     * @param size Size of the game board.
     * @return Array representing the game board.
     */
    public static String[] generateBoard(final int size) {
        String[] board = new String[size];
        for (int i = 0; i < board.length; i++) {
            board[i] = EMPTY;
        }
        int numberOfBombs = size / 3;
        int placedBombs = 0;

        while (placedBombs < numberOfBombs) {
            int place = MyMath.getRandom(0, size - 1);
            if (board[place].equals(EMPTY)) {
                board[place] = BOMB;
                placedBombs++;
            }
        }
        return board;
    }
}
