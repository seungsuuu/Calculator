package main.java.calculator;

import java.util.Scanner;

/**
 * main 메서드
 * param : args
 * return : void
 */
public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean exitCheck = true; // 반복분 체크를 위한 boolean 변수 선언

        ArithmeticCalculator calAri = new ArithmeticCalculator(); // 추상 메서드를 상속받은 사칙연산 클래스 생성
        CircleCalculator calCir = new CircleCalculator(); // 추상 메서드를 상속받은 원의 넓비 계산 클래스 생성

        while (exitCheck) { // exitCheck를 체크해 while 반복문을 수행
            System.out.println("사칙연산 계산(operation 입력), 반지름 계산(circle 입력) 둘 중 하나를 입력해주세요.");
            String calculatorType = sc.next();
            System.out.println("입력한 타입 : "+calculatorType);

            if (calculatorType.equals("operation")) { // 사칙연산 계산기
                int resultInt;
                System.out.print("첫 번째 숫자를 입력하세요: ");
                int num1 = sc.nextInt(); // 첫 번쨰 숫자를 입력 받아 int타입 num1에 대입

                System.out.print("두 번째 숫자를 입력하세요: ");
                int num2 = sc.nextInt(); // 두 번쨰 숫자를 입력 받아 int타입 num2에 대입

                System.out.print("사칙연산 기호를 입력하세요: ");
                char operator = sc.next().charAt(0); // charAt(idx)는 문자열에서 매개변수로 받은 주소 값의 문자를 반환한다.

                System.out.println("입력 받은 연산 : " + num1 + operator + num2);

               calAri.setterAri(num1, num2, operator); // calculate 연산을 위해 연산 데이터 set
                try { // calculate 메서드 사용을 위한 throws 예외처리구문
                    calAri.calculate();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                resultInt = calAri.getResult(); // getResult 메서드 호출의 반환 값으로 결과값 대입
                System.out.println("연산 결과 : " + resultInt);
                calAri.addResult(resultInt); // addResult 메서드 호출 접근해서 연산결과 저장

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeSign = sc.next();
                if (removeSign.equals("remove")) { //입력된 문자열이 "remove"면 ArrayList의 첫 번째 요소 삭제
                    calAri.removeResult(); // removeResultArr 메서드로 호출
                }

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquirySign = sc.next();
                if (inquirySign.equals("inquiry")) {//입력된 문자열이 "inquiry"면 inquiryResults 메서드 호출
                    calAri.inquiryResults();
                }
            } else if (calculatorType.equals("circle")) { // 원의 넓비 계산기

                double resultDouble;
                System.out.print("원의 반지름을 입력하세요: ");
                double radius = sc.nextDouble(); // 원의 반지름을 입력 받아 double 타입 radius에 대입

                System.out.println("입력 받은 원의 반지름 : " + radius);

                calCir.setterCir(radius); // calculate 연산을 위해 연산 데이터 set
                calCir.calculate();
                resultDouble = calCir.getResult(); // getResult 메서드 호출의 반환 값으로 결과값 대입
                System.out.println("원의 넓이 결과 : " + resultDouble);

                calCir.addResult(resultDouble); // addResult 메서드 호출 접근해서 연산결과 저장

                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                String removeSign = sc.next();
                if (removeSign.equals("remove")) { //입력된 문자열이 "remove"면 ArrayList의 첫 번째 요소 삭제
                    calCir.removeResult(); // removeResult 메서드로 호출
                }

                System.out.println("저장된 원의 넓이 결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                String inquirySign = sc.next();
                if (inquirySign.equals("inquiry")) {//입력된 문자열이 "inquiry"면 inquiryResults 메서드 호출
                    calCir.inquiryResults();
                }

            } else { // 잘못된 문자열 들어올 시 처리
                System.out.println("잘못된 입력입니다.");
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
