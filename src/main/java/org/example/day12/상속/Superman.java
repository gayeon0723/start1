package org.example.day12.상속;

public class Superman extends Man {

    public Superman(char gender, String name, int power) {
        super(gender, name, power);
    }

    //필드 : 성별, 이름, 힘크기(3개)
    //메서드 : 잠자다, 먹다, 달리다, 날아다니다(4개)
    public void fly(){
        System.out.println("우주를 날아다니다.");
    }

    @Override
    public String toString() {
        return "Superman{" +
                "power=" + power +
                ", gender=" + gender +
                ", name='" + name + '\'' +
                '}';
    }
}
