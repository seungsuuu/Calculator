package main.java.calculator;

import java.util.ArrayList;
import java.util.Scanner;

public class CirCalFactory {

    public void cirCalFactory(){
        CircleCalculator calCir = new CircleCalculator(new ArrayList<>());
        Scanner sc = new Scanner(System.in);

        System.out.print("원의 반지름을 입력하세요: ");
        int radius = sc.nextInt(); // 원의 반지름을 입력 받아 int타입 radius에 대입

        double result = calCir.calculate(radius);
        System.out.println("반지름이 : "+radius+" 인 원의 넓이 : " + result);
        calCir.addResult(result);

        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        String removeSign = sc.next();
        if (removeSign.equals("remove")) { //입력된 문자열이 "remove"면 ArrayList의 첫 번째 요소 삭제
            calCir.removeResult(0); // removeResultArr 메서드로 호출
        }

        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        String inquirySign = sc.next();
        if (inquirySign.equals("inquiry")) {//입력된 문자열이 "inquiry"면 inquiryResults 메서드 호출
            calCir.inquiryResults();
        }
    }
}
