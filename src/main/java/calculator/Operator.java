package main.java.calculator;

public interface Operator {
    int operator(int num1, int num2) throws DivZeroException;
}
