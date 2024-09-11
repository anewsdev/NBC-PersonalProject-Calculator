package com.example.calculator;

import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    private Queue<Double> results = new LinkedList<>();

    // 더하기 메서드
    public double add(double num1, double num2) {
        double result = num1 + num2;
        results.add(result);
        return result;
    }

    // 빼기 메서드
    public double sub(double num1, double num2) {
        double result = num1 - num2;
        results.add(result);
        return result;
    }

    // 곱셈 메서드
    public double mul(double num1, double num2) {
        double result = num1 * num2;
        results.add(result);
        return result;
    }

    // 나누기 메서드
    public double div(double num1, double num2) {
        double result = num1 / num2;
        results.add(result);
        return result;
    }

    // 최근 저장 데이터 삭제 메서드
    public void removeResult() {
        if (results.isEmpty()) {
            System.out.println("삭제할 데이터가 없습니다.");
        } else {
            System.out.println(results.poll() + " 값이 삭제되었습니다.");
        }
    }

    // 모든 데이터 삭제 메서드
    public void allClear() {
        results.clear();
        System.out.println("모든 데이터가 삭제 되었습니다.");
    }
}
