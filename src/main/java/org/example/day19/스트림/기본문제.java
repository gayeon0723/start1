package org.example.day19.스트림;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.Random;
import java.util.stream.Collectors;

public class 기본문제 {
    public static void main(String[] args) {
//        - 기본문제(스트림과 람다 이용)
//        1. 정수값 100개를 111~222까지 랜덤하게 스트림을 만들어서
//        최대값, 최소값, 합계, 평균을 구하시오.
        List<Integer> randomNumbers = new Random()
                .ints(100, 111, 223)
                .boxed()
                .collect(Collectors.toList());

        int max = randomNumbers.stream().mapToInt(Integer::intValue).max().getAsInt();
        int min = randomNumbers.stream().mapToInt(Integer::intValue).min().getAsInt();
        int sum = randomNumbers.stream().mapToInt(Integer::intValue).sum();
        double avg = randomNumbers.stream().mapToInt(Integer::intValue).average().getAsDouble();

        System.out.println("최대값 : " + max);
        System.out.println("최소값 : " + min);
        System.out.println("합계 : " + sum);
        System.out.println("평균 : " + avg);

        System.out.println("----------------");

//        2. 실수값 200개를 11.1~55.5까지 랜덤하게 스트림을 만들어서
//        전체 개수, 맨 앞에 있는 값, 평균을 구하시오.
        List<Double> randomDoubles = new Random()
                .doubles(200, 11.1, 55.5)
                .boxed()
                .collect(Collectors.toList());

        long count = randomDoubles.size();
        double firstValue = randomDoubles.get(0);
        OptionalDouble avg2 = randomDoubles.stream().mapToDouble(Double::doubleValue).average();

        System.out.println("전체 개수 : " + count);
        System.out.println("맨 앞에 있는 값 : " + firstValue);
        System.out.println("평균 : " + avg2);

        System.out.println("----------------");

//        3. 먹고 싶은 음식 7개를 List<String>에 넣은 후,
//        스트림으로 만들고 글자가 3글자 이상인 것 들만 모아서
//                프린트
        List<String> foodList = Arrays.asList("치킨", "피자", "햄버거", "족발", "파스타", "칼국수", "국밥");
        foodList.stream()
                .filter(food -> food.length() >= 3)
                .forEach(System.out::println);

        System.out.println("----------------");

//        4. 가고 싶은 곳 5개(산 2개 이상 넣음)를 String[]에 넣은 후,
//                스트림으로 만들고 글자가 "산"으로 끝나는 것을 모아 중간에 한번 출력 후
//        List<String>으로 모은 후 list를 출력
        List<String> placeList = Arrays.asList("보타니아", "매미성", "한라산", "향일암", "백두산", "동백섬", "설악산");
        placeList.stream()
                .filter(place -> place.endsWith("산"))
                .peek(System.out::println)
                .forEach(place -> System.out.println(place));

        //다른 방법
//        import java.util.Arrays;
//        import java.util.List;
//        import java.util.stream.Collectors;
//
//        public class Main {
//            public static void main(String[] args) {
//                // 가고 싶은 곳 배열 생성
//                String[] places = {"설악산", "한라산", "남산", "해운대", "제주도"};
//
//                // 스트림을 이용해 "산"으로 끝나는 곳 필터링, 중간 출력 후 리스트에 수집
//                List<String> mountains = Arrays.stream(places)
//                        .filter(place -> place.endsWith("산"))
//                        .peek(System.out::println)  // 중간 출력
//                        .collect(Collectors.toList());
//
//                // 최종적으로 리스트 출력
//                System.out.println("리스트로 모은 결과: " + mountains);
//            }
//        }

        System.out.println("----------------");

//        5. List<Double> list = Arrays.asList(11.1, 22.2, 33.3, 44.4, 55.5);를 스트림으로 만들어
//        최대값, 최소값, 합계, 평균을 구하시오.

//        6. List<Integer> list2 = Arrays.asList(55, 66, 88, 99, 99, 55, 100);을 스트림으로 만들어
//        중복을 제거후, 오름차순으로 정렬한 후 최소값을 구하시오.
    }
}
