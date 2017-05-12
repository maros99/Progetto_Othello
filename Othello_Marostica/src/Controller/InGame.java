package Controller;

import java.io.IOException;

public class InGame extends Thread {

    private Client_Socket c1, c2;
    private int ID_Partita;

    public InGame(Client_Socket c1, Client_Socket c2) {
        this.c1 = c1;
        this.c2 = c2;
        ID_Partita = (int) (Math.random() * 1000000);
    }

    public void run() {
        System.out.println("Partita in corso");
        intro(c1, c2);
        intro(c2, c1);
        Nome(c1, c2);
        Nome(c2, c1);
    }

    public void intro(Client_Socket c, Client_Socket attesa) {
        c.Send("Inserisci");
        attesa.Send("Attendi");
        try {
            String s = c.getReader().readLine();
            c.setNome(s);
            System.out.println("Nome giocatore partita " + ID_Partita + " settato:  " + s);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public void Nome(Client_Socket invio, Client_Socket nome){
        invio.Send("Nome");
        invio.Send("Partita inziata!");
        invio.Send("Sei contro: " + nome.getNome());
    }

}
