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

import java.awt.Image;
import java.io.*;
import java.net.ServerSocket;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Server_Start {
    public static int i = 0;
    private static int nPartite;
    private static ArrayList CSs;
    private static InGame Partite[];
    
    public Server_Start() {
        CSs = new ArrayList<Client_Socket>();
        Partite = new InGame[100];
    }
    
    public static Client_Socket getClient(int i){
        Client_Socket c =(Client_Socket) CSs.get(i);
        return c;
    }
    
    public void search(){
                try{    
            ServerSocket ss = new ServerSocket(2250);
            while (true) {
                Client_Socket miozio = new Client_Socket(ss.accept(), i);
                CSs.add(miozio);
                    if((i%2) == 1){
                        Partite[nPartite] = new InGame(getClient(i-1), getClient(i));
                        Partite[nPartite].start();
                        System.out.println("Partita iniziata");
                    }else{
                        miozio.Send("Ricerca");
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
    
}
