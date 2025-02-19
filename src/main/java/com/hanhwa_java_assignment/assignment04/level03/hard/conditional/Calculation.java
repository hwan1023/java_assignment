package com.hanhwa_java_assignment.assignment04.level03.hard.conditional;

import java.util.Scanner;

public class Calculation {
    public void CalculationStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("첫 번째 정수 : ");
        int first_val = sc.nextInt();
        System.out.print("두 번째 정수 : ");
        int second_val = sc.nextInt();
        System.out.print("연산 기호를 입력하세요 : ");
        char operator = sc.next().charAt(0);
        int result = 0;
        switch (operator){
            case '+':
                result = (first_val + second_val);
                break;
            case '-':
                result = (first_val - second_val);
                break;
            case '*':
                result = (first_val * second_val);
                break;
            case '/':
                result = (first_val / second_val);
                break;
            case '%':
                result = (first_val % second_val);
                break;
            default:
                System.out.println("입력하신 연산은 없습니다. 프로그램을 종료합니다.");
        }
    }
}
