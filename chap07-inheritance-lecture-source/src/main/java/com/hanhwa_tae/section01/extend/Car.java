package com.hanhwa_tae.section01.extend;

/*부모 클래스*/
public class Car {
    private boolean runningStatus;

    public Car(){ // Object라는 것을 부모로 삼고 있음 / 명시적이진 않음
        super();
        System.out.println("Car 클래스 기본 생성자 호출");
    }
    public void run(){
        runningStatus = true;
        System.out.println("자동차가 달립니다.");
    }
    public void stop(){
        runningStatus = false;
        System.out.println("자동차가 멈춥니다.");
    }
    /*내부에서만 호출할 때*/
    protected boolean isRunning(){
        return runningStatus;

    }

    public void soundHorn(){
        if(isRunning()){
            System.out.println("빵!빵");

        }else{
            System.out.println("주행 중이 아닌 상태에서는 경적을 울릴 수 없습니다.");
        }
    }
}
