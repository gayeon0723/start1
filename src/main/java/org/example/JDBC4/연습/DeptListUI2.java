package org.example.JDBC4.연습;

import org.example.JDBC3.read연습.DeptVO;

import java.sql.SQLException;
import java.util.ArrayList;

public class DeptListUI2 {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DeptDAO2 dao = new DeptDAO2();
        ArrayList<DeptVO2> list = dao.list();
        for (DeptVO2 bag : list) {
            System.out.println("검색한 no>> " + bag.getDeptno());
            System.out.println("검색한 name>> " + bag.getDname());
            System.out.println("검색한 loc>> " + bag.getLoc());
            System.out.println("------------------------");
        }
    }
}
