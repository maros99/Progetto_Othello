package lib;

public class Time { 
    
        public static void timeout(int t){ //metodo per chiamare un timeout
        long inizio, fine, punto;
	inizio = System.currentTimeMillis();
	fine = System.currentTimeMillis();
        punto = inizio;
	while((fine - inizio)/1000 < t){
            fine = System.currentTimeMillis();
            if((fine - punto)/1000 > 0.5){
		System.out.print(".");
		punto = System.currentTimeMillis();
            }
	}        
        }
}
