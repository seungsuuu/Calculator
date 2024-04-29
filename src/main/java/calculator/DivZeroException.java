package main.java.calculator;

public class DivZeroException extends Exception {

    public DivZeroException() {
        super("나눗셈은 0으로 나눌 수 없습니다.");
    }
}
