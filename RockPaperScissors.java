/*
* The RockPaperScissors allows the user to
* play the Rock Paper Scissor game.
*
* @author  Daria Bernice Calitis
* @version 1.0
* @since   2022-09-20
*/

// Import Scanner
import java.util.Scanner;

/**
* .Class constructor RockPaperScissors.
*/
final class RockPaperScissors {
    /**
     * The number that represents Rock.
     */
    public static final int ROCK = 1;

    /**
     * The number that represents Paper.
     */
    public static final int PAPER = 2;

    /**
     * The number that represents Scissors.
     */
    public static final int SCISSORS = 3;

    /**
     * Win message.
     */
    public static final String WIN = "You win!";

    /**
     * Tie message.
     */
    public static final String TIE = "It's a tie!";

    /**
     * Lose message.
     */
    public static final String LOSE = "You lose!";

    /**
     * Invalid input message.
     */
    public static final String ERR_MSG = "Invalid Input.";

    /**
     * Computer move Rock.
     */
    public static final String COMP_ROCK = "Computer: Rock";

    /**
     * Computer move Paper.
     */
    public static final String COMP_PAPER = "Computer: Paper";

    /**
     * Computer move Scissors.
     */
    public static final String COMP_SCISSORS = "Computer: Scissors";

    /**
     * Prevent instantiation.
     * Throw an exception IllegalStateException
     * if this ever is called
     *
     * @throws IllegalStateException
     *
     */
    private RockPaperScissors() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
     * The starting main() function.
     *
     * @param args No args will be used
     */
    public static void main(final String[] args) {
        System.out.println("Rock Paper Scissors!");
        System.out.println("(Rock = 1, Paper = 2, Scissor = 3)");
        // Create Scanner Object
        final Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");

        try {
            // Gets a number that represents a move
            final int userMove = scan.nextInt();

            // Generates the computer's move
            final int computerMove = (int) (Math.random() * 3 + 1);

            // Determines if the user wins.
            switch (userMove) {
                case ROCK:
                    System.out.println("User: Rock");
                    switch (computerMove) {
                        case ROCK:
                            System.out.println(COMP_ROCK);
                            System.out.println(TIE);
                            break;
                        case PAPER:
                            System.out.println(COMP_PAPER);
                            System.out.println(LOSE);
                            break;
                        case SCISSORS:
                            System.out.println(COMP_SCISSORS);
                            System.out.println(WIN);
                            break;
                        default:
                            break;
                    }
                    break;
                case PAPER:
                    System.out.println("User: Paper");
                    switch (computerMove) {
                        case ROCK:
                            System.out.println(COMP_ROCK);
                            System.out.println(WIN);
                            break;
                        case PAPER:
                            System.out.println(COMP_PAPER);
                            System.out.println(TIE);
                            break;
                        case SCISSORS:
                            System.out.println(COMP_SCISSORS);
                            System.out.println(LOSE);
                            break;
                        default:
                            break;
                    }
                    break;
                case SCISSORS:
                    System.out.println("User: Scissors");
                    switch (computerMove) {
                        case ROCK:
                            System.out.println(COMP_ROCK);
                            System.out.println(LOSE);
                            break;
                        case PAPER:
                            System.out.println(COMP_PAPER);
                            System.out.println(WIN);
                            break;
                        case SCISSORS:
                            System.out.println(COMP_SCISSORS);
                            System.out.println(TIE);
                            break;
                        default:
                            break;
                    }
                    break;
                default:
                    System.out.println(ERR_MSG);
            }
        } catch (java.util.InputMismatchException error) {
            System.out.println(ERR_MSG);
        }

        System.out.println("\nDone.");
    }
}
