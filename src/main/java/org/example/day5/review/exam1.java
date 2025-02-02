package org.example.day5.review;

public class exam1 {
    public static void main(String[] args) {
        /* 문제 1
        int[] term1 = {77, 88, 99, 55, 70};
        int[] term2 = {99, 100, 88, 80, 70};
        // 1. 성적이 2학기에 향상된 학생의 수를 카운트해서 프린트
        // 2. 성적이 1, 2학기 동일한 학생의 수를 카운트해서 프린트
        // c타입의 for문 : i를 이용가능, 입력/출력 가능, 여러 개의 배열을 다룰 때
        // for-each문 : 간단, 출력만 가능, 하나의 배열을 다룰 때
        // 누적시키는 변수는 반복문 안에 넣으면 X
        int high = 0, same = 0;
        for (int i = 0; i < term1.length; i++) {
            if (term1[i] == term2[i]) {
                //조건에 해당하는 구문은 무조건 논리형(true/false)
                same++;
            } else if (term1[i] < term2[i]) { //>, <
                high++;
            } //if
        } //for
        System.out.println(high + " " + same);
        */
        /* 문제 2
        Scanner sc = new Scanner(System.in);
        int[] data = new int[3]; //{0,0,0}
        for (int i = 0; i < 3; i++) {
            //출력, 입력
            System.out.print("숫자 입력 : ");
            data[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(data));
        //Arrays.toString(data) ==> 배열에 있는 데이터를 가져다가
        //                  "[값, 값, 값]" String으로 만들어준다.
        //합, 평균(2번째 패턴)
        int sum = 0;
        for (int x : data) {
            sum += x; //sum = sum + x;
        }
        System.out.println(sum);
        System.out.println(sum / (double)data.length);
        //System.out.println((double)sum / data.length);
        //System.out.println((double)sum / (double)data.length);
        //System.out.println((double)(sum / data.length));
        //double result = (double)(sum / data.length);
        //산술 연산시 하나라도 실수이면 결과는 실수이다.
        */
        /* 문제 3
        Random r = new Random(44);
        int[] n = new int[1000];
        int sum2 = 0;
        for (int i = 0; i < n.length; i++) {
            //0~999 ==> 1 ~ 1000
            //r.nextInt(범위최대값) + 범위최소값
            sum2 = sum2 + n[i]; //sum2=+ n[i];
        }
        System.out.println(Arrays.toString(n));
        System.out.println(n[0] + n[2] + n[4] + n[99] + n[989]);
        System.out.println(sum2);
        System.out.println((double)sum2/ n.length);
        */
        /* 문제 4
        Scanner sc = new Scanner(System.in);
        System.out.println("가고 싶은 곳 (보기, 1)백두산, 2)한라산, 3)후지산) 입력 >>");
        //입력 --> 처리(저장) --> 출력
        int input = sc.nextInt(); //1, 2, 3
        String result = null; //주소가 없다. 참조형
        switch (input) {
            case 1:
                result = "백두산은 열차";
                break;
            case 2:
                result = "한라산은 배";
                break;
            case 3:
                result = "후지산은 비행기";
                break;
            default:
                result = "안탐!";
                break;
        }
        System.out.println("당신이 가고 싶은 곳인 " + result + "를 타고 가야합니다.");
        */
        /* 문제 5
        //length == 길이 == 개수 == size
        Random r = new Random(555);
        int[] n2 = new int[1000];
        int c80 = 0, c70 = 0, c50 = 0, c0 = 0; //여러개 변수 다 따로 초기화
        for (int i = 0; i < n2.length; i++) {
            n2[i] = r.nextInt(100) + 1;
            if (n2[i] >= 80){
                c80++;
            } else if (n2[i] >= 70) { //70~79
                c70++;
            } else if (n2[i] >= 50) { //50~69
                c50++;
            } else { //49
                c0++;
            } //if
        } //for
        System.out.println(c80 + " " + c70 + " " + c50 + " " + c0);
        */
    } //main
} //class
