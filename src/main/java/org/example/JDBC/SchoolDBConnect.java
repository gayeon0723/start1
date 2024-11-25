package org.example.JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SchoolDBConnect {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("1. MYSQL 자바 연결할 DRIVER 설정 성공.");

            String url = "jdbc:mysql://localhost:3306/shop2";
            String id = "root";
            String pw = "1234";

            Connection con = DriverManager.getConnection(url, id, pw);
            System.out.println("2. MYSQL 연결 성공.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
