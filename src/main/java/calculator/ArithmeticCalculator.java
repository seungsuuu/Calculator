package main.java.calculator;

import java.util.ArrayList;

public class ArithmeticCalculator extends Calculator {
    private int num1;
    private int num2;
    private char operator;
    private int result;
    private ArrayList<Integer> resultIntArr;

    public ArithmeticCalculator() { // 생성자로 변수 초기화
        num1 = 0;
        num2 = 0;
        operator = ' ';
        result = 0;
        resultIntArr = new ArrayList<>();
    }

    @Override
    public void calculate() throws DivZeroException { // 추상 클래스 사칙연산 계산으로 구현
        switch (this.operator) { // 입력받은 연산자(operator) 값에 따라 다르게 연산
            case '+':
                AddOperator add = new AddOperator();
                result = add.operate(num1, num2);
                break;
            case '-':
                SubtractOperator sub = new SubtractOperator();
                result = sub.operate(num1, num2);
                break;
            case '*':
                MultiplyOperator mul = new MultiplyOperator();
                result = mul.operate(num1, num2);
                break;
            case '/':
                if (num2 == 0) {
                    throw new DivZeroException();
                } else {
                    DivideOperator div = new DivideOperator();
                    result = div.operate(num1, num2);
                    break;
                }
        }
    }

    /**
     * 연산을 위한 데이터를 set하는 setter
     * @param num1 : 첫 번째 숫자
     * @param num2 : 두 번째 숫자
     * @param operator : 연산자
     */
    public void setterAri(int num1, int num2, char operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    /**
     * 연산 결과를 get하게 해주는 getter
     * @return : 사칙연산 결과
     */
    public int getResult() {
        return result;
    }

    /**
     * 연산된 연산결과를 캡슐화된 리스트에 add 하는 메서드
     * @param result 연산된 결과를 받아 리스트에 저장
     */
    public void addResult(int result) {
        resultIntArr.add(result);
    }

    /**
     * 캡슐화된 리스트에 첫 번째 요소를 삭제하기 위한 메서드
     */
    public void removeResult() {
        resultIntArr.remove(0);
    }

    /**
     * 연산결과가 저장된 resultIntArr에 간접적으로 접근하여 저장된 값 조회하는 메서드
     */
    public void inquiryResults() {
        ArrayList<Integer> arr = resultIntArr;
        for (int i : arr) {
            System.out.println("저장된 연산결과 : " + i);
        }
    }
}
