package main.java.calculator;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class AriCalFactory {

    public void ariCalFactory(){
        ArithmeticCalculator<Double> calAri = new ArithmeticCalculator<>( new ArrayList<>(), Double.class);
        Scanner sc = new Scanner(System.in);

        System.out.print("첫 번째 숫자를 입력하세요: ");
        double num1 = sc.nextInt(); // 첫 번쨰 숫자를 입력 받아 int타입 num1에 대입

        System.out.print("두 번째 숫자를 입력하세요: ");
        double num2 = sc.nextInt(); // 두 번쨰 숫자를 입력 받아 int타입 num2에 대입

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0); // charAt(idx)는 문자열에서 매개변수로 받은 주소 값의 문자를 반환한다.

        double result = calAri.calculate(num1, num2, operator);

        System.out.println("연산 결과 : " + result);
        calAri.addResult(result); // addResult 메서드 호출 접근해서 연산결과 추가

        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
        String removeSign = sc.next();
        if (removeSign.equals("remove")) { //입력된 문자열이 "remove"면 ArrayList의 첫 번째 요소 삭제
            calAri.removeResult(0); // removeResultArr 메서드로 호출
        }

        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
        String inquirySign = sc.next();
        if (inquirySign.equals("inquiry")) {//입력된 문자열이 "inquiry"면 inquiryResults 메서드 호출
            calAri.inquiryResults();
        }

        System.out.println("저장된 연산결과 중 입력한 값보다 큰 값들을 조회하시겠습니까? (lambda 입력시 조회)");
        if (Objects.equals(sc.next(), "lambda")) {
            System.out.println("기준 값을 입력하세요: ");
            double num = sc.nextDouble();
            calAri.printResultGreaterThan(num);
        }
    }

}
