package org.example.day18.람다식;

public class StringFuntionalInterface사용 {
    public static void main(String[] args) {
        //String convert(String input);
        StringFuntionalInterface toUpperCase = input -> input.toUpperCase();
        String result = toUpperCase.convert("hello world");
        System.out.println("대문자로 변환된 문자열:" + result);
    }
}
