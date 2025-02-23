package com.hanhwa_java_assignment.assignment06.level01.basic.student.run;

import com.hanhwa_java_assignment.assignment06.level01.basic.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        StudentDTO[] student_info = new StudentDTO[10];
        int cnt = 0;
        Scanner sc = new Scanner(System.in);
        while(cnt < 10) {
            StudentDTO studentDTO = new StudentDTO();
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            sc.nextLine();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            sc.nextLine();
            System.out.print("이름 : ");
            String name = sc.nextLine();
            System.out.print("국어점수 : ");
            int kor = sc.nextInt();
            sc.nextLine();
            System.out.print("수학점수 : ");
            int math = sc.nextInt();
            System.out.print("영어 점수 : ");
            int eng = sc.nextInt();
            sc.nextLine();
            System.out.print("계속 추가할 겁니까? (y/n)");
            char op = sc.nextLine().charAt(0);
            student_info[cnt] = new StudentDTO(grade, classroom, name, kor, math, eng);
            if ((cnt == 2))
                {
                    for(StudentDTO res : student_info) {
                        if(res != null) {
                            System.out.print("학년=" + res.getGrade()
                                    + ", 반=" + res.getClassroom()
                                    + ", 이름=" + res.getName()
                                    + ", 국어=" + res.getKor()
                                    + ", 수학=" + res.getMath()
                                    + ", 영어=" + res.getEng()
                                    + ", 평균=" + (res.getKor() + res.getMath() + res.getEng()) / 3);
                            System.out.println();
                        }
                    }
            }
            cnt++;
            if (op == 'n') {
                break;}



        }

    }
}
