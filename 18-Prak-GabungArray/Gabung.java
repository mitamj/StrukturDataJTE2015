
import java.util.Arrays;


public class Gabung

{
   public int[]gabung ( int [] pertama, int[]kedua){
    
    int[]gabung = new int[pertama.length+kedua.length];
    
    System.arraycopy(pertama,0, gabung,0, kedua.length);
    System.arraycopy(kedua,0, gabung, pertama.length, kedua.length);
   
    return gabung;
}

}



