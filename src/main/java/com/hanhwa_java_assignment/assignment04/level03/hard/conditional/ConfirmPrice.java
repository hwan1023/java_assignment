package com.hanhwa_java_assignment.assignment04.level03.hard.conditional;

import java.util.Scanner;

public class ConfirmPrice {
    public void ConfirmPriceStatement(){
        System.out.print("과일 이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();
        switch (fruit){
            case "사과":
                System.out.println("사과의 가격은 1000원 입니다.");
                break;

            case "바나나":
                System.out.println("바나나의 가격은 3000원 입니다.");
                break;
            case "복숭아":
                System.out.println("복숭아의 가격은 2000원 입니다.");
                break;
            case "키위":
                System.out.println("키위의 가격은 5000원 입니다.");
                break;
            default:
                System.out.println("준비된 상품이 없습니다.");
        }
    }
}
