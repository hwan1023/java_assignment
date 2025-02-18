package com.hanhwa_java_assignment.assignment03.level01.normal;

import java.util.Arrays;
import java.util.Random;

public class RandomMarker {
    public static int randomNumber(int a, int b) {
        int randomNumber  = (int) (Math.random()*256) + (-128);
        return randomNumber;
    }
    public static String randomUpperAlphabet(int length) {
        String result = "";
        String charset = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int i = 0; i < length; i++) {
            int randomNumber = (int)(Math.random() * charset.length());
            result += charset.charAt(randomNumber);


        }
        return result;
    }
    public static String rockPaperScissors() {
        String result = "";
        String[] rsp = { "가위", "바위", "보" };
        result = rsp[(int) (Math.random() * rsp.length)];
        return result;
    }
    public static String tossCoin() {
        String result = "";
        String[] coin = {"앞면","뒷면"};
        result = coin[(int) (Math.random() * coin.length)];
        return result;
    }
}

