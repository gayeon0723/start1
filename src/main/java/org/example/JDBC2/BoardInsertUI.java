package org.example.JDBC2;

import java.util.Scanner;

public class BoardInsertUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("no입력>> ");
        int no값 = sc.nextInt();
        System.out.print("title입력>> ");
        String title값 = sc.next();
        System.out.print("content입력>> ");
        String content값 = sc.next();
        System.out.print("writer입력>> ");
        String writer값 = sc.next();
        sc.close();

        //Board테이블과 연결해서 입력받은 데이터를 주고 insert해달하고 부르자.(호출하자.)
        //BoardDAO클래스 사용해서 insert()호출!
        BoardDAO dao = new BoardDAO();
        dao.insert(no값, title값, content값, writer값);
    }
}
