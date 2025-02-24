package com.hanhwa_java_assignment.assignment07.level01.basic;

import org.w3c.dom.UserDataHandler;

public class ShapeManager {
    private Shape[] shapes = new Shape[10];
    private int index;

    public void addShape(Shape shape) {
        /* 배열에 전달 된 Shape를 추가. 단, 배열의 크기가 부족할 경우 2배로 늘려서 추가. */
        int cnt = 0;
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] != null){
                cnt++;
            }
        }
        if (cnt == shapes.length) {
            Shape[] temp = new Shape[shapes.length];
            temp = shapes;
            shapes = new Shape[shapes.length * 2];
            shapes = temp;
        }
        for (int i = 0; i < shapes.length; i++) {
            if (shapes[i] == null) {
                shapes[i] = shape;
                break;

            }
        }
    }

    public void removeShape(Shape shape) {
        /* 배열에서 전달 된 Shape를 찾아 제거. 단, 제거 된 인덱스가 비어 있지 않도록 뒤에 있는 객체를 앞으로 당김. */
        for (int i = 0; i<shapes.length; i++) {
            if (shapes[i] == shape) {
                for (int j = i ; j < shapes.length - 1; j++){
                    shapes[j] = shapes[j+1];
                }
                shapes[shapes.length - 1] = null;
            }
        }
    }

    public void printAllShapes() {
        /* 배열에 저장 된 모든 도형의 이름, 넓이, 둘레를 출력 */
        for (Shape shape : shapes) {
            if (shape != null) {
                if (shape instanceof Circle){
                    System.out.println("Shape : " + "Circle");
                    System.out.println("Area : " + shape.calculateArea());
                    System.out.println("Perimeter : " + shape.calculatePerimeter());

                }else if (shape instanceof Triangle){
                    System.out.println("Shape : " + "Triangle");
                    System.out.println("Area : " + shape.calculateArea());
                    System.out.println("Perimeter : " + shape.calculatePerimeter());
                }else{
                    System.out.println("Shape : " + "Rectangle");
                    System.out.println("Area : " + shape.calculateArea());
                    System.out.println("Perimeter : " + shape.calculatePerimeter());
                }
            }else{
                break;
            }

        }
    }

    public double getTotalArea() {
        double sum = 0;
        for (Shape shape : shapes) {
            if (shape != null) {sum += shape.calculateArea();}
            else{
                break;
            }

        }
    return sum;
    }

    public double getTotalPerimeter() {
        /* 배열에 저장 된 모든 도형의 둘레를 더해서 반환 */
        double sum = 0;
        for (Shape shape : shapes) {
            if (shape != null) {sum += shape.calculatePerimeter();}
            else{ break;}

        }
        return sum;

    }
}
