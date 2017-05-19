package Model;

public class Pedinax {
    
    private boolean bianco = false;
    private boolean nero =! bianco;
    public boolean visibility = false ;
    
    /**
     * Metodo che resituisce il colore della pedina
     * @return
     */
    public boolean getColor(){
        return bianco;
    }
}