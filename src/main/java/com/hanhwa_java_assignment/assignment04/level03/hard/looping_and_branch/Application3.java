package com.hanhwa_java_assignment.assignment04.level03.hard.looping_and_branch;

import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        String alpha = "";
        for(char i = 97 ; i <= 122 ; i++){
            alpha += i;
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열 입력: ");
        String que = sc.nextLine();
        System.out.print("문자 입력: ");
        String ch = sc.nextLine();
        int cnt = 1;
        int result = 0;
        for(int i = 0 ; i < que.length() ; i++){
            if(!alpha.contains(String.valueOf(que.toLowerCase().charAt(i)))){
                cnt = 0;
                System.out.println("영문자가 아닌 문자가 포함되어 있습니다.");
                break;
            }else{
                if (que.charAt(i) == ch.charAt(0)){
                    result++;
                }
            }
        }
        if (cnt == 1){
            System.out.println("포함된 갯수: " + result + "개");
        }
    }
}
