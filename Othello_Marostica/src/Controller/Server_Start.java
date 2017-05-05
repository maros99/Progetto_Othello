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
import java.net.ServerSocket;
import java.util.*;

public class Server_Start {
    public static int i = 0;
    private static ArrayList BR;
    private static ArrayList PW;
    
    public Server_Start() {
        PW = new ArrayList<PrintWriter>();
        BR = new ArrayList<BufferedReader>();
        try{    
            ServerSocket ss = new ServerSocket(2250);
            while (true) {
                new Client_Socket(ss.accept(), i);
                    if((i%2) == 1){
                        
                    }
                i++;
              /*viene creato un thread SOLO QUANDO un client si collega dopo il 3wayHandShake
                il server rimanda indietro il pacchetto e basta.
                Nel frattempo lui aspetta sempre, creando sempre un altro thread per connessione
              */
            }
        }catch(IOException e){
            System.err.print(e);
        }
    }
    
    public static void add(PrintWriter p, BufferedReader r){
        PW.add(p);
        BR.add(r);
    }
    
    public static PrintWriter getPrint(int i){
        PrintWriter w = (PrintWriter) PW.get(i);
        return w;
    }
    
    public static BufferedReader getReader(int i){
        BufferedReader b = (BufferedReader) BR.get(i);
        return b;
    }
    
}
