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
    private int ID = 0;
    public static int i = 0;
    private static ArrayList BR;
    private static ArrayList BW;
    public Server_Start() {
        BW = new ArrayList<BufferedWriter>();
        BR = new ArrayList<BufferedReader>();
        try{    
            ServerSocket ss = new ServerSocket(2250);
            while (true) {
                if((i%2) == 1){
                    ID++;
                }
                i++;
              /*viene creato un thread SOLO QUANDO un client si collega dopo il 3wayHandleShake
                il server rimanda indietro il pacchetto e basta.
                Nel frattempo lui aspetta sempre, creando sempre un'altro thread per connessione
              */
            }
        }catch(IOException e){
            System.err.print(e);
        }
    }
    
}
