package com.hanhwa_java_assignment.assignment05.level03.hard;

import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("가로 행의 수를 입력하세요. : ");
        int a = sc.nextInt();
        System.out.print("세로 행의 수를 입력하세요. : ");
        int b = sc.nextInt();
        CreatingRectangular creatingrectangular = new CreatingRectangular();
        while((a>10) || (b>10)){
            System.out.println("반드시 1~10까지의 정수를 입력해야 합니다. 다시 입력하세요.");
            System.out.print("가로 행의 수를 입력하세요. : ");
            a = sc.nextInt();
            System.out.print("세로 행의 수를 입력하세요. : ");
            b = sc.nextInt();

        }
        creatingrectangular.creatingRectangularStatement(a,b);

    }
}
