package calculator;

/** Simple subtraction of two integers. */
public class Sub implements Operation {
    @Override
    public int doOperation(int a, int b) {
        return a - b;
    }
}
