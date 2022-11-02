/*
* The program gets a a vehicle
* and it calculates the stats.
*
* @author  Jackson Naufal
* @version 1.0
* @since   2020-10-17
*
* This is a Vehicle program
*/

/**
 * This is the main CarStatus Class.
 * Class CarStatus
 */
final class Main {

    /**
    * This is 212.
    */
    public static final int TWOTWELVE = 212;

    /**
    * This is 422.
    */
    public static final int FOURTWENTYTWO = 422;

    /**
     * This is 0.
    */
    public static final int ZERO = 0;

    /**
     *  This is 5000.
    */
    public static final int FIVETHOUSAND = 5000;

    /**
     * This is 2.
         */
    public static final int TWO = 2;

    /**
    * This is 4.
    */
    public static final int FOUR = 4;

    /**
    * Prevent instantiation.
    * Throw an exception IllegalStateException.
    * if this ever is called
    *
    * @throws IllegalStateException
    *
    */

    private Main() {
        throw new IllegalStateException("Cannot be instantiated");

    }

    /**
    * The starting main() function.
    *
    * @param args No args will be used
    */
    public static void main(final String[] args) {

        final Biplane biplane = new Biplane();
        biplane.setSpeed(TWOTWELVE);
        System.out.println(biplane.getSpeed());

        final Boeing boeing = new Boeing();
        boeing.setSpeed(FOURTWENTYTWO);
        System.out.println(boeing.getSpeed());

        int counter = ZERO;

        while (counter < FOUR) {
            boeing.accelerate();
            System.out.println(boeing.getSpeed());
            if (boeing.getSpeed() > FIVETHOUSAND) {
                biplane.setSpeed(biplane.getSpeed() * TWO);
            } else {
                boeing.accelerate();
            }
            counter++;
        }
        System.out.println(biplane.getSpeed());
        System.out.println("\nDone!");
    }
}
