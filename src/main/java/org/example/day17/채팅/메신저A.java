package org.example.day17.채팅;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class 메신저A extends JFrame {
    메신저A(){
        //여기에 코드 다하면, static이 아니여서 더 좋은 코드를 만들 수 있음.
        System.out.println("생성자 시작.");

        setTitle("메신저A");
        setSize(500, 500);
        getContentPane().setBackground(Color.pink);

        JTextArea list = new JTextArea();
        JTextField input = new JTextField();
        setLayout(new BorderLayout());
        add(list, BorderLayout.CENTER);
        add(input, BorderLayout.SOUTH);

        list.setBackground(Color.pink);
        Font font = new Font("굴림", Font.BOLD, 30);
        list.setFont(font);
        input.setBackground(Color.blue);
        input.setForeground(Color.white);
        input.setFont(font);
        list.setLineWrap(true);
        list.setAutoscrolls(true);
        list.setEditable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        input.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //엔터쳤을 때 실행하고 싶은 내용을 쓰자.
                //1. input에 입력한 데이터를 가지고 와서
                String data = input.getText();
                //1. list 끝에 붙이세요.
                list.append("나: " + data + "\n");
                input.setText(""); //2. 입력한거 지우기!
                //3. 입력한 내용을 상대방에게 보내자. --> 예외처리!필요!
                //전화기 역할 소켓필요.
                try {
                    DatagramSocket socket = new DatagramSocket();
                    byte[] data2 = data.getBytes();
                    InetAddress ip = InetAddress.getByName("127.0.0.1");
                    DatagramPacket packet = new DatagramPacket(data2, data2.length, ip, 7777);
                    socket.send(packet);
                    socket.close();
                } catch (Exception ex) {
                    System.out.println(ex.getMessage());
                }
                //입력한 데이터를 바이트 배열로 만들어서
                //소켓만들고
                //보내기
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        메신저A m = new 메신저A();
    }
}
