package com.hanhwa_java_assignment.assignment04.level02.normal.conditional;

import java.util.Scanner;

public class ConfirmStatement {
    public void confirmStatement() {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if ((number < 0) || (number >10)){
            System.out.println("반드시 1~10 사이의 정수를 입력해야 합니다.");
        }
        else{
            if (number % 2 == 0){
                System.out.println("짝수다");

            }else{
                System.out.println("홀수다");
            }
        }
    }
}
