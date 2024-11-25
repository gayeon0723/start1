package org.example.day6.array3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class 그래픽3 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel label = new JLabel();
        label.setText("무엇을 먹을까요?");
        JTextField field = new JTextField(10);

        JLabel label2 = new JLabel();
        label2.setText("당신의 나이는?");
        JTextField field2 = new JTextField(10);

        JLabel label3 = new JLabel();
        label3.setText("국어 점수?");
        JTextField field3 = new JTextField(10);

        JLabel label4 = new JLabel();
        label4.setText("수학 점수?");
        JTextField field4 = new JTextField(10);

        JButton button = new JButton();
        button.setText("어디로 갈까요.");

        JButton button2 = new JButton();
        button2.setText("나의 내년 나이는?");

        JButton button3 = new JButton();
        button3.setText("두 과목 점수의 평균은?");

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String data = field.getText();//아메리카노
                if (data.equals("아메리카노")) {
                    JOptionPane.showMessageDialog(frame, "카페로 가세요.");
                } else {
                    JOptionPane.showMessageDialog(frame, "그러면 물을 마셔요.");
                }
            }
        });



        button2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int age = Integer.parseInt(field2.getText());
                JOptionPane.showMessageDialog(frame,"당신의 내년 나이는 : " + (age+1) );
            }
        });

        button3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int jumsu = Integer.parseInt(field3.getText());
                int jumsu2 = Integer.parseInt(field4.getText());
                int sum = (jumsu + jumsu2);
                double aveg = sum / 2.0;
                JOptionPane.showMessageDialog(frame,"평균 점수는 : " + aveg );
            }
        });




        FlowLayout flowLayout = new FlowLayout();
        frame.setLayout(flowLayout);

        frame.add(label);
        frame.add(field);
        frame.add(button);
        frame.add(label2);
        frame.add(field2);
        frame.add(button2);
        frame.add(label3);
        frame.add(field3);
        frame.add(label4);
        frame.add(field4);
        frame.add(button3);


        frame.setVisible(true);
    }
}
