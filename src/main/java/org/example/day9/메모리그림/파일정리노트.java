package org.example.day9.메모리그림;

public class 파일정리노트 {
//    파일 다루기
//    -------------
//    1. 파일을 다루는 클래스를 크게 2가지로 나누어 각각을 비교 설명
    //바이트 스트림 : 모든 타입의 파일 대상, 바이트 단위로 처리
    //문자 스트림 : 텍스트 타입의 파일 대상, 문자 단위로 처리

//    2. 바이트 스트림과 문자 스트림의 차이
    //바이트 스트림 : 이름에 Stream이라고 붙어있음
    //문자 스트림 : 이름에 Reader, Writer라고 붙어있음

//    3. Reader, Writer가 붙어있는 클래스 이름은 바이트 스트림인가? 문자 스트림인가?
    //문자 스트림

//    4. 스트림은 무엇?
//    자바 프로그램과 외부의 자원을 연결해주는 통로
//    Connection, Stream
    //데이터의 흐름을 추상화한 것,
    //데이터를 순차적 또는 연속적으로 처리하는 방법을 제공
    //==> 데이터를 하나씩 차례대로 처리하는 통로
    //입력 스트림 : 데이터를 읽어오는 역할. ==> 내가 데이터가 필요할 때 그쪽에서 보내주는 것.
    //출력 스트림 : 데이터를 보내는 역할.  ==> 내가 어디론가 데이터를 흘려보내는 통로.

//    5. 바이트 스트림으로 읽을 때 한 번에 하나씩 읽는 것이 아니라
//    여러개를 읽어서 저장공간에 넣고 싶을 때 사용하는 것은?
    //배열, byte[]

//    6. 바이트스트림으로 도착한 입력데이터를 문자스트림으로 읽어오고 싶을 때
//    사용하는 브릿지역할의 클래스는?
    //InputStreamReader

//    7. Buffer를 사용하면 좋은 점은? 2가지
    //성능 개선,
    //라인별로 스트링으로 읽어올 수 있음.

//    8. 스트림을 다룰 때 꼭 해주어야하는 것은?
    //자원해제(close(), 예외처리)

//    9. 문자스트림을 사용할 때 버퍼에 있는 데이터를 한 줄 씩 읽어왔을 때 리턴 타입은?
    //String

//    10. 버퍼에 있는 데이터를 한 줄 씩 읽어왔을 때 더이상 없으면 반환되는 것은?
    //null
}
