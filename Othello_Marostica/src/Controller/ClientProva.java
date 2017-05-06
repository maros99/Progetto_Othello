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
public class ClientProva {

    private BufferedReader sock_in;
    private PrintWriter sock_out;
    private BufferedReader std_in;
    private String mes;

    public ClientProva() {
        try {
            Socket s = new Socket("10.1.33.9", 2250);
            sock_in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            sock_out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
            std_in = new BufferedReader(new InputStreamReader(System.in));    
                while (true) {
                    mes = sock_in.readLine();
                    switch(mes){
                        case "Inserisci":
                            System.out.println("Inserire Nome Utente");
                            sock_out.println(std_in.readLine());
                    }
                }
            }catch (IOException e) {
                System.err.print(e);
            }
    }
}
