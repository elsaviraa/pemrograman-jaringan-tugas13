/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pemrograman.jaringan.tugas13.Server;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author elsa
 */
public class ServerNo2 {
    public static void main(String[] args) throws IOException{
        ServerSocket sk = new ServerSocket(9999);
        Socket ss = sk.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(ss.getInputStream()));
        PrintStream out = new PrintStream(ss.getOutputStream());
        BufferedReader cin = new BufferedReader(new InputStreamReader(System.in));
        String inputan;
        while (true) {            
            inputan = in.readLine();
            if (inputan.equalsIgnoreCase("END")){
                out.println("BYE");
                break;
            }
            System.out.print("Client : " +inputan+"\n");
            System.out.print("Server : ");
            inputan = cin.readLine();
            out.println(inputan);
        }
        sk.close();
        ss.close();
        in.close();
        out.close();
        cin.close();

    }
}
