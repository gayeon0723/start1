package org.example.day17.네트워크;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDPReceiver1 {
    public static void main(String[] args) throws IOException {
        byte[] data = new byte[256];
        DatagramPacket packet = new DatagramPacket(data, data.length);
        DatagramSocket socket = new DatagramSocket(56514);
        System.out.println("받는 쪽 소켓 시작");
        System.out.println("받을 준비 끝");
        socket.receive(packet);
        System.out.println(new String(data));
        socket.close();
    }
}
