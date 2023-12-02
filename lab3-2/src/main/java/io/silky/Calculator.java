package io.silky;

public class Calculator {
    private int result;

    public void add(int operand) {
        result += operand;
    }

    public void subtract(int operand) {
        result -= operand;
    }

    public int getResult() {
        return result;
    }
}
