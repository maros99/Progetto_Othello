/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;
public class Direzione {
     public int driga;
     public int dcolonna;
     public Direzione(int r, int s){
        driga = r;
        dcolonna =s;
     }
    public String MostraDirezione(){
    if(driga == -1 && dcolonna == 0){
      return "Su";
    }
    else if(driga == 1 && dcolonna == 0)
      return "Giu";
    
    else if(driga == 0 && dcolonna == 1 )
   return "sinistra"; 
    
    else if(driga == 0 && dcolonna ==-1 )
    return "destra";
    
    else if(driga == 1 && dcolonna == -1 )
        return "basso-destra";
    else if(driga == -1 && dcolonna == -1 )
      return "alto-destra ";     
            
    else if(driga ==1 && dcolonna == 1 )
    return "alto-sinistra";
    
    else if(driga==-1 && dcolonna == 1 )
    return "basso-sinistra";    
      
    else 
           
          return "{ " + driga + ";" + dcolonna + "}";
    
    }
                }
   
     


