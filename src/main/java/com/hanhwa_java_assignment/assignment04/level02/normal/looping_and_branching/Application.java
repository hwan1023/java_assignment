package com.hanhwa_java_assignment.assignment04.level02.normal.looping_and_branching;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하시오 : ");
        String word = sc.nextLine();
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            System.out.println(i + ":" + ch);
        }
    }
}
