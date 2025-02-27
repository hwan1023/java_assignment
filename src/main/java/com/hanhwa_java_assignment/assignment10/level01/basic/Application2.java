package com.hanhwa_java_assignment.assignment10.level01.basic;

import java.util.LinkedList;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {

        LinkedList<String> l_lst = new LinkedList<>();
        String url;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.print("방문 URL을 입력하세요 (단, exit를 입력하면 종료) : ");
            url = sc.nextLine();
            if (l_lst.size() != 5)
            {
                l_lst.addFirst(url);
            }else{
                l_lst.removeLast();
                l_lst.addFirst(url);

            }

            System.out.println("최근 방문 url : " + l_lst);
        }while(!url.equals("exit"));

    }
}
