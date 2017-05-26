package Controller;

import View.Grigliax;
import java.io.IOException;
import java.net.SocketException;

public class InGame extends Thread {

    private Client_Socket c1, c2;
    private int ID_Partita;

    /**
     * Costruttore che assegna gli oggetti passati e genera un numero random per l'ID
     * @param c1
     * @param c2
     */
    public InGame(Client_Socket c1, Client_Socket c2) {
        this.c1 = c1;
        this.c2 = c2;
        ID_Partita = (int) (Math.random() * 1000000);
    }

    @Override
    public void run() {
        System.out.println("Partita in corso");
        try{
            intro(c1, c2);
            intro(c2, c1);
            Nome(c1, c2);
            Nome(c2, c1);
        }catch(SocketException e){
            System.err.println("GIOCATORE DISCONNESSO");
            Server_Start.i--;
        }
    }

    /**
     * Metodo per gestire l'inizio 
     * @param c
     * @param attesa
     * @throws SocketException
     */
    public void intro(Client_Socket c, Client_Socket attesa) throws SocketException {
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
    
    /**
     * Metodo per iniziare la partita e scoprire il nome del proprio avversario
     * @param invio
     * @param nome
     * @throws SocketException
     */
    public void Nome(Client_Socket invio, Client_Socket nome) throws SocketException{
        invio.Send("Nome");
        invio.Send("Partita inziata!");
        invio.Send("Sei contro: " + nome.getNome());
        new Grigliax().setVisible(true); //WHY NE CREA SOLO UNA?
    }

}