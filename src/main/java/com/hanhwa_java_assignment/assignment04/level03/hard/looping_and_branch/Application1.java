package com.hanhwa_java_assignment.assignment04.level03.hard.looping_and_branch;
import java.lang.Math;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("2보다 큰 정수를 하나 입력하시오: ");
        int num = sc.nextInt();
        int cnt = 0;
        for (int i = 2; i <= (int) Math.sqrt(num) + 1; i++) {
            if (num % i == 0){
                System.out.println(i);
                cnt++;
                break;
            }

        }
        if (num > 2){
            if (cnt == 1) {
                System.out.println("소수가 아니다");

            }else{
                System.out.println("소수다");
            }
        }else{
            System.out.println("소수다");
        }
        }


}
