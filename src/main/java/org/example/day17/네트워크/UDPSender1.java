package org.example.day17.네트워크;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSender1 {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        String s = "I am a android programmer!";
        byte[] data = s.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, ip, 56514);
        socket.send(packet);
        System.out.println("패킷을 보냄.");
        socket.close();
    }
}
