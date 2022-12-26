/*
* This program calculates microwave times from item and quantity
*
* @author  Huzaifa Khalid
* @version 1.0
* @since   2020-09-21
*/

import java.util.Scanner;

/**
* This is a microwave time calculator.
*/
final class MicrowaveTime {

    /**
    * Constant assigned to 1.
    */
    public static final int SUB_TIME = 60;

    /**
    * Constant assigned to 2.
    */
    public static final int SOUP_TIME = 105;

    /**
    * Constant assigned to 3.
    */
    public static final int PIZZA_TIME = 45;

    /**
    * Constant assigned to 1.
    */
    public static final int ONE = 1;

    /**
    * Constant assigned to 1.5.
    */
    public static final double ONE_AND_HALF = 1.5;

    /**
    * Constant assigned to 2.
    */
    public static final int TWO = 2;

    /**
    * Constant assigned to 3.
    */
    public static final int THREE = 3;

    /**
    * Constant assigned to 60.
    */
    public static final int SIXTY = 60;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */
    private MicrowaveTime() {
        throw new IllegalStateException("Cannot be instantiated");
    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {
        // Time determined variables
        double time = 0;
        double percent = 0;
        double minutes = 0;
        double seconds = 0;

        /*
        * Try-catch to ensure bad
        * input won't crash the program
        */
        try {
            // Input
            final Scanner foodObj = new Scanner(System.in);
            System.out.println(
                "What are you microwaving? "
                + "(1 for sub, 2 for soup, 3 for pizza): "
            );
            final float food = foodObj.nextInt();
            final Scanner quantityObj = new Scanner(System.in);
            System.out.println(
                "How many would you like to microwave? (max is 3): "
            );
            final float quantity = quantityObj.nextInt();

            // Process
            if (food == ONE) {
                time = SUB_TIME;
            } else if (food == TWO) {
                time = SOUP_TIME;
            } else if (food == THREE) {
                time = PIZZA_TIME;
            } else {
                System.out.println("\nInvalid Input for First Prompt.");
            }

            if (quantity == ONE) {
                percent = ONE;
            } else if (quantity == TWO) {
                percent = ONE_AND_HALF;
            } else if (quantity == THREE) {
                percent = TWO;
            } else {
                System.out.println("\nInvalid Input for Second Prompt.");
            }

            time = time * percent;
            seconds = time % SIXTY;
            minutes = Math.floor(time / SIXTY);

            // Output
            if (time > 0) {
                System.out.println("\nSet minutes to " + minutes
                                + " and seconds to " + seconds + ".");
            }
        } catch (java.util.InputMismatchException ex) {
            System.out.println("\nInvalid Input.");
        } finally {
            System.out.println("\nDone.");
        }
    }
}
