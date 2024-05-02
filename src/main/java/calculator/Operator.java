package main.java.calculator;

public interface Operator<T extends Number> {
    T operator(T num1, T num2) throws DivZeroException;
}
