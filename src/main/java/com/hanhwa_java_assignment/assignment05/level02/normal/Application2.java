package com.hanhwa_java_assignment.assignment05.level02.normal;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_str = sc.nextLine();
        ConvertNum convertNum = new ConvertNum();
        convertNum.ConvertNumStatement(input_str);
    }
}
