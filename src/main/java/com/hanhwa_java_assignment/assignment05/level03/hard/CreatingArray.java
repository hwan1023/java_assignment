package com.hanhwa_java_assignment.assignment05.level03.hard;

import java.util.Arrays;

public class CreatingArray {
    public void creatingArrayStatemnt(int num){
        int [] array = new int[num];
        for(int i = 0; i <num; i++){
            if(i<=(num/2)){
                array[i] = i+1;
            }else{
                array[i] = (num-i);
            }

        }
        System.out.println(Arrays.toString(array));
    }
}
