package main.java.calculator;

import java.util.ArrayList;

/**
 * Calculator 클래스를 추상 클래스로, calculate 메서드를 추상 메서드로 선언
 */
public abstract class Calculator {
    public abstract void calculate() throws DivZeroException ;
}
