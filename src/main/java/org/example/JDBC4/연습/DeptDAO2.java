package org.example.JDBC4.연습;

import javax.xml.transform.Result;
import java.sql.*;
import java.util.ArrayList;

public class DeptDAO2 {
    Connection con;

    public DeptDAO2() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("1. 드라이버 설정 성공!");
        String url = "jdbc:mysql://localhost:3306/shop2";
        String id = "root";
        String pw = "1234";
        con = DriverManager.getConnection(url, id , pw);
        System.out.println("2. db연결 성공!");
    }

    public DeptVO2 one(int deptno) throws SQLException {
        DeptVO2 bag = new DeptVO2();

        String sql = "select * from dept where deptno = ?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setInt(1, deptno);

        ResultSet table = ps.executeQuery();
        if(table.next()) {
            bag.setDeptno(table.getInt("deptno"));
            bag.setDname(table.getString(2));
            bag.setLoc(table.getString("loc"));
        }

        return bag;
    }

    public ArrayList<DeptVO2> list() {
        ArrayList<DeptVO2> list = new ArrayList<>();


        return list;
    }
}
