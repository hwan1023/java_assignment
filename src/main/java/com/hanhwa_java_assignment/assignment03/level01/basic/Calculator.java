package com.hanhwa_java_assignment.assignment03.level01.basic;


import static java.lang.Math.max;

public class Calculator {
    public void CheckMethod(){
        System.out.println("메소드 호출 확인용");
    }
    public int sumto10(){
        int result = 0;
        for(int i = 1; i<=10; i++){
            result += i;
        }
        return result;
    }

    public void CheckMaxnumber(int a, int b){
        System.out.println("두 수 중 큰 수는: "+ max(a,b));
    }
    public int sumTwoNumber(int a, int b){

        return a+b;
    }
    public int minusTwoNumber(int a, int b){
        return a-b;
    }


}
