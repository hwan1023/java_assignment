package com.hanhwa_java_assignment.assignment04.level04.advanced.looping_and_branching;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String secret_str = sc.nextLine();
        System.out.print("숫자를 입력하세요 : ");
        int secret_num = sc.nextInt();
        if (secret_num>26) secret_num %= 26;
        String result = "";
        for (int i = 0; i < secret_str.length();i++){
            if(String.valueOf(secret_str.charAt(i)).equals(" ")){
                result += " ";
            }else {
                if((Character.isUpperCase((secret_str.charAt(i))))){
                    if ((secret_str.charAt(i) + secret_num) > 90){
                        result += (char)((secret_str.charAt(i) + secret_num) % 91 + 65);
                    }else{
                        result += (char)((secret_str.charAt(i) + secret_num));
                    }
                }else{
                    if ((secret_str.charAt(i) + secret_num) > 122){
                        result += (char)((secret_str.charAt(i) + secret_num) % 123 + 97);
                    }else{
                        result += (char)((secret_str.charAt(i) + secret_num));

                }
            }
        }


        }
        System.out.println(result);
}
}
