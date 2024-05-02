package main.java.calculator;

public class SubtractOperator  implements Operator {
    @Override
    public int operator(int num1, int num2) {
        return num1 - num2;
    }
}
