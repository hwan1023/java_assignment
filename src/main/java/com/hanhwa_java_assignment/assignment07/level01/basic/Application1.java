package com.hanhwa_java_assignment.assignment07.level01.basic;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : I will be a good developer.
         *
         * ----- 출력 예시 -----
         *
         * 변환된 문자열: I Will Be A Good Developer.
         * 총 단어 개수: 6
         */
        System.out.print("문자열 입력: ");
        Scanner sc = new Scanner(System.in);
        String result = sc.nextLine();
        String[] arr_result = result.split(" ");
        System.out.print("변환된 문자열: ");
        for (String str : arr_result) {
            str = str.substring(0, 1).toUpperCase() + str.substring(1);
            System.out.print(str + " ");
        }
        System.out.println();
        System.out.println("총 단어 개수: " + arr_result.length);


    }
}
