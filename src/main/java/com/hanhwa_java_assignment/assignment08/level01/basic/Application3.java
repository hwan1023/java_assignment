package com.hanhwa_java_assignment.assignment08.level01.basic;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Application3 {
    public static void main(String[] args) {
        FileReader fr = null;
        System.out.println("파일 이름을 입력하세요 :");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        try{
            fr = new FileReader(input);

            int value;
            while ((value = fr.read())!=-1){
                System.out.print((char)value);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());;
        }


    }
}
