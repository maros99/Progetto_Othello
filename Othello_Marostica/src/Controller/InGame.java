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
        intro(c1);
        intro(c2);
    }

    public void intro(Client_Socket c) {
        c.Send("Inserisci");
        try {
            String s = c.getReader().readLine();
            c.setNome(s);
            System.out.println("Nome giocatore partita " + ID_Partita + " settato:  " + s);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

}
