package main.java.calculator;

import java.util.ArrayList;

public class Calculator {
    ArrayList<Integer> resultArr = new ArrayList<>(); // 연산결과가 저장되는 컬렉션 타입
    int result = 0;

    public Calculator() { // Calculator 클래스 생성자

    }

    /**
     *  calculate 메서드는 아래의 매개변수를 가지고 사직연산을 하는 메서드입니다.
     * @param num1 : 첫 번째 정수 타입
     * @param num2 : 두 번째 정수 타입
     * @param operator : 사직연산 기호 문자 타입
     * @return result : 사직연산의 결과를 전달하는 정수 타입 반환값
     * @throws DivZeroException : 나눗셈의 나누는 정수값이 0일때, 예외를 보내는 예외 클래스
     */
    public int calculate(int num1, int num2, char operator) throws DivZeroException{
        switch (operator) { // 입력받은 연산자(operator) 값에 따라 다르게 연산
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new DivZeroException();
                } else {
                result = num1 / num2;
                break;
                }
        }
        return result;
    }
}
