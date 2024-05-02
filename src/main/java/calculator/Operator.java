package main.java.calculator;

public interface Operator {
    public int operator(int num1, int num2) throws DivZeroException;
}
