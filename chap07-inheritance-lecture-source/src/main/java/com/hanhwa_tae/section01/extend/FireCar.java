package com.hanhwa_tae.section01.extend;
/*자식 클래스 / extends의 의미 -> 부모의 기능을 그대로 쓰지만 OR 가꿔서 추가해서 사용가능*/
public class FireCar extends Car {
    /* Car 클래스의 모든 멤버(필드, 메소드)를 상속 받을 수 있다.
    * 단, 생성자는 상속 받지 못한다.
    * */
    public FireCar() {
         // compiler가 자동으로 생성해줌
        /* 모든 생성자에는 맨 첫 줄에 super()를 컴파일러가 자동으로 추가한다.
        * 부모의 기본 생성자를 호출하는 구문으로 명시적 or 묵시적으로 사용 가능하다.*/
        super();
        System.out.println("FireCar 클래스 기본 생성자 호출");
    }
    /*soundHorn 메소드 재작성: overriding*/
    @Override // @-> annotation -> annotation이란 compiler에게 알려주는 역할임
    /*예를 들면 soundHorn을 soundHor이라하면 @Override에 의해 오버라이딩 못한다고 알려줌
    * 왜냐 overriding하기 위해서는 부모랑 메소드 이름 같아야됌
    * @Override 어노테이션 : 오버라이딩 성립 요건을 체크하여 성립 되지 않는 경우 컴파일 에러 발생*/
    public void soundHorn(){

        /*private 접근 제어자가 붙은 필드는 상속을 받지만, 자식이 접근 X
        * protected로 변경하면 자식이 접근할 수 있다.*/
        if(isRunning()){ /*isRunning의 메소드는 private, 상속을 받긴 받지만, private접근제한자는 자기 자신만 접근할 수 있다는 제약이 있음
                            => isRunning()를 protected로 바꾸면됨 -> 상속받으면 접근할 수 있게 해준다는 의미*/
            System.out.println("빠아아아아아!!빠아아아빵!!!!");

        }else{
            System.out.println("소방차가 앞으로 갈 수 없습니다. 비키세요.");
        }
    }
    /*상속은 자식 클래스가 부모 클래스를 확장하는 것이므로 FireCar만의 추가 기능도 작성 가능하다.*/
    public void sprayWater(){
        System.out.println("물을 뿌립니다.===========================>");
    }


}
