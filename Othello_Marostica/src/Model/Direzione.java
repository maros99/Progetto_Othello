package Model;
public class Direzione {

    public int driga;
     public int dcolonna;
     
    /**
     * Costruttore
     * I parametri passati vengono assenati alle proprietà della classe 
     * @param r
     * @param c
     */
    public Direzione(int r, int c){
        driga = r;
        dcolonna =c;
    }
    /**
     * Meotodo per gesire movimento delle pedine
     * @return
     */
    public String MostraDirezione(){
        if(driga == -1 && dcolonna == 0){
            return "Su";
        }
        else 
            if(driga == 1 && dcolonna == 0)
                return "Giu";
    
        else 
            if(driga == 0 && dcolonna == 1 )
                return "sinistra"; 
    
        else 
            if(driga == 0 && dcolonna ==-1 )
                return "destra";
    
        else 
            if(driga == 1 && dcolonna == -1 )
                return "basso-destra";
        else 
            if(driga == -1 && dcolonna == -1 )
                return "alto-destra ";     
            
        else 
            if(driga ==1 && dcolonna == 1 )
                return "alto-sinistra";
    
        else
            if(driga==-1 && dcolonna == 1 )
                return "basso-sinistra";    
        
            else    
                return "{ " + driga + ";" + dcolonna + "}";
    }
}