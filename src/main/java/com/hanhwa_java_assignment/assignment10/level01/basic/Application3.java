package com.hanhwa_java_assignment.assignment10.level01.basic;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String question;
        Queue que = new LinkedList();

        while(true){
            System.out.print("대기 고객 이름 입력 (다음 고객으로 넘어가려면 'next', 종료하려면 'exit'): ");
            question = sc.nextLine();
            if (question.equals("exit")){
                break;
            }
            if (question.equals("next")){
                if (que.peek() == null){
                    System.out.println("대기 고객이 없습니다.");
                }else{
                    System.out.println(que.poll() + " 고객님 차례입니다.");
                }
            }
            else{
                System.out.println(question + "님이 대기 등록 되었습니다.");
                que.offer(question);
            }

        };


    }
}
