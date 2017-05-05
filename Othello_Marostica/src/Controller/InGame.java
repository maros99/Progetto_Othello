package Controller;


public class InGame extends Thread{
    
    private Client_Socket c1,c2;
    
    public InGame(Client_Socket c1, Client_Socket c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    
    public void run(){
        System.out.println("Partita in corso");
        c1.Send("Tocca a te");
        c2.Send("Stai fermo dio cane");
    }
    
}
