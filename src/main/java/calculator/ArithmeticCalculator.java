package main.java.calculator;

import java.util.ArrayList;

public class ArithmeticCalculator<T extends Number> extends Calculator {

    public final Class<T> type;

    public ArithmeticCalculator(ArrayList<Double> resultArr, Class<T> type) { // 매개변수로 ArrayList 생성자를 받아 부모 생성자의 ArrayList 생성
        super(resultArr);
        this.type =  type;
    }

    /**
     *  calculate 메서드는 아래의 매개변수를 가지고 사직연산을 하는 메서드입니다.
     * @param num1 : 첫 번째 정수 타입
     * @param num2 : 두 번째 정수 타입
     * @param operator : 사직연산 기호 문자 타입
     * @return result : 사직연산의 결과를 전달하는 정수 타입 반환값
     */
    public T calculate(T num1, T num2, char operator){
        return operatorFactory(operator).operator(num1, num2);
    }

    public Operator<T> operatorFactory(char operator) {
        OperatorType operatorType = OperatorType.fromOperator(operator);
        return switch (operatorType) {
            case ADDITION-> new AddOperator(type);
            case SUBTRACTION -> new SubtractOperator(type);
            case MULTIPLICATION-> new MultiplyOperator(type);
            case DIVISION -> new DivideOperator(type);
            case MODULO -> new ModOperator(type);
        };
    }


    @Override
    public void inquiryResults() {
        for (double i : super.getResultArr()) {
            System.out.println("저장된 연산결과 : " + i);
        }
    }

    public void printResultGreaterThan(double num) {
        super.getResultArr().stream()
                .filter(result -> result > num)
                .forEach(result -> System.out.println("연산결과 = " + result));
    }
}
