package com.hanhwa_java_assignment.assignment08.level01.basic;

import com.hanhwa_java_assignment.assignment08.level01.basic.exception.Nondividing;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ExceptionTest exceptionTest = new ExceptionTest();
        System.out.println("------입력 예시-----");
        try{
            System.out.print("분자를 입력 : ");
            int denominator = sc.nextInt();
            System.out.print("분모를 입력 : ");
            int numerator = sc.nextInt();
            exceptionTest.checkdevide(denominator, numerator);
        }catch(InputMismatchException e){
            System.out.println("오류 : 유효한 정수를 입력하세요");
            System.out.println("실행이 완료 되었습니다.");

        } catch (Nondividing e) {
            System.out.println(e.getMessage());;
        }


    }
}
