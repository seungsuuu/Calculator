package main.java.calculator;

import java.util.ArrayList;

public class CircleCalculator extends Calculator {

    public CircleCalculator(ArrayList<Double> resultArr) { // 매개변수로 ArrayList 생성자를 받아 부모 생성자의 ArrayList 생성
        super(resultArr);
    }

    /**
     * 원의 넓이를 구하는 메서드
     * @param radius : 원의 반지름
     * @return : 원이 넓이
     */
    public double calculate(int radius) {
        return PI * radius * radius;
    }

    @Override
    public void inquiryResults() {
        for (double i : super.getResultArr()) {
            System.out.println("저장된 원의 넓이 : " + i);
        }
    }
}
