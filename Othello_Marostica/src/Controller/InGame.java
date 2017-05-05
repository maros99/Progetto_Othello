package Controller;


public class InGame extends Thread{
    
    private Client_Socket c1,c2;
    
    public InGame(Client_Socket c1, Client_Socket c2){
        this.c1 = c1;
        this.c2 = c2;
    }
    
    public void run(){
        
    }
    
}
