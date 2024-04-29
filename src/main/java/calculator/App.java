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
        Calculator cal = new Calculator(); // Calculator 객체 생성
        boolean exitCheck = true; // 반복분 체크를 위한 boolean 변수 선언

        while (exitCheck) { // exitCheck를 체크해 while 반복문을 수행
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 첫 번쨰 숫자를 입력 받아 int타입 num1에 대입

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두 번쨰 숫자를 입력 받아 int타입 num2에 대입

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0); // charAt(idx)는 문자열에서 매개변수로 받은 주소 값의 문자를 반환한다.

            System.out.println("입력 받은 연산 : " + num1 + operator + num2);

            int result = 0;
            try { // calculate메서드 사용을 위한 throws 예외처리구문
                result = cal.calculate(num1, num2,operator);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            System.out.println("연산 결과 : " + result);
            cal.addResultArr(result); // setter메서드로 접근해서 요소 추가

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String removeSign = sc.next();
            if (removeSign.equals("remove")) { //입력된 문자열이 "remove"면 ArrayList의 첫 번째 요소 삭제
                cal.removeResultArr(); // setter메서드로 접근해서 요소 삭제
            }

            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            String inquirySign = sc.next();
            if (inquirySign.equals("inquiry")) {//입력된 문자열이 "inquiry"면 ArrayList의 모든 요소 조회
                ArrayList<Integer> resultArr  = cal.getResultArr(); //getter 메서드로 캡슐화된 연산결과 리스트 가져오기
                for(int i: resultArr) {
                    System.out.println("저장된 연산결과 : " + i);
                }
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitSign = sc.next();
            if (exitSign.equals("exit")) { // 입력한 문자열이 "exit"면 exitCheck를 false로 바꿔 반복 종료
                exitCheck = false;
            }
        }
    }
}
