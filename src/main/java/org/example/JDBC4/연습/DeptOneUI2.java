package org.example.JDBC4.연습;

import java.sql.SQLException;

public class DeptOneUI2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeptDAO2 dao = new DeptDAO2();
        DeptVO2 bag = dao.one(1);
        System.out.println("검색한 no>> " + bag.getDeptno());
        System.out.println("검색한 name>> " + bag.getDname());
        System.out.println("검색한 loc>> " + bag.getLoc());
    }
}
