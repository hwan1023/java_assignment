package com.hanhwa_java_assignment.assignment05.level02.normal;

public class ConvertNum {
    public void ConvertNumStatement(String input) {
        char[] input_array = input.toCharArray();

        for(int i = 0; i <input_array.length;i++){
            if(i < 8){
                System.out.print(input_array[i]);
            }else{
                System.out.print("*");
            }
        }
    }
}
