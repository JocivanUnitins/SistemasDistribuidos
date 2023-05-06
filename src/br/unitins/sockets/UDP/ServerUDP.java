package br.unitins.sockets.UDP;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerUDP {
    public static void main(String[] args) throws IOException {

        DatagramSocket socket = new DatagramSocket(2500);

        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        System.out.println("Aguardando o recebimento do Datagrama");
        socket.receive(packet);

        byte[] clientData = packet.getData();
        String clientDataStr = new String(clientData, 0, packet.getLength());

        System.out.println("Dados Recebido do Cliente: " + clientDataStr);
    }
}
