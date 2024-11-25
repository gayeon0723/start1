package org.example.day6.array3;

import javax.swing.*;

public class 그래픽2 {
    public static void main(String[] args) {
        //하나하고 확인하는 연습!
        JFrame frame = new JFrame();
        frame.setSize(300, 300);
        frame.setTitle("그래픽 연습");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //x를 누르면 프로그램 종료시킴 설정.!

        JButton button = new JButton();
        button.setText("나를 눌러!"); //함수, 메서드, 명령어는 명령어(입력 데이터);

        frame.add(button);

        //맨 끝!
        frame.setVisible(true);
    }
}
