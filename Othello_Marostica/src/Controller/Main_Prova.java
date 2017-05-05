/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import lib.Time;
import controller.ClientProva;
import java.util.Scanner;

/**
 *
 * @author marostica.lorenzo
 */
public class Main_Prova {
    
    static Scanner input = new Scanner(System.in);
    
    public static void main(String[] args) {
        String a = input.next();
        switch(a){          
            case "s":
                Server_Start s = new Server_Start();   
            break;
            case "c":
                ClientProva c = new ClientProva();
            break;
        }
    }
    
}
