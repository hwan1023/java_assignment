package com.hanhwa_java_assignment.assignment08.level01.basic;

import java.io.*;
import java.util.Scanner;

public class Application4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("원본 파일의 이름을 입력하세요");
        String input = sc.nextLine();
        System.out.println("복사 파일의 이름을 입력하세요");
        String input2 = sc.nextLine();
        FileReader fr = null;
        FileWriter fout = null;
        char[] carr = null;
        try{
            fr = new FileReader(input);
            fout = new FileWriter(input2);
            carr = new char[(int) new File(input).length()];
            int length = 0;
            while ((length = fr.read(carr)) != -1){
                fout.write(carr, 0, length);
            }

            System.out.println("파일 복사가 성공적으로 완료 되었습니다.");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            try{
                fr.close();
                fout.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }




    }
}
