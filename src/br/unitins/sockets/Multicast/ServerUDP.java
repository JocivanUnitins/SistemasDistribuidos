package br.unitins.sockets.Multicast;

import java.io.IOException;
import java.net.*;

public class ServerUDP {
    public static void main(String[] args) throws IOException {

        InetAddress group = InetAddress.getByName("228.5.6.7");
        SocketAddress sa = new InetSocketAddress(group, 2525);
        NetworkInterface ni = NetworkInterface.getByName("eth0");

        MulticastSocket socket = new MulticastSocket(2525);

        socket.joinGroup(sa, ni);

        byte[] buffer = new byte[1024];

        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        System.out.println("Aguardando o recebimento do Datagrama");
        socket.receive(packet);

        byte[] clientData = packet.getData();
        String clientDataStr = new String(clientData, 0, packet.getLength());

        System.out.println("Dados Recebido do Cliente: " + clientDataStr);
    }
}
