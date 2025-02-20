package com.hanhwa_java_assignment.assignment05.level04.advanced;

import java.util.Random;

public class NumberBaseball {
    public int NumberBaseballStatement(String inputNumber) {
        int s_cnt = 0;
        int b_cnt = 0;

        int[] numbers = new int[4];
        for (int i = 0; i <inputNumber.length(); i++) {
            numbers[i] = inputNumber.charAt(i) - '0';
        }

        Random rand = new Random();
        int[] array = new int[4];
        int num = 0;
        for (int i = 0; i<array.length; i++){
            num = rand.nextInt(10);
            array[i] = num;
            for(int j=0; j<i;j++){
                if(array[j] == num){
                    i--;
                    break;
                }
            }
        }
        for (int i = 0; i < 4; i++){
            for (int j = 0; j < 4 ;j++){
                if (array[i] == numbers[j]){
                    if (i == j){
                        s_cnt++;
                    }else{
                        b_cnt++;
                    }

                }
            }
        }
        if (s_cnt == 4){
            System.out.println("정답입니다.");
            return 1;
        }else{
            System.out.println("아쉽네요" + s_cnt + "S" + b_cnt + "B 입니다.");
            return 0;
        }
    }
}
