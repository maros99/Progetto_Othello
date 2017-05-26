package Lib;

import View.Grigliax;
import java.util.Date;

public class MyTime extends Thread {

    Date data;
     
    //costruttore
    public MyTime(){
        data = new Date();
    }
     
    // ciclo infinito di oggetti di tipo Date
     
    @Override
    public void run(){
    try{
        while(true){
            Grigliax.DisplayTimer.setText("    "+data.getHours() +" : " + data.getMinutes()+ " : " + data.getSeconds());
            data = new Date();
        }
    }catch(NullPointerException ex){
        }
    }
}
