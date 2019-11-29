/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman.jaringan.tugas13.Client;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 *
 * @author elsa
 */
public class ClientNo1 {
    public static byte buffer[] = new byte[1024];
    public static int clientport = 800, serverport = 900;

    public static void main(String[] args) throws Exception{
        DatagramSocket d = new DatagramSocket(clientport);
        System.out.println("Client sedang menunggu server mengirimkan data ");
        System.out.println("tekan Ctrl + C untuk mengakhiri ");
        while (true) {
            DatagramPacket p = new DatagramPacket(buffer, buffer.length);
            d.receive(p);
            String ps = new String(p.getData(), 0, p.getLength());
            System.out.println("From Server: " + ps);
        }
    }
}
