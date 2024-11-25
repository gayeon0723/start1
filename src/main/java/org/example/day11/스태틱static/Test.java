package org.example.day11.스태틱static;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Random;

public class Test {
    public static void main(String[] args) {
        int[] n = {3, 5, 7, 9, 1};
        //정렬! 오름차순!
        Arrays.sort(n); //파괴형메서드
        System.out.println(Arrays.toString(n));
        System.out.println(n);

        String s = Arrays.toString(n); //비파괴형메서드
        System.out.println(s);

        Random random = new Random();
        System.out.println(random.nextDouble());

        for (int i = 0; i < 5; i++) {
            double n2 = Math.random();
            System.out.println(n2); //double
            //0~0.9999
            System.out.println(Math.floor(n2 * 100000000));
        }

        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(Calendar.YEAR);
        System.out.println(cal.get(Calendar.YEAR));
        System.out.println(cal.get(Calendar.MONTH) + 1);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        System.out.println(cal.get(Calendar.DATE));
        System.out.println(cal.get(Calendar.DAY_OF_WEEK));
        System.out.println(cal.get(Calendar.AM_PM));
        System.out.println(cal.get(Calendar.HOUR));
        System.out.println(cal.get(Calendar.MINUTE));
        System.out.println(cal.get(Calendar.SECOND));

        LocalDate localdate = LocalDate.now();
        System.out.println(localdate.getMonth());
        System.out.println(localdate.getYear());

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime.getHour());

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime.getYear());
        System.out.println(localDateTime.plusWeeks(2));

        System.out.println(localDateTime);

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("현재 시간: " + now.format(dtf));
        System.out.println(dtf.format(localDateTime));

        LocalDateTime result1 = now.plusYears(1);
        System.out.println("1년 덧셈: " + result1.format(dtf));

        LocalDateTime result2 = now.plusMonths(2);
        System.out.println("2월 뺄셈: " + result2.format(dtf));

        LocalDateTime result3 = now.plusDays(7);
        System.out.println("7일 덧셈: " + result3.format(dtf));

    }
}
