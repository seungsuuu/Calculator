package main.java.calculator;

import java.util.ArrayList;

public class Calculator {
    // 연산결과가 저장되는 컬렉션 타입 private로 선언해 캡슐화
    private ArrayList<Integer> resultArr;

    public Calculator(ArrayList<Integer> resultArr) { // Calculator 클래스 생성자, 매개변수로 ArrayList 를 받아 초기화
        this.resultArr = resultArr;
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
        int result;

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
            default:
                throw new UnsupportedOperationException("올바른 선택이 아닙니다.");
        }
        return result;
    }

    /**
     * 연산된 연산결과를 캡슐화된 리스트에 add 하는 setter 메서드
     * @param result 연산된 결과를 받아 리스트에 저장
     */
    public void addResult(int result) {
        this.resultArr.add(result);
    }

    /**
     * 캡슐화된 리스트에 요소를 삭제하기 위한 setter 메서드
     */
    public void removeResult(int idx) {
        this.resultArr.remove(idx);
    }

    /**
     * 연산결과가 저장된 resultArr에 간접적으로 접근하여 저장된 값 조회하는 getter 메서드
     */
    public void inquiryResults() {
        for (int i : resultArr) {
            System.out.println("저장된 연산결과 : " + i);
        }
    }

}
