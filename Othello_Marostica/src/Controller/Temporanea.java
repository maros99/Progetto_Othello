package Controller;
import javax.swing.JOptionPane;

/**
 *
 * @author ELIA
 */
public class Temporanea {
     
/*
    **** DA AGGIUNGERE AL CONTROLLER QUANDO LE COSE SARANNO SISTEMATE ****
    Ciao ragassi
    Questi sono 3 option Pain per inserire lo username...
    Finché non viene inserito, ricompare il pop up, così il programma non si interrompe.
    Dobbiamo implementarlo con altre pannelli, vedremo che fare
    Intanto provate questi e ditemi, per andare vanno
*/
    public static int a = JOptionPane.NO_OPTION;
    public static String username = "";

        public static void main(String[] args) {
            Intro();
        }
 
    public static void Intro(){
        
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
}