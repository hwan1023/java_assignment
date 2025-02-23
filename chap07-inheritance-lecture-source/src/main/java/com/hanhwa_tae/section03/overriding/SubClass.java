package com.hanhwa_tae.section03.overriding;
/*자식,자손,후손 클래스*/
public class SubClass  extends SuperClass{
    /*메소드명, 리턴 타입, 매개변수 개수 & 타입 & 순서 일치해야 성립*/
    @Override //override규칙에 안맞으면 빨간표시
    /**/
    public void method(int num){
    }
    /*@Override
    *//*private 메소드 오버라이딩 불가*//*
    private void privateMethod(){

    }*/

    /*final 메소드 오버라이딩 불가*/
/*    @Override
    public void finalMethod(){

    }*/

    /*override 시 접근제어자를 수정하는 것은 가능*/
    /*protected -> default로 변경 시 보다 좁은 범위로 변경하는 것은 불가능
    * But 넓어지는 것은 가능하다!!!!
    * protected -> publlic로 변경 시 보다 넓은 범위로 변경하는 것은 가능
    * */
    public void protectedMethod(){

    }
}
