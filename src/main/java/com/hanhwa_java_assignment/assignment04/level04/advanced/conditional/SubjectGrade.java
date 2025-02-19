package com.hanhwa_java_assignment.assignment04.level04.advanced.conditional;

import java.util.Scanner;
public class SubjectGrade {
    public static void subjectGradeStatement(){
        Scanner sc = new Scanner(System.in);
        int kor = sc.nextInt();
        int eng = sc.nextInt();
        int math = sc.nextInt();

        if ((kor < 40) || (eng < 40) || (math < 40)) {
            if(kor<40){
                System.out.println("국어 점수 미달로 불합격입니다.");
            }

            if(eng<40){
                System.out.println("영어 점수 미달로 불합격입니다.");
            }
            if(math<40){
                System.out.println("수학 점수 미달로 불합격입니다.");
            }
        }
        else{
            if ((kor+eng+math)/3 < 60){
                System.out.println("평균 점수 미달로 불합격입니다.");
            }else{
                System.out.println("합격입니다");
            }
        }

    }

}
