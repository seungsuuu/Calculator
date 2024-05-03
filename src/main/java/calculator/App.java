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

        AriCalFactory ariCalFac = new AriCalFactory();
        CirCalFactory criCalFac = new CirCalFactory();

        while (exitCheck) { // exitCheck를 체크해 while 반복문을 수행

            System.out.println("사칙연산 수행 : '1' 입력 / 원의 넓이 계산 : '2' 입력");
            int typeCheck = sc.nextInt();

            if (typeCheck == 1) {
                ariCalFac.ariCalFactory();
            } else if (typeCheck == 2) {
                criCalFac.cirCalFactory();
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
