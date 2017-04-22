/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;
import java.io.*;
import java.net.*;

/**
 *
 * @author marostica.lorenzo
 */

public class Client_Prova {
    
    public Client_Prova() throws IOException {
        try{    
            Socket s = new Socket("192.168.56.1", 2250);
            BufferedReader sock_in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter sock_out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
            BufferedReader std_in = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
            try{    
                sock_out.println(std_in.readLine());
                sock_out.println("echo");
                sock_out.println("echo2");
                //std_out.println(sock_in.readLine());
                System.out.println(sock_in.readLine());
                System.out.println(sock_in.readLine());
                System.out.println(sock_in.readLine());
            }catch(SocketException e){
                System.err.print("Connessione chiusa");
            }
        }
        }catch(IOException e){
            System.err.print(e);
        }
    }
}