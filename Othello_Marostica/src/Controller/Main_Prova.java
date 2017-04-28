/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import controller.ClientProva;
import java.io.IOException;

/**
 *
 * @author marostica.lorenzo
 */
public class Main_Prova {

    
    public static void main(String[] args) {
        Server_Start s = new Server_Start();
        s.start();    
        ClientProva c = new ClientProva();
    }
    
}
