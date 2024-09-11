package com.example.calculator;

import java.util.Scanner;

// Lv 01 클래스 없이 기본적인 연산을 수행할 수 있는 계산기 만들기

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long result;
        double doubleResult;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 :");
            long num1 = sc.nextLong();

            System.out.print("사칙연산 기호를 입력하세요(+, -, *, /) :");
            char operator = sc.next().charAt(0);

            System.out.print("두 번째 숫자를 입력하세요 :");
            long num2 = sc.nextLong();

            sc.nextLine();

            if (num1 < 0 || num2 < 0) {
                System.out.println("0 이상의 숫자를 입력해 주세요.");
            } else {
                switch (operator) {
                    case '+':
                        result = num1 + num2;
                        System.out.println("계산결과 :" + result);
                        break;
                    case '-':
                        result = num1 - num2;
                        System.out.println("계산결과 :" + result);
                        break;
                    case '*':
                        result = num1 * num2;
                        System.out.println("계산결과 :" + result);
                        break;
                    case '/':
                        if (num2 == 0) {
                            System.out.println("0으로 나눌 수 없습니다.");
                        } else if (num1 % num2 == 0) {
                            result = num1 / num2;
                            System.out.println("계산결과 :" + result);
                        } else {
                            doubleResult = (double) num1 / num2;
                            System.out.println("계산결과 :" + doubleResult);
                        }
                        break;
                    default:
                        System.out.println("사칙연산을 확인해 주세요.");
                        break;
                }

                System.out.println("계속 계산을 원하시는 경우 Enter 입력");
                System.out.print("계산을 그만하실 경우 exit를 입력해 주세요. :");
                String exitText = sc.nextLine();
                if (exitText.equals("exit")) {
                    System.out.println("=================종료=================");
                    break;
                }
            }
        }
        sc.close();
    }
}
