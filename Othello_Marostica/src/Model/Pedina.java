/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author marostica.lorenzo
 */
public class Pedina {
    
    private boolean bianco = false;
    private boolean nero = !bianco;
    public boolean visibility = false ;
    
    public boolean getColor(){
        return bianco;
    }
    
}