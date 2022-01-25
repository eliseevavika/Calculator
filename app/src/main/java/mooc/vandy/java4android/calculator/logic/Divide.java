package mooc.vandy.java4android.calculator.logic;

import mooc.vandy.java4android.calculator.ui.ActivityInterface;

/**
 * Perform the Divide operation.
 */
public class Divide {
    ActivityInterface mOut;
    private int number1;
    private int number2;

    public Divide(int number1, int number2, ActivityInterface mOut) { // Constructor
        //Initialize values
        this.number1 = number1;
        this.number2 = number2;
        this.mOut = mOut;
    }

    public void perform() {
        if (number2 == 0)
            mOut.print("Can not divide by 0");
        else
            mOut.print("" + number1 / number2 + " R:" + number1 % number2);
    }
}
