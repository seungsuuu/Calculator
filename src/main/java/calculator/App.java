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

        System.out.print("첫 번째 숫자를 입력하세요: ");
        int num1 = sc.nextInt(); // 첫 번쨰 숫자를 입력 받아 int타입 num1에 대입

        System.out.print("두 번째 숫자를 입력하세요: ");
        int num2 = sc.nextInt(); // 두 번쨰 숫자를 입력 받아 int타입 num2에 대입

        System.out.print("사칙연산 기호를 입력하세요: ");
        char operator = sc.next().charAt(0); // charAt(idx)는 문자열에서 매개변수로 받은 주소 값의 문자를 반환한다.

        System.out.println("num1 값 : "+num1);
        System.out.println("num2 값 : "+num2);
        System.out.println("operator : "+operator);
    }
}
