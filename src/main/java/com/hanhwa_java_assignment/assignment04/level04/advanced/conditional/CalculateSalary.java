package com.hanhwa_java_assignment.assignment04.level04.advanced.conditional;

import java.util.Scanner;

public class CalculateSalary {
    public void calculateSalaryStatement(){
        Scanner sc = new Scanner(System.in);
        int monthselling = sc.nextInt();
        int monthsalary = sc.nextInt();
        double bonus = sc.nextDouble();
        double result = 0;
        if(monthselling >= 50000000){
            bonus = 0.05;
            result = monthsalary * bonus + monthsalary;
        }else if(monthselling >= 30000000){
            bonus = 0.03;
            result = monthsalary * bonus + monthsalary;
        }else if(monthselling >= 10000000) {
            bonus = 0.01;
            result = monthsalary * bonus + monthsalary;
        }
        else{
            bonus = 0;
        }
        System.out.println("======================");
        System.out.println("매출액 : " + monthselling);
        System.out.println("보너스율 : " + bonus * 100 + "%");
        System.out.println("월 급여 : " + monthsalary);
        System.out.println("보너스 금액 : " + monthsalary * bonus);
        System.out.println("=======================");
        System.out.println("총 급여: "+result);
    }

    }


