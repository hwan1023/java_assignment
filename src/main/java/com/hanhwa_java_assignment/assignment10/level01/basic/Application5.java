package com.hanhwa_java_assignment.assignment10.level01.basic;

import com.sun.source.util.Trees;

import java.util.Scanner;
import java.util.TreeSet;

public class Application5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question;
        TreeSet<String> result = new TreeSet<>();
        while(true){
            System.out.print("단어 입력 ('exit' 입력 시 종료): ");
            question = sc.nextLine();
            if(question.equals("exit")){
                System.out.println("정렬된 단어 : " + result);
                break;
            }else{
                result.add(question);
            }
        }
    }
}
