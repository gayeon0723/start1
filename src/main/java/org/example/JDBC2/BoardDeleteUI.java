package org.example.JDBC2;

import java.util.Scanner;

public class BoardDeleteUI {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("no입력>> ");
        int no값 = sc.nextInt();
        sc.close();

        //Member테이블과 연결해서 입력받은 데이터를 주고 insert해달하고 부르자.(호출하자.)
        //MemberDAO클래스 사용해서 delete()호출!
        BoardDAO dao = new BoardDAO();
        dao.delete(no값);
    }
}
