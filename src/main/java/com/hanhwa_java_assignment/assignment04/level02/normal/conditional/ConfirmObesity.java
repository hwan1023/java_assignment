package com.hanhwa_java_assignment.assignment04.level02.normal.conditional;

import java.util.Scanner;

public class ConfirmObesity {
    public void confirmObesityStatement() {
        Scanner sc = new Scanner(System.in);
        System.out.print("몸무게를 입력하시오: ");
        double weight = sc.nextDouble();
        System.out.print("신장을 입력하시오 : ");
        double height = sc.nextDouble();

        double result = weight / (height * height);

        if (result < 20){
            System.out.println("당신은 저체중입니다.");
        }
        else if (result < 25){
            System.out.println("당신은 정상입니다.");

        }
        else if (result < 30){
            System.out.println("당신은 과체중입니다.");

        }else{
            System.out.println("당신은 비만입니다.");
        }
    }
}
