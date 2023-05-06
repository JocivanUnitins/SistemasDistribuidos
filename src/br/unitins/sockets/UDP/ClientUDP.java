package br.unitins.sockets.UDP;

import java.io.IOException;
import java.net.*;

public class ClientUDP {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket = new DatagramSocket();

        String msg = "Bom dia, seja bem vindos a unitins";
        byte[] buffer = msg.getBytes();

        InetAddress addr = InetAddress.getLocalHost();

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, addr, 2500);

        socket.send(packet);

        System.out.println("Mensagem enviada para o Servidor: " + msg);
    }
}
