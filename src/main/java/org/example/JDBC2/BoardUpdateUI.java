package org.example.JDBC2;

import java.util.Scanner;

public class BoardUpdateUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("no입력>> ");
        int no값 = sc.nextInt(); //ice
        System.out.println("content입력>> ");
        String content값 = sc.next(); //9999
        sc.close();

        //Board테이블과 연결해서 입력받은 데이터를 주고 update해달라고 부르자.(호출하자.)
        //BoardDAO클래스 사용해서 update()호출!
        BoardDAO dao = new BoardDAO();
        dao.update(no값, content값);
    }
}
