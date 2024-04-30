package main.java.calculator;


import java.util.ArrayList;

public class CircleCalculator extends Calculator {
    private double radius;
    private double result;
    private ArrayList<Double> resultDoubleArr;

    public CircleCalculator() { // 생성자로 변수 초기화
        radius = 0.0;
        result = 0.0;
        resultDoubleArr = new ArrayList<>();
    }

    @Override
    public void calculate() { // 추상 클래스 원의 넓비 계산으로 구현
        result = Math.PI * radius * radius;
    }

    /**
     * 연산을 위한 데이터를 set하는 setter
     * @param radius : 원의 지름 데이터
     */
    public void setterCir(double radius) {
        this.radius = radius;
    }

    /**
     * 연산 결과를 get하게 해주는 getter
     * @return : 원의 넓비 계산 결과
     */
    public double getResult() {
        return result;
    }

    /**
     * 연산된 연산결과를 캡슐화된 리스트에 add 하는 메서드
     * @param result 연산된 결과를 받아 리스트에 저장
     */
    public void addResult(double result) {
        resultDoubleArr.add(result);
    }

    /**
     * 캡슐화된 리스트에 첫 번째 요소를 삭제하기 위한 메서드
     */
    public void removeResult() {
        resultDoubleArr.remove(0);
    }

    /**
     * 연산결과가 저장된 resultDoubleArr 간접적으로 접근하여 저장된 값 조회하는 메서드
     */
    public void inquiryResults() {
        ArrayList<Double> arr = resultDoubleArr;
        for (double i : arr) {
            System.out.println("저장된 연산결과 : " + i);
        }
    }



}
