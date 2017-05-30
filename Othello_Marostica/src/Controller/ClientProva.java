/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import View.Grigliax;
import View.Ricerca_Utente;
import java.io.*;
import java.net.*;
import javax.swing.JOptionPane;

public class ClientProva extends Thread{

    private BufferedReader sock_in;
    private PrintWriter sock_out;
    private BufferedReader std_in;
    private String mes;
    Ricerca_Utente are;
    public int a = JOptionPane.NO_OPTION;
    private String username = "";

    /**
     * Costruttore
     * Creazione Socket con IP del server
     * Gestione con switch in base alla stringa ricevuta dal server
     */
    public ClientProva() {
        try {
            Socket s = new Socket("10.1.33.10", 2250);
            sock_in = new BufferedReader(new InputStreamReader(s.getInputStream()));
            sock_out = new PrintWriter(new OutputStreamWriter(s.getOutputStream()), true);
            std_in = new BufferedReader(new InputStreamReader(System.in));
            are = new Ricerca_Utente();
                while (true) {
                    mes = sock_in.readLine();
                    
                    switch(mes){
                        
                        case "Inserisci":
                            //Aggiunta ***MODIFICATA***
                            are.dispose();
                            setUsername();
                            sock_out.println(username);
                            //*** END ***
                        break;
                        
                        case "Attendi":
                            System.out.println("In attesa dell'avversario...");
                        break;
                        
                        case "Ricerca":
                            System.out.print("Ricerca avversario in corso");
                            
                            try{
                                are.setVisible(true);
                                
                                for(int i = 0; i < 3; i++){    
                                    System.out.print(".");
                                    this.sleep(1000);
                                }
                                
                            }catch(InterruptedException e){
                                System.err.println(e);
                            }
                            
                            System.out.println();
                        
                        break;
                        
                        case "Nome":
                            System.out.println(sock_in.readLine());
                            System.out.println(sock_in.readLine()); 
                            new Grigliax().setVisible(true);
                        case "Posizione":
                            
                    }
                }
            }catch (IOException e) {
                System.err.print(e);
            }
    }
        
    /**
     *
     * @return 
     * Metodo che crea 3 JOptionPane :inserimento stringa username, inserimento la conferma o annullamento e pop up di operazione finita
     * 
     */
    public void setUsername(){

            //se a non corrisponde al vero, allora il while continua
            while(a != JOptionPane.YES_OPTION){

                username = JOptionPane.showInputDialog ("Scegli il tuo username"); 
                // l'usernamene che viene inserito nel JOption pane non è altro che una Stringa. La possiamo salvare e passarla da qualche altra parte.
                    if(username == null || "".equals(username) ){
                        a = JOptionPane.NO_OPTION;
                        JOptionPane.showMessageDialog(null, "INSERIMENTO OBBLIGATORIO");  

                    }else{
                        a = JOptionPane.YES_OPTION;
                        a = JOptionPane.showConfirmDialog(null, "Confermi?");
                    }
                }

            JOptionPane.showMessageDialog(null, username);
            //se è stato inserito lo username correttamente, allora uscirrà questo messaggio
            
            
        }
        //METODO FINITO
}