package com.hanhwa_java_assignment.assignment03.level01.basic;

public class Application {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        calculator.CheckMethod();
        int sumto10 = calculator.sumto10();
        System.out.println("1부터 10까지의:" + sumto10);
        calculator.CheckMaxnumber(10,20);
        int sum_val = calculator.sumTwoNumber(10,20);
        System.out.println("10과 20의 합은: " + sum_val);
        int min_val = calculator.minusTwoNumber(10,5);
        System.out.println("10과 5의 차는: " + min_val);
    }

}
