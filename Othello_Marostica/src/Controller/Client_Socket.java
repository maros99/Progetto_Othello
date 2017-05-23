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

public class Client_Socket {

    private Socket s;
    private String mes;
    private int ID;
    private PrintWriter send;
    private BufferedReader in;
    private String Nome;

    /**
     *
     * @param s
     * @param ID
     * @throws IOException
     * Costruttore oggetto Socket
     * Gestione della connessione con il server con gli Stream
     */
    public Client_Socket(Socket s, int ID) throws IOException {
        this.s = s;
        this.ID = ID;
        in = new BufferedReader(new InputStreamReader(s.getInputStream()));
        send = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
        System.out.println("Connessione stabilita\n\n");
    }
    
    /**
     * Metodo per inviare una Steinga di testo 
     * @param s
     */
    public void Send(String s){         
            send.println(s);       
    }
    
    /**
     * Metodo per restituire il nome
     * @return Nome
     */
    public String getNome(){
        return Nome;
    }
    
    /**
     * Metodo per restituire lo stream Reader
     * @return
     */
    public BufferedReader getReader(){
        return in;
    }
    
    /**
     * Metodo per settare una stringa
     * @param s
     */
    public void setNome(String s){
        Nome = s;
    }
    
}