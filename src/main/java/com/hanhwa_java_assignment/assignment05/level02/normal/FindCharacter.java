package com.hanhwa_java_assignment.assignment05.level02.normal;

public class FindCharacter {
    public int findCharacterStatement(String input,char ch){
        int cnt = 0;
        char[] chars = input.toCharArray();
        for(char i:chars){
            if(ch == i){
                cnt++;
            }
        }

        return cnt;
    }
}
