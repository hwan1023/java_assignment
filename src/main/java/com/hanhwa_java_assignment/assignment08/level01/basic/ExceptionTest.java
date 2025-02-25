package com.hanhwa_java_assignment.assignment08.level01.basic;

import com.hanhwa_java_assignment.assignment08.level01.basic.exception.Nondividing;
import com.sun.security.jgss.GSSUtil;

public class ExceptionTest {
    public void checkdevide(int a, int b) throws Nondividing {

        if (b == 0){
            throw new Nondividing("0으로 나누는 것은 허용되지 않습니다. \n 실행이 완료되었습니다.");
        }
        System.out.println("결과 : " +a / b + "\n실행이 완료되었습니다.");





    }
}
