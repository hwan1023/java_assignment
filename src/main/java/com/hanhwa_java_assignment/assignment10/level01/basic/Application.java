package com.hanhwa_java_assignment.assignment10.level01.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char ch;
        double res = 0;
        ArrayList<Double> lst = new ArrayList<>();
        do{
            System.out.print("학생 성적 : ");
            double score = sc.nextDouble();
            sc.nextLine();
            System.out.print("추가입력하려면 y: ");
            ch = sc.next().charAt(0);


            lst.add(score);
        } while(ch != 'n');

        for (double i : lst){
            res += i;
        }
        System.out.println(res / lst.size());
    }
}
