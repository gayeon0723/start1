package org.example.day11.review;

public class Day {
    String doing; //한 일
    int time; //시간
    String location; //장소

    static int count;
    //static변수는 공유목적, 누적목적 ==> 정적변수, 클래스변수
    static int sum; //time누적!

    //객체생성시 멤버변수 초기화할 목적으로!
    //생성자 메서드, 객체 생성시 자동 호출!
    //생성자 메서드가 되기 위한 조건
    //1. 클래스이름과 무조건 동일해야함.
    //2. 리턴타입을 명시하면 자동호출되지 않음.
    //생성자의 특징
    //1. 오버로딩할 수 있음.
    //2. 프로그래머가 하나도 생성자를 명시하지 않으면 컴파일러가 하나를 추가해줌.
    //   public 클래스명(){...} --> 입력매개변수가 없는 메서드를 생성해줌!
    //   기본생성자(default constructor) --> 입력매개변수가 없는 생성자 메서드

    //멤버변수 초기화! 생성자.
    public Day(String location, int time, String doing) {
        this.location = location;
        this.time = time;
        this.doing = doing;
        count++;
        sum = sum + time; //sum += time;
    }

    public static double getAvg(){
        //System.out.println(getDoing());
        //static메서드내에서 내 것을 호출할 때 static메서드만 가능!
        return sum / (double)count;
        //static메서드내에 사용할 수 있는 변수는 static변수만 써야한다.!
        //왜! ==> static은 객체생성하기 전에 언제든지 호출할 수 있는 개념이기 때문에
        //        객체생성 후

        //static 정리
        //static은 객체생성하지 않아도 클래스명으로 접근하여 사용할 수 있음.
        //static은 2가지
        //          - 변수 : 공유
        //          - 메서드 : 자주 사용하는 기능
        //사용법     - 변수 ; 클래스명.변수명()
        //          - 메서드 : 클래스명.메서드명()
        //주의       - static메서드내에 사용할 수 있는 변수는
        //            객체생성하지 않아도 언제든지 접근할 수 있는 static변수만 가능하다.!
        //예제       - 변수 : Color.red, Color.RED, Font.BOLD
        //          - 메서드 : Integer.parseInt("123") --> String을 int로 변환할 때
        //                    String data = "123";
        //                    (int)data; //같은 기본형이거나, 같은 참조형이거나 할때만
        //                               //타입을 바꿀 수 있음.(형변환)
        //                    String.valueOf(123) --> int를 String으로 변환할 때
    }
    //Day클래스내에서는 내 것이므로 그냥 메서드이름()으로 바로 호출해서 사용가능!
    public String getDoingTime(){
        return getDoing() + " " + time;
    }
    public String getDoing(){
        return doing;
    }

    //멤버변수를 프린트할 목적!
    //@Override --> 생략가능
    public String toString() {
        return "하루{" +
                "doing='" + doing + '\'' +
                ", time=" + time +
                ", location='" + location + '\'' +
                '}';
    }
    // ==> 이 클래스로 생성된 객체(참조형변수, day1)를 프린트할 때
    //     프린트할 스트링을 자동으로 만들어주는 것!
    //     모든 클래스는 toString()메서드를 가지고 시작함.(묵시적)
    //     패키지명.클래스명@주소--> 원래는 이렇게 스트링을 만들어줌.
}
