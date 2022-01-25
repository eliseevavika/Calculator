package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Add operation.
 */
public class Add {
    private ActivityInterface mOut;
    private int number1, number2;

    public Add(int number1, int number2, ActivityInterface mOut) { //Constructor
        // Initialize values
        this.number1 = number1;
        this.number2 = number2;
        this.mOut = mOut;
    }

    public void perform() {
        mOut.print("" + number1 + number2);
    }
}
