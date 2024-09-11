package com.example.calculator;

import java.util.Scanner;

//Lv 2 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기 만들기

public class App02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner 객체를 한 번만 생성

        Calculator calculator = new Calculator(); // Calculator 객체를 한 번만 생성

        while (true) {
            System.out.println("1. 계산");
            System.out.println("2. clear");
            System.out.println("3. all clear");
            System.out.print("기능을 선택해 주세요 :");

            int choice = sc.nextInt();
            sc.nextLine(); // 입력 버퍼에 남아 있는 줄바꿈 문자를 제거

            switch (choice) {
                case 1:
                    System.out.print("첫 번째 숫자를 입력하세요 :");
                    long num1 = sc.nextLong();

                    System.out.print("사칙연산 기호를 입력하세요(+, -, *, /) :");
                    char operator = sc.next().charAt(0);

                    System.out.print("두 번째 숫자를 입력하세요 :");
                    long num2 = sc.nextLong();
                    sc.nextLine(); // 입력 버퍼에 남아 있는 줄바꿈 문자를 제거

                    if (num1 < 0 || num2 < 0) {
                        System.out.println("0 이상의 숫자를 입력해 주세요.");
                    } else {
                        switch (operator) {
                            case '+':
                                System.out.println(calculator.add(num1, num2));
                                break;
                            case '-':
                                System.out.println(calculator.sub(num1, num2));
                                break;
                            case '*':
                                System.out.println(calculator.mul(num1, num2));
                                break;
                            case '/':
                                if (num2 == 0) {
                                    System.out.println("0으로 나눌 수 없습니다.");
                                } else {
                                    System.out.println(calculator.div(num1, num2));
                                }
                                break;
                            default:
                                System.out.println("사칙연산을 확인해 주세요.");
                                break;
                        }
                    }
                    break; // switch 블록에서 break 추가

                case 2:
                    System.out.print("가장 먼저 저장된 데이터를 삭제하시겠습니까? (y or n): ");
                    String clear = sc.nextLine(); // sc.nextLine()으로 입력 받기

                    if (clear.equalsIgnoreCase("y")) {
                        calculator.removeResult();
                    }
                    break; // switch 블록에서 break 추가

                case 3:
                    System.out.print("저장된 모든 데이터를 삭제하시겠습니까? (y or n): ");
                    String allClear = sc.nextLine(); // sc.nextLine()으로 입력 받기

                    if (allClear.equalsIgnoreCase("y")) {
                        calculator.allClear();
                    }
                    break; // switch 블록에서 break 추가

                default:
                    System.out.println("잘못된 선택입니다.");
                    break;
            }

            System.out.println("계속 계산을 원하시는 경우 y 입력");
            System.out.print("계산을 그만하실 경우 exit를 입력해 주세요. :");
            String exitText = sc.nextLine();
            if (exitText.equalsIgnoreCase("exit")) {
                System.out.println("=================종료=================");
                break;
            }
        }
        sc.close(); // Scanner 객체를 닫습니다.
    }
}
