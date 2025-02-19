package com.hanhwa_java_assignment.assignment04.level02.normal.looping_and_branching;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
        String result = "";
        for (int i = 1; i<=num; i++) {
            if (i%2 == 0){
                result += "박";

            }else{
                result += "수";
            }
        }
        System.out.println(result);
    }
}
