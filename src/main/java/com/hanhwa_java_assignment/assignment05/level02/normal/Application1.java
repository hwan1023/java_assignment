package com.hanhwa_java_assignment.assignment05.level02.normal;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_str = sc.nextLine();
        String input_char = sc.nextLine();
        char ch = input_char.charAt(0);
        int answer = 0;
        FindCharacter findCharacter = new FindCharacter();

        answer = findCharacter.findCharacterStatement(input_str,ch);
        System.out.println("입력하신 문자열" + input_str + "에서 찾으시는 문자" + ch + "은" + answer + "개 입니다.");
    }
}
