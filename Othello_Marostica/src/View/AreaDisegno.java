/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import javax.swing.JComponent;
import javax.swing.JFrame;


/**
 *
 * @author omarr
 */
public class AreaDisegno extends JComponent {
    Dimension P = new Dimension();
    int N;
    int Giocatore = 1;
    int [][] pezzo;
     Grigliax fc;
    public AreaDisegno(Grigliax f){
      fc = f;
      setSize(1053, 673);
      N = 8;
      pezzo = new int[N][N];
        for(int i=0; i<N; i++)
         for(int j=0; j< N; j++)
             pezzo[i][j] = 0;
        pezzo[3][3] = 2;
        pezzo[3][4] = 1;
        pezzo[4][3] = 1;
        pezzo[4][4] = 2;
         VerificoMosse();
            }
    
      public void VerificoMosse(){
         int i = 0; //riga
         int j = 0; // colonna
         int res1 = 0, res2 = 0;
         boolean res = false;
         while(i<N && !res){
          res = (pezzo[i][j] == 0);
          if(pezzo[i][j] == 1){
            res1++;
          }else{ res2++;
         }
          j++;
      }
       i++;
       if(!res){
    if(res1 > res2){
     System.out.println("Giocatore 1 a vinto : " + res1 + " a " + res2 + "!");
    }
    else if(res2 > res1){System.out.println("Giocatore 2 a vinto: " + res2 + "a" + res1 + "!");}
    else{System.out.println("Parità : 32 a 32");}
    System.exit(0);
       }
   i = 0;
   res1 = 0;
   res2 = 0;
   while(i < N){
       j = 0;
       while(j < N){
     if(pezzo[i][j] == 1){
       res1++;
     }
     else if(pezzo[i][j] ==2){
       res2++;
     }
     j++;
   }
   i++;
   }
}// per far capovolgere  i dischi
   public boolean Flip(int a , int b){
    boolean res = false;
    //a sinistra
    int i = a-1;
    while(i >=0 && pezzo[i][b] != 0 && pezzo[i][b] != Giocatore){
      i++;
    }
     if(i < N && i -1 != a && pezzo[i][b]==Giocatore){
        while(i != a){
          pezzo[i][b] = Giocatore;
          i--;
        }
        res = true;
     }
     //a destra
     i = a+1;
      while(i < N && i-1 != 0 && pezzo[i][b] != Giocatore){
     i++;  
   }
      if(i > N && i-1 != a && pezzo[i][b] == Giocatore){
      while(i != a){
          pezzo[i][b] = Giocatore;
          i++;
      }     
   res = true;
      }
// in alto
     while(i >= 0 && pezzo[a][i] != 0 && pezzo[a][i] != Giocatore){
     i--;
     }
     if(i >= 0 && i+1 != b && pezzo[a][i] == Giocatore){
     while(i != b){
        pezzo[a][i] = Giocatore;
        i++;
     }
     res = true;
     }
   //  in basso  
     i = b+1;
     while(i <N && pezzo[a][i] != 0 && pezzo[a][i] != Giocatore){
     i++;
     }
     if(i < N && i-1 != b && pezzo[a][i] == Giocatore){
         while(i != b){
         pezzo[a][i] = Giocatore;
        i--;
         }
         res = true;
     }
     // ----- diagonali --------
     // alto a sinistra
      i = 1;
      while(a-i >= 0 && b-1 >= 0 && pezzo[a-i][b-i] != 0 && pezzo[a-i][b-1] != Giocatore){
      i++;
      }
       if(a-1 >= 0 && b-1 >= 0 && 1 !=1 && pezzo[a-1][b-1] == Giocatore){
        while(i != 0){
           pezzo[a+1][b+1] = Giocatore;
           i--;
        }
       res = true;
       }
       
     //in basso a sinistra
   i = 1;
   while(a+i < N && b-1 >= 0 && pezzo[a+i][b+i] != 0 && pezzo[a+1][b-1] == Giocatore){
     i++;
   }
   if(a+i < N && b-1 >= 0 && 1 != 1 && pezzo[a+i][b-i] == Giocatore){
       while(i != 0){
           pezzo[a+i][b-i] = Giocatore;
       i--;
       }
       res = true;
   }
   return res;
   }
   public boolean ColpiPossibili(int i, int j){
     boolean res = false ;
     if(pezzo[i][j] == 0){
     res = Flip(i , j);
     }
     return res;
   }
   public void ClickMouse(Point m){
        P.getSize();
      int i, j;
      
      i = m.x * N / (P.width);
      j = m.y * N / P.height;
      if(ColpiPossibili(i, j)){
       pezzo[i][j] = Giocatore;
       if(Giocatore == 1){
           
          
       }
       else if (Giocatore == 2){
      
       }
   }
      VerificoMosse();
      VerificoMosse();

  }
   public void MostraPedinaBianca(int i, int j, Graphics2D drawable){
     P = this.getSize();
     int x,y;
     int larg, lung;
     
     larg = (P.width) / N;
     lung = P.height / N;
     x = i  * (P.width)/N;
     y = j * P.height / N;
     
     drawable.setPaint(Color.WHITE);
     drawable.fillOval(x, y, larg, lung);
     drawable.setPaint(Color.BLACK);
     drawable.drawOval(x, y, larg, lung);
   }
      public void PedinaNera(int i, int j, Graphics2D drawable){
     P = getSize();  
     int x,y;
     int larg, lung;
     
     larg = (P.width) / N;
     lung = P.height / N;
     x = i  * P.width /N;
     y = j * P.height / N;
     
  
     drawable.fillOval(x, y, larg, lung);
      }
      public void PaintComponent(Graphics g){
      Graphics2D drawable = (Graphics2D) g;
    int width = P.getSize().width;
            int height = P.getSize().height;
// cancella tutto 
     drawable.setPaint(new Color(0,100,0));
     drawable.fillRect(0, 0,width , height);
     drawable.setPaint(Color.BLACK);
    // in quattro nella griglia
      for(int i = 0; i<=N; i++) {
        drawable.drawLine(i *width /N, 0, i*width/ N,height);
        drawable.drawLine(0, i*height/N,width,i*height/N );
      }
      
     //mostra le pedina
      for (int i =0; i < N ; i++){
   for(int j=0; j < N ; j++){
  if(pezzo[i][j] == 1){
       MostraPedinaBianca(i, j, drawable);
   }    else if (pezzo[i][j] == 2)
       PedinaNera(i, j, drawable);
   }
}
      }
}
      

