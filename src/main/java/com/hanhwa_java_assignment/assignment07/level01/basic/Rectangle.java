package com.hanhwa_java_assignment.assignment07.level01.basic;

public class Rectangle extends Shape implements Resizable {
    private double width;
    private double height;


    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    /* 넓이 계산 메소드 */
    public double calculateArea(){
        return width * height;
    };
    /* 둘레 계산 메소드 */
    public double calculatePerimeter(){
        return 2 * (width + height);
    };
    public void resize(double factor) {
        width = width * factor;
        height = height * factor;
    }


}
