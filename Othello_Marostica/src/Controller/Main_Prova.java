/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import lib.Time;
import controller.ClientProva;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author marostica.lorenzo
 */
public class Main_Prova {
    
    static Scanner input = new Scanner(System.in);
    static Object[] Values = {"Client", "Server"};
    private static Server_Start s;
    private static ClientProva c;
    
    public static void main(String[] args) {
        Object sel_input = JOptionPane.showInputDialog(null, "Scegli modalità", "Start", JOptionPane.INFORMATION_MESSAGE, null, Values, Values[0]);
        String in = sel_input.toString();
        switch(in){
            case "Client":
               c = new ClientProva();
            break;
            case "Sever":
                s = new Server_Start();
            break;
        }
    }
}