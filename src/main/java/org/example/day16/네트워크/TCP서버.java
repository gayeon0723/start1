package org.example.day16.네트워크;

import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class TCP서버 {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(9000);
        int count = 0;
        while (true) {
            System.out.println("서버가 돌아가는 중.");
            Socket socket = server.accept();
            count++;
            System.out.println("현재까지 " + count + "개 승인이 떨어짐.");
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            out.print("i am a java programmer!!");
            out.close();
            socket.close();
        }
    }
}
