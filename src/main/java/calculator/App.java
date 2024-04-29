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
        boolean exitCheck = true;

        while (exitCheck) { // exitCheck를 체크해 while 반복문을 수행
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt(); // 첫 번쨰 숫자를 입력 받아 int타입 num1에 대입

            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt(); // 두 번쨰 숫자를 입력 받아 int타입 num2에 대입

            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0); // charAt(idx)는 문자열에서 매개변수로 받은 주소 값의 문자를 반환한다.

            System.out.println("입력 받은 연산 : " + num1 + operator + num2);

            int result = 0;
            switch (operator) { // 입력받은 연산자(operator) 값에 따라 다르게 연산
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) { // 나눗셈은 0으로 나눌 수 없으므로 나누려는 num2 값에 0이면 프로그램 종료
                        System.out.println("나눗셈의 경우 0으로 나눌 수 없습니다.");
                        return;
                    } else result = num1 / num2;
                    break;
            }
            System.out.println("연산 결과 : " + result);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitSign = sc.next();
            if (exitSign.equals("exit")) { // 입력한 문자열이 "exit"면 exitCheck를 false로 바꿔 반복 종료
                exitCheck = false;
            }
        }
    }
}
