package org.example.day12.상속;

public class Woman extends Person{
    //public Woman() {
        //super();
    //}
    int walk;

    public Woman(char gender, String name, int walk) {
        super(gender, name);
        this.walk = walk;
    }
}
