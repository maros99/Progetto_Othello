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
    private static int nPartite;
    private static ArrayList CS;
    private static InGame Partite[];
    
    public Server_Start() {
        CS = new ArrayList<Client_Socket>();
        Partite = new InGame[100];
        try{    
            ServerSocket ss = new ServerSocket(2250);
            while (true) {
                new Client_Socket(ss.accept(), i);
                    if((i%2) == 1){
                        Partite[nPartite] = new InGame(getClient(i-1), getClient(i));
                        Partite[nPartite].start();
                        System.out.println("Partita iniziata");
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
    
    public static void add(Client_Socket c){
        CS.add(c);
    }
    
    public static Client_Socket getClient(int i){
        Client_Socket c =(Client_Socket) CS.get(i);
        return c;
    }
    
}
