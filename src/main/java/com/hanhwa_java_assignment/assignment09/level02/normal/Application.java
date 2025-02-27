package com.hanhwa_java_assignment.assignment09.level02.normal;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("병합할 파일의 개수 입력 : ");
        int num = sc.nextInt();
        sc.nextLine();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            System.out.print(i+1 + "번째 파일 이름 입력 : ");
            list.add(sc.nextLine());
        }

        System.out.print("병합 될 파일명 입력 : ");
        String result = sc.nextLine();

            try {
                BufferedWriter bw = null;
                for (String input : list) {
                    int length = 0;
                    BufferedReader br = new BufferedReader(new FileReader(input));
                    bw = new BufferedWriter(new FileWriter(result, true));
                    char[] carr = new char[(int) new File(input).length()];
                    while ((length = br.read(carr)) != -1) {
                        bw.write(carr, 0, length);
                    }
                    bw.close();
                    br.close();

                }
                System.out.println("파일병합이 완료 되었습니다.");
                bw.close();

            } catch (IOException e) {
                System.out.println(e.getMessage());
            }




    }
}
