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

import java.io.IOException;
import java.net.ServerSocket;

public class Server_Start {

    public Server_Start() {

        try{    
            ServerSocket ss = new ServerSocket(2250);
            while (true) {
                new Server_Thread(ss.accept()).start();

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
