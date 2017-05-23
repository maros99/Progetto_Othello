/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author Paolo
 */
public class mappa{

    public Cella[][] tavola;

    /**
     * Costruttore
     * Creazione di oggetto Cella e inserimento in una matrice.
     * Inizializzazione preimpostata per 4 celle specifiche
     */
    public mappa() {
        
        tavola = new Cella[8][8];
        
        for (int riga = 0; riga < 8; riga++) {
            for (int colonna = 0; colonna < 8; colonna++) {
                tavola[riga][colonna] = Cella.Vuota;
            }
            
        }
        
        // si impostano le prime 4 pedine
        tavola[4][3] = Cella.Nera;
        tavola[3][4] = Cella.Nera;
        tavola[3][3] = Cella.Bianco;
        tavola[4][4] = Cella.Bianco;
    }

    public boolean vuota(int riga, int colonna) {
        return tavola[riga][colonna] == Cella.Vuota;
    }

    /**
     * Cambiamento stato della cella in base alla posizione, stabilita  dai parametri passati
     * @param r
     * @param c
     * @return
     */
    public boolean bianco(int r, int c) {
        if(tavola[r][c] == Cella.Bianco)
            return false;
        else
            return true;
    }
    
   /**
   * @param coordinata x La x (0-based) della cella
   * @param y coordinata y (0-based) della cella
   *  @return true se la cella descritta dalle coordinate contiene un bianco
   * false altrimenti
   */
    public boolean nero(int r, int c) {
        if(tavola[r][c] == Cella.Nera)
            return true;
        else
            return false;
    }
}