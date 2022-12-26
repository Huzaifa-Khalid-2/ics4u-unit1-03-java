/*
 * The program shows how to get input
 *   and deal with numbers.
 *
 * @author  Huzaifa Khalid
 * @version 1.0
 * @since   2022-09-14
 */

import java.io.Console;

/**
* This is the log calculator program.
*/
final class LogCalculator {
    /**
     * Maximum capacity of the truck
     */
    public static final float truckCapacity = 1100;

    /**
     * Average weight of maple logs
     */
    public static final float mapleWeight = 20;
    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private LogCalculator() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final Console console = System.console();
        final String logLengthString = console.readLine(
                "How long are the logs(m) : ");

        final float logLength = Float.valueOf(logLengthString);

        final float logAmount = truckCapacity / (mapleWeight * logLength);

        // print out answer
        System.out.println(logAmount + " Logs ca fit in the truck ");
        System.out.println("\nDone.");
    }
}
