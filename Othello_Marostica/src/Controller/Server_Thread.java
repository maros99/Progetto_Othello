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
public class Server_Thread extends Thread {

    private Socket s;

    public Server_Thread(Socket s) {
        this.s = s;
    }

    public void run() {
        
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            PrintWriter out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
            
            while (true) {
                out.println(in.readLine());
            }
        } catch (IOException ex) {
            Logger.getLogger(Server_Thread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
