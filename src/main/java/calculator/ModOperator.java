package main.java.calculator;

public class ModOperator implements Operator {

    @Override
    public int operate(int a, int b) {
        return a % b;
    }
}
