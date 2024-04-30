package main.java.calculator;

import java.util.ArrayList;

public class Calculator {
    // 연산결과가 저장되는 컬렉션 타입 private로 선언해 캡슐화
    private ArrayList<Integer> resultIntArr;
    private ArrayList<Double> resultDoubleArr;
    int resultInt;
    double resultDouble;
    static final double pi = Math.PI; // 연산과정 중에 절대 변하면 안되는 값을 상수로 선언

    public Calculator() { // Calculator 클래스 생성자
        resultInt = 0;
        resultIntArr = new ArrayList<>();
        resultDouble = 0.0;
        resultDoubleArr = new ArrayList<>();
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
                resultInt = num1 + num2;
                break;
            case '-':
                resultInt = num1 - num2;
                break;
            case '*':
                resultInt = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    throw new DivZeroException();
                } else {
                    resultInt = num1 / num2;
                break;
                }
        }
        return resultInt;
    }

    /**
     * 접근이 제한된 resultIntArr를 얻기 위한 getter
     * @return 캡슐화된 resultIntArr를 반환
     */
    public ArrayList<Integer> getResultInt() {
        return this.resultIntArr;
    }

    /**
     * 접근이 제한된 resultIntArr를 수정하기 위한 setter
     * @param resultIntArr 로 받은 수정된 Arr를 this.resultIntArr에 저장
     */
    public void setResultInt(ArrayList<Integer> resultIntArr) {
        this.resultIntArr = resultIntArr;
    }

    /**
     * 연산결과가 저장된 resultIntArr에 간접적으로 접근하여 저장된 값 조회하는 메서드
     */
    public void inquiryResults() {
        ArrayList<Integer> arr = this.resultIntArr;
        for (int i : arr) {
            System.out.println("저장된 연산결과 : " + i);
        }
    }

    /**
     * 연산된 연산결과를 캡슐화된 리스트에 add 하는 메서드
     * @param result 연산된 결과를 받아 리스트에 저장
     */
    public void addResult(int result) {
        this.resultIntArr.add(result);
    }

    /**
     * 캡슐화된 리스트에 첫 번째 요소를 삭제하기 위한 메서드
     */
    public void removeResult() {
        this.resultIntArr.remove(0);
    }

    /**
     * 원의 반지름을 받아 원의 넓비를 구하는 메서드
     * @param radius 반지름
     * @return resultDouble 원의 넓비
     */
    public double calculateCircleArea(double radius) {
        resultDouble = pi * radius * radius;
        return resultDouble;
    }

    /**
     * 접근이 제한된 resultDoubleArr를 얻기 위한 getter
     * @return 캡슐화된 resultDoubleArr를 반환
     */
    public ArrayList<Double> getResultDoubleArr() {
        return this.resultDoubleArr;
    }

    /**
     * 접근이 제한된 resultDoubleArr를 수정하기 위한 setter
     * @param resultDoubleArr 로 받은 수정된 Arr를 this.resultDoubleArr에 저장
     */
    public void setResultDoubleArr(ArrayList<Double> resultDoubleArr) {
        this.resultDoubleArr = resultDoubleArr;
    }

    /**
     * 연산된 연산결과를 캡슐화된 리스트에 add 하는 메서드
     * @param resultDouble 연산된 결과를 받아 리스트에 저장
     */
    public void addResultDouble(double resultDouble) {
        this.resultDoubleArr.add(resultDouble);
    }

    /**
     * 연산결과가 저장된 resultDoubleArr에 간접적으로 접근하여 저장된 값 조회하는 메서드
     */
    public void inquiryResultsDouble() {
        ArrayList<Double> arr = this.resultDoubleArr;
        for (double i : arr) {
            System.out.println("저장된 원의 넓비 결과 : " + i);
        }
    }


}
