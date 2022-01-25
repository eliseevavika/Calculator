package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Multiply operation.
 */
public class Multiply {
    private ActivityInterface mOut;
    private int number1;
    private int number2;

    public Multiply(int number1, int number2, ActivityInterface mOut) { //Constructor
        // Initialize values
        this.number1 = number1;
        this.number2 = number2;
        this.mOut = mOut;
    }

    public void perform() {
        mOut.print("" + (number1 * number2));
    }
}
