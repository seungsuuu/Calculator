package main.java.calculator;

import java.util.Arrays;
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
        int[] resultArr = new int[10]; // 연산결과를 저장할 int 배열 선언
        int resultIdx = 0; // 연산결과를 저장할 배열의 인덱스를 나타내기 위한 변수 선언

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

            if (resultIdx < 10) { // 배열에 저장된 연산결과가 10개 보다 작은 경우
                resultArr[resultIdx] = result; // 연산결과를 배열의 해당 인덱스에 저장
                resultIdx++; // 인덱스 번호 증가
            } else if (resultIdx == 10) { //배열에 저장된 연산결과가 10개인 경우
                for (int i = 1; i < resultArr.length; i++) { // 배열 값들을 인덱스 번호 하나 앞에 저장
                    resultArr[i - 1] = resultArr[i];
                }
                resultArr[resultIdx - 1] = result; // 마지막 인덱스에 연산된 결과 저장
            }
            System.out.println("배열에 저장된 연산 결과들 : "+Arrays.toString(resultArr));



            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String exitSign = sc.next();
            if (exitSign.equals("exit")) { // 입력한 문자열이 "exit"면 exitCheck를 false로 바꿔 반복 종료
                exitCheck = false;
            }
        }
    }
}
