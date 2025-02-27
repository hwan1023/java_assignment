package com.hanhwa_java_assignment.assignment10.level01.basic;

import java.util.HashMap;
import java.util.Scanner;

public class Application6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> phoneNumber = new HashMap();
        while (true){
            System.out.print("이름과 전화번호를 띄어쓰기 기준으로 입력하세요 (검색하려면 'search', 종료하려면 'exit'): ");
            String[] question = sc.nextLine().split(" ");
            if (question[0].equals("exit")){
                break;
            }else{
                if ((question.length != 2) && (!question[0].equals("search"))) {
                    System.out.println("입력이 잘못 되었습니다. 다음 양식으로 입력해주세요 : <이름> <전화번호>");

                }else if(question[0].equals("search")){
                    System.out.print("검색할 이름: ");
                    String name = sc.nextLine();
                    if (phoneNumber.containsKey(name)){
                        System.out.println(name + "씨의 번호는 " + phoneNumber.get(name));
                    }else{
                        System.out.println(name + "씨의 번호는 등록되어있지 않습니다.");
                    }
                }else{
                    if (phoneNumber.containsKey(question[0])){
                        continue;
                    }else{
                        phoneNumber.put(question[0], question[1]);
                    }

                }

            }

        }




    }
}
