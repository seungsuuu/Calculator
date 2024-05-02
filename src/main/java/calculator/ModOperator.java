package main.java.calculator;

public class ModOperator implements Operator {
    @Override
    public int operator(int num1, int num2) throws DivZeroException{
        if (num2 == 0) {
            throw new DivZeroException();
        }
        return num1 % num2;
    }
}
