package org.example.day16.네트워크;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class TCP클라이언트 {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 1000; i++) {
            Socket client = new Socket("localhost", 9000);
            System.out.println(i + ">> 클라이언트가 9000포트 서버에 연결을 요청함.");
            BufferedReader buffer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            String data = buffer.readLine();
            System.out.println("서버로 부터 받은 데이터> " + data);
        }
    }
}
