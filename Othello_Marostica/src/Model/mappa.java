/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Model.Cella;

/**
 *
 * @author Paolo
 */
public class mappa {

    public Cella[][] tavola;

    public mappa() {
        tavola = new Cella[8][8];
        for (int riga = 0; riga < 8; riga++) {
            for (int colonna = 0; colonna < 8; colonna++) {
                tavola[riga][colonna] = Cella.Vuota;
            }
        }
        // impostare le prime 4 pedine
        tavola[4][3] = Cella.Nera;
        tavola[3][4] = Cella.Nera;
        tavola[3][3] = Cella.Bianco;
        tavola[4][4] = Cella.Bianco;
    }

    public boolean vuota(int riga, int colonna) {
        return tavola[riga][colonna] == Cella.Vuota;
    }
    public boolean bianco(int r, int c){
        if(r < 8 && c < 8)
   tavola[r][c] = Cella.Bianco;  
      else
            System.out.println("reinserisci i dati ");
        return true;
    }
    public boolean nero(int r, int c){
      if(r < 8 && c < 8)
          tavola[r][c] = Cella.Nera;
      else
          System.out.println("reinserisce i dati");
      return false;
    }
}
