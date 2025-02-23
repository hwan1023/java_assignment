package com.hanhwa_java_assignment.assignment06.level01.basic.student.model.dto;
/*
* 클래스 다이어그램
private -
protected#
default ~
public +

첫번째 칸 필드
두번째 칸 생성자
세번째칸 메소드*/
public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private int kor;
    private int eng;
    private int math;

    public StudentDTO() {

    }
    public StudentDTO(int grade, int classroom, String name, int kor, int eng, int math){
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }

    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getClassroom(){
        return classroom;
    }
    public void setClassroom(int classroom){
        this.classroom = classroom;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getKor(){
        return kor;
    }
    public void setKor(int kor){
        this.kor = kor;
    }
    public int getEng(){
        return eng;
    }
    public void setEng(int eng){
        this.eng = eng;
    }
    public int getMath(){
        return math;
    }
    public void setMath(int mat){
        this.math = math;
    }


}
