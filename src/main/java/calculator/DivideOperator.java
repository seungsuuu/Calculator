package main.java.calculator;

public class DivideOperator implements Operator{

    @Override
    public int operate(int a, int b) {
        return a / b;
    }
}
