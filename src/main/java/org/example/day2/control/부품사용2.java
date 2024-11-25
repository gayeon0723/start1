package org.example.day2.control;

import javax.swing.*;
import java.awt.*;

public class 부품사용2 {
    public static void main(String[] args) {
        //JFrame만들고
        JFrame f = new JFrame(); //주소
        f.setSize(500,500);
        f.setTitle("부품사용연습");
        //버튼을 하나 만들어
        JButton button = new JButton();
        button.setText("button");
        button.setBackground(Color.BLUE);

        Font font  = new Font("궁서", Font.BOLD, 20);
        button.setFont(font);

        //그 위에 얹어보세요.
        FlowLayout fl = new FlowLayout();
        f.setLayout(fl);

        f.add(button);

        f.setVisible(true);
        //설정은 여러분 마음대로.!

    }
}
