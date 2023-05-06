package br.unitins.sockets.Multicast;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class ClientUDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        String msg = "Bom dia, seja bem vindos a unitins";
        byte[] buffer = msg.getBytes();

        InetAddress addr = InetAddress.getByName("228.5.6.7");

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, addr, 2525);

        socket.send(packet);

        System.out.println("Mensagem enviada para o Servidor: " + msg);
    }
}
