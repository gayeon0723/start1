package org.example.JDBC3.read연습;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class DeptVO { //메서드 호출, 입력값 전달, 반환값 전달
    //table에 있는 컬럼이름과 동일하게 만드는 중
    private int deptno;
    private String dname;
    private String loc;
}
