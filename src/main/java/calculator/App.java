package main.java.calculator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * main 메서드
 * param : args
 * return : void
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Calculator cal = new Calculator(new ArrayList<>(), new ArrayList<>()); // Calculator 객체 생성 시, ArrayList 를 생성하고 초기화
        boolean exitCheck = true; // 반복분 체크를 위한 boolean 변수 선언

        while (exitCheck) { // exitCheck를 체크해 while 반복문을 수행
            System.out.println("사칙연산 수행 : '1' 입력 / 원의 넓이 계산 : '2' 입력");
            int typeCheck = sc.nextInt();
            if (typeCheck == 1) {
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt(); // 첫 번쨰 숫자를 입력 받아 int타입 num1에 대입

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt(); // 두 번쨰 숫자를 입력 받아 int타입 num2에 대입

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0); // charAt(idx)는 문자열에서 매개변수로 받은 주소 값의 문자를 반환한다.

                int result = 0;
                try { // calculate메서드 사용을 위한 throws 예외처리구문
                    result = cal.calculate(num1, num2, operator);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                System.out.println("연산 결과 : " + result);
                cal.addResult(result); // addResult 메서드 호출 접근해서 연산결과 추가

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeSign = sc.next();
                if (removeSign.equals("remove")) { //입력된 문자열이 "remove"면 ArrayList의 첫 번째 요소 삭제
                    cal.removeResult(0); // removeResultArr 메서드로 호출
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquirySign = sc.next();
                if (inquirySign.equals("inquiry")) {//입력된 문자열이 "inquiry"면 inquiryResults 메서드 호출
                    cal.inquiryResults();
                }
            } else if (typeCheck == 2) {
                System.out.print("원의 반지름을 입력하세요: ");
                int radius = sc.nextInt(); // 원의 반지름을 입력 받아 int타입 radius에 대입

                double result = cal.calculateCircleArea(radius);
                System.out.println("연산 결과 : " + result);
                cal.addResultDou(result);

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeSign = sc.next();
                if (removeSign.equals("remove")) { //입력된 문자열이 "remove"면 ArrayList의 첫 번째 요소 삭제
                    cal.removeResultDou(0); // removeResultArr 메서드로 호출
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquirySign = sc.next();
                if (inquirySign.equals("inquiry")) {//입력된 문자열이 "inquiry"면 inquiryResults 메서드 호출
                    cal.inquiryResultsDou();
                }

            } else {
                System.out.println("잘못된 입력입니다. '1' 과 '2' 중에 다시 입력해주세요.");
                continue;
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitSign = sc.next();
            if (exitSign.equals("exit")) { // 입력한 문자열이 "exit"면 exitCheck를 false로 바꿔 반복 종료
                exitCheck = false;
            }
        }
    }
}
