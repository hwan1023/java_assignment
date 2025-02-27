package com.hanhwa_java_assignment.assignment10.level01.basic;

import java.util.LinkedHashSet;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedHashSet<String> s_lst = new LinkedHashSet<>();
        while(true){
            System.out.print("학생 ID 입력('exit' 입력 시 종료):");
            String input = sc.nextLine();
            if(input.equals("exit")){
                System.out.print("모든 학생의 ID: ");
                System.out.println(s_lst);
                break;
            }
            else{
                if (s_lst.contains(input)) {
                    System.out.println("이미 등록된 아이디입니다.");
                }else{
                    s_lst.add(input);
                    System.out.println("ID가 등록되었습니다");
                }

            }
        }
    }
}
