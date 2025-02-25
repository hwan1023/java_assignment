package com.hanhwa_java_assignment.assignment08.level01.basic;

import com.hanhwa_java_assignment.assignment08.level01.basic.exception.BeforeTwenty;
import com.hanhwa_java_assignment.assignment08.level01.basic.exception.Nondividing;

import java.time.LocalDate;
import java.util.Date;

public class ExceptionTest2 {
    public void checkbirth(LocalDate birth) throws BeforeTwenty {
        if (birth.plusYears(20).isAfter(LocalDate.now())){

            throw new BeforeTwenty(" 만 20세 미만은 입장 불가입니다.");
        }
        System.out.println("입장하셔도 됩니다.");
    }

}
