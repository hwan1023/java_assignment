package com.hanhwa_java_assignment.assignment05.level04.advanced;

import java.util.Arrays;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        NumberBaseball numberBaseball = new NumberBaseball();

        int cnt = 10;
        int result = 0;
        while (cnt > 0){

            System.out.println(cnt + "회 남으셨습니다.");
            Scanner sc = new Scanner(System.in);
            String input_number = sc.nextLine();
            if(input_number.length() != 4){
                System.out.println("4자리의 정수를 입력해야 합니다.");
                continue;
            }
            System.out.println("4자리 숫자를 입력하세요 : ");
            result = numberBaseball.NumberBaseballStatement(input_number);
            cnt--;
            if(result == 1){
                break;
            }
            if((result == 0)&&(cnt == 0)){
                System.out.println("10번의 기회를 모두 소진하셨습니다.");
            }

        }

    }
}
