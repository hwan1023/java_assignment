package com.hanhwa_java_assignment.assignment05.level03.hard;

import java.util.Arrays;
import java.util.Random;

public class CreatingRectangular {
    public void creatingRectangularStatement(int a, int b){
        char[][] rectangular = new char[a][b];
        Random rand = new Random();
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
//              숫자를 문자열로 빠르게 변화할 수 있음
                char ch = (char)(rand.nextInt(26) + 'A');
                rectangular[i][j] = ch;
            }
        }
        for (int i = 0 ; i < a;i++){
            System.out.println(Arrays.toString(rectangular[i]));
        }
    }
}
