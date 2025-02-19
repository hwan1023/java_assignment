package com.hanhwa_java_assignment.assignment04.level03.hard.looping_and_branch;

import java.util.Random;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int num = rand.nextInt(100);
        int cnt = 0;
        while (true){
            int answer = sc.nextInt();
            if (answer == num){
                cnt +=  1;
                System.out.println("정답입니다."+ cnt +"회 만에 정답입니다.");
                break;
            }
            else if(answer < num){
                cnt += 1;
                System.out.println("입력하신 정수보다 큽니다.");
            }
            else{
                cnt += 1;
                System.out.println("입력하신 정수보다 작습니다.");
            }

        }
    }
}
