package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q3_stream {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "Hi", "smile");

        //1. 각 요소를 모두 대문자로 변경한 후, 글자 수가 4를 초과하는 데이터들의 list를 생성해 출력하세요.
        List<String> UpperCaseList = words.stream()
                .map(String::toUpperCase)
                .filter(word -> word.length() > 4)
                .collect(Collectors.toList());
        System.out.println(UpperCaseList);

        //2. 각 요소에 대해 “님"을 붙인 후, list를 생성해 출력하세요.
        List<String> appendedList = words.stream()
                .map(word -> word + "님")
                .collect(Collectors.toList());
        System.out.println(appendedList);
    }
}
