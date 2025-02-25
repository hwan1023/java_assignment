package com.hanhwa_java_assignment.assignment08.level01.basic;

import com.hanhwa_java_assignment.assignment08.level01.basic.exception.BeforeTwenty;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.util.Scanner;

public class Application2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionTest2 test = new ExceptionTest2();
        try{
            System.out.print("생년월일 입력 (yyyy-MM-dd 양식으로 작성) :");
            String birth = sc.nextLine();
            LocalDate birthDate = LocalDate.parse(birth);
            test.checkbirth(birthDate);

        }
        catch (DateTimeException e){

            System.out.println("날짜 양식을 잘못 입력하셨습니다.");
        } catch (BeforeTwenty e) {
            System.out.println(e.getMessage());;
        }

    }
}
