package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q2_stream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5);

        //1. 3초과인 데이터 들만 모은 list를 생성해 출력하세요.
        List <Integer> filteredList = numbers.stream()
                .filter(n -> n > 3)
                .collect(Collectors.toList());
        System.out.println(filteredList);

        //2. 각 요소에 대해 10을 곱한 후 list를 생성해 출력하세요.
        List <Integer> multipliedList = numbers.stream()
                .map(n -> n * 10)
                .collect(Collectors.toList());
        System.out.println(multipliedList);
    }
}
