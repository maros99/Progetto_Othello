package Model;
public enum Direzione {
   UP_LEFT, UP , UP_RIGHT, RIGHT, DOWN_RIGHT, DOWN, DOWN_LEFT, LEFT;
    /**
     * Costruttore
     * I parametri passati vengono assenati alle proprietà della classe 
     * @param r
     * @param c
     */

      public Pedina next(Pedina epn){
        switch(this){
            case UP_LEFT:
                return new Pedina(epn.riga -1, epn.colonna -1);
            case DOWN: 
                return new Pedina(epn.riga , epn.colonna +1);
            case RIGHT:
                return new Pedina(epn.riga , epn.colonna +1);
            case UP: 
                  return new Pedina(epn.riga , epn.colonna -1);
            case LEFT:
                return new Pedina(epn.riga -1, epn.colonna );
            case UP_RIGHT:
                return new Pedina(epn.riga +1, epn.colonna -1);
            case DOWN_LEFT:
                return new Pedina(epn.riga -1, epn.colonna +1);
            case DOWN_RIGHT:
                return new Pedina(epn.riga +1, epn.colonna +1);
              
        }
           return new Pedina(epn.riga,epn.colonna);
   }
}
/**
     * Meotodo per gesire movimento delle pedine
     * @return
     */
    /*public String MostraDirezione(){
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
}*/