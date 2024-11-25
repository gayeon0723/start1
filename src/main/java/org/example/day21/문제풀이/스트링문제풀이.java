package org.example.day21.문제풀이;

import org.example.ArrPrint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class 스트링문제풀이 {
    public static void main(String[] args) {
//        1.
        String s = "감,배,위";
//        각 글자를 추출 후(split())
//        오름차순으로 정렬하여 String에 넣어 프린트
        String result = Arrays.stream(s.split(","))
                .sorted()
                .collect(Collectors.joining(","));
        System.out.println(result);

        System.out.println("------------------");

//        2.
        String[] s2 = {"제주도", "부산", "울릉도"};
//        다음과 같이 출력되도록 하나의 String으로 묶어서 프린트
//        나는 제주도 가고 싶다. 나는 부산 가고 싶다. 나는 울릉도 가고 싶다.
        StringBuilder result2 = new StringBuilder();
        for (String location : s2){
            result2.append("나는 ").append(location).append(" 가고 싶다.");
        }
        System.out.println(result2.toString().trim());

        System.out.println("------------------");

//        3.
        String[] s3 = {"제주도", "부산", "울릉도"};
//        s3 목록에 "울산", "파주", "인천"추가 후, 첫번째 위치에 있는 것 삭제
//        부산을 마산으로 변경후 하나의 String으로 묶어서 프린트
        List<String> list = new ArrayList<>(Arrays.asList(s3));
        list.add("울산");
        list.add("파주");
        list.add("인천");
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        list.set(0, "마산");
        System.out.println(list);

        System.out.println("------------------");

//        4.
        String s4 = "마사아차가나";
//        오름차순으로 정렬 후 프린트
        char[] c = s4.toCharArray();
        Arrays.sort(c);
        System.out.println(Arrays.toString(c));
        String result3 = new String(c);
        System.out.println(result3);

        System.out.println("------------------");

//        5. int[] s5 = {55, 100, 77, 88, 22}를 정렬 후 역순으로 int[] s6에 옮겨 프린트
        int[] s5 = {55, 100, 77, 88, 22};
        Arrays.sort(s5);
        int[] s6 = new int[s5.length];
        int j = s5.length - 1;
        for (int i = 0; i < s5.length; i++) {
            s6[j] = s5[i];
            j--;
        }
        ArrPrint.print(s5);

        System.out.println("------------------");

//        6. 216페이지 - 특정문자 제거하기
        
//        7. 226페이지 - 문자열 다루기 기본
//        8. 231페이지 - 서울에서 김서방 찾기
//        9. 242페이지 - 문자 반복 출력하기
//        10. 246페이지 - 문자열 뒤집기
//        11. 191페이지 - 숫자찾기
//        12. 192페이지 문제
    }
}
