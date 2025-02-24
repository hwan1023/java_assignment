package com.hanhwa_java_assignment.assignment07.level01.basic;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Application2 {
    public static void main(String[] args) {

        /* ----- 입력 예시 -----
         *
         * 문자열 입력 : hello world Hello everyone! 안녕하세요 반갑습니다
         *
         * ----- 출력 예시 -----
         *
         * ===== 단어 빈도 =====
         * hello: 2
         * world: 1
         * everyone: 1
         * 가장 빈도 높은 단어 : hello (2 번)
         */
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] arr_input = input.split(" ");
        Map<String, Integer> Map= new TreeMap<>(String.CASE_INSENSITIVE_ORDER); // 대소문자 가리지 않고 넣고 싶을 때 키를..!
        for (int i = 0; i < arr_input.length; i++) {
            int cnt = 0;
            for (int j = i; j < arr_input.length; j++) {
                if (arr_input[i].toUpperCase().equals(arr_input[j].toUpperCase())) {
                    cnt++;
                }
            }
            Map.putIfAbsent(arr_input[i], cnt);


        }
        int max_num = 0;
        for (String key : Map.keySet()){
            max_num = Math.max(max_num,Map.get(key));
        }
        System.out.println("==== 단어 빈도=====");
        for (String key : Map.keySet()) {
            System.out.println(key + " : " + Map.get(key));
        }
        for (String key : Map.keySet()){
            if (Map.get(key) == max_num){
                System.out.println("가장 빈도 높은 단어 : " + key + "(" + max_num + "번)");
            }
        }
    }
}
