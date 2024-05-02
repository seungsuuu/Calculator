package main.java.calculator;

import java.util.ArrayList;

public abstract class Calculator {
    public static final double PI = 3.14; // 3.14는 원주율로 절대 변하지 않는 상수이기 때문

    // 연산결과가 저장되는 컬렉션 타입 private 로 선언해 캡슐화
    private ArrayList<Double> resultArr;

    public Calculator(ArrayList<Double> resultArr) { // 추상 클래스는 인스턴스 생성 불가, 자식 클래스에서 호출해준다.
        this.resultArr = resultArr;
    }

    public ArrayList<Double> getResultArr() { // 캡슐화된 ArrayList를 읽는 getter
        return resultArr;
    }

    /**
     * 연산된 연산결과를 캡슐화된 리스트에 add 메서드
     * @param result 연산된 결과를 받아 리스트에 저장
     */
    public void addResult(double result) {
        this.resultArr.add(result);
    }

    /**
     * 캡슐화된 리스트에 idx 요소를 삭제하는 메서드
     */
    public void removeResult(int idx) {
        this.resultArr.remove(idx);
    }

    /**
     * 연산결과를 조회하는 추상 메서드
     */
    public abstract void inquiryResults();
}
