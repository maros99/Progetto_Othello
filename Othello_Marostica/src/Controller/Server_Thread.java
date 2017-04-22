/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author marostica.lorenzo
 */
import java.io.*;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Server_Thread{

    private Socket s;
    private String mes;

    public Server_Thread(Socket s) {
        this.s = s;
        start();
    }

    public void start() {
        
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter send = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
            
            while (true) {
                mes = in.readLine();
                System.out.println(mes);
                send.println(mes);
            }
        } catch (IOException ex) {
            Logger.getLogger(Server_Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}