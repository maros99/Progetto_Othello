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
public class Client_Socket {

    private Socket s;
    private String mes;
    private int ID;
    private PrintWriter send;
    private BufferedReader in;

    public Client_Socket(Socket s, int ID) throws IOException {
        this.s = s;
        this.ID = ID;
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        send = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
        System.out.println("Connessione stabilita\n\n");
        Connect();
    }

    public void Connect(){
        try{
            in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            send = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
            
            while (true) {
                mes = in.readLine();
                System.out.println(mes);
                send.println(mes);
            }
        } catch (IOException ex) {
            Logger.getLogger(Client_Socket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
   
}