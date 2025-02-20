package com.hanhwa_java_assignment.assignment05.level04.advanced;

import java.util.Arrays;
import java.util.Random;

public class LottoNumber {
    public void LottoNumberStatement(){
        int[] array = new int[6];
        int num = 0;
        Random rand = new Random();
        for(int i=0;i<array.length;i++){
            num = rand.nextInt(45)+1;
            array[i] = num;
            for (int j=0; j< i; j++){
                if(array[j] == num ){
                    i--;
                    break;

                }
            }

        }
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
