package org.example.day12.상속;

public class Person {
    char gender;
    String name;

    public Person(char gender, String name) {
        //super(); --> 컴파일할 때 무조건 생성자 첫줄은 super()자동생성됨.
        this.gender = gender;
        this.name = name;
    }

    public void sleep(){
        System.out.println("잠자다.");
    }

    public void eat(){
        System.out.println("먹다.");
    }
}
