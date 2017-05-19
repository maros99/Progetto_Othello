/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import controller.ClientProva;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Main_Prova {
    
    static Scanner input = new Scanner(System.in);
    static Object[] Values = {"Client", "Server"};
    private static Server_Start s;
    private static ClientProva c;
    
    /**
     *Main
     * Creazione di un JOptionPane iniziale per scegliere tra Server o Client
     * In base alla scelta viene creato l'oggetto server o l'oggetto client
     * 
     * @param args
     */
    public static void main(String[] args) {
        try{
            //new Ricerca_Utente().setVisible(true);
            Object sel_input = JOptionPane.showInputDialog(null, "Scegli modalità", "Start", JOptionPane.INFORMATION_MESSAGE, null, Values, Values[0]);
            String in = sel_input.toString();
            if(in.equals("Client")){
                c = new ClientProva();
            }else{
                s = new Server_Start();
                s.search();
            }
        }catch(NullPointerException ex){
        }
    }
}