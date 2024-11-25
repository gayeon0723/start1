package org.example.day18.람다식;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class basic_q4_stream {
    public static void main(String[] args) {
        //1.
        List<String> strings = Arrays.asList("파인애플", "송아지", "양", "스마일", "소");
        //● 한 글자인 요소들을 필터링한 후,
        List<String> oneChar = strings.stream()
                                .filter(word -> word.length() == 1)
                                .collect(Collectors.toList());
        //● 목록을 생성 후 출력
        System.out.println(oneChar);

        //2.
        List<String> images = Arrays.asList("1.png", "2.png", "3.jpeg", "4.jpeg");
        //● jpeg으로 끝나는 요소들을 필터링한 후,
        List<String> jpegImages = images.stream()
                                    .filter(image -> image.endsWith(".jpeg"))
                                    .collect(Collectors.toList());
        //● 목록을 생성 후 출력하시오.
        System.out.println(jpegImages);
    }
}
