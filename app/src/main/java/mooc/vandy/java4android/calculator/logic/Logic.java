package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Performs an operation selected by the user.
 */
public class Logic implements LogicInterface {
    /**
     * Reference to the Activity output.
     */
    protected ActivityInterface mOut;
    private static final int ADDITION = 1;
    private static final int SUBSTRACTION = 2;
    private static final int MULTIPLICATION = 3;
    private static final int DIVISION = 4;


    /**
     * Constructor initializes the field.
     */
    public Logic(ActivityInterface out) {
        mOut = out;

    }


    /**
     * Perform the operation on argumentOne and argumentTwo.
     */
    public void process(int argumentOne, int argumentTwo, int operation) {
        switch (operation) {
            case ADDITION:
                Add addition = new Add(argumentOne, argumentTwo, mOut);  // Create new Add Object
                addition.perform();
                break;
            case SUBSTRACTION:
                Subtract subtraction = new Subtract(argumentOne, argumentTwo, mOut);  // Create new Subtract Object
                subtraction.perform();
                break;
            case MULTIPLICATION:
                Multiply multiplication = new Multiply(argumentOne, argumentTwo, mOut); // Create new Multiply Object
                multiplication.perform();
                break;
            case DIVISION:
                Divide division = new Divide(argumentOne, argumentTwo, mOut); // Create new Divide Object
                division.perform();
                break;
        }
    }
}
