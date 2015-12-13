import java.math.BigDecimal;
import java.util.Scanner;
import java.util.LinkedList;

public class LinkList {
    private Node kepala;
    
    public LinkList() {
        kepala = null;
    }
    
    public Node kepala() {
        return kepala;
    }
    
    public void tambah(BigDecimal data) {
        Node nodeBaru = new Node(data);
        
        if (kepala == null)
            kepala = nodeBaru;
        else {
 
            Node sekarang = kepala;
            while (sekarang.berikut != null)
                sekarang = sekarang.berikut;
            sekarang.berikut = nodeBaru;
        }        
    }
    public void berkas (){
       Scanner keyboard = new Scanner(System.in);
       while(true){
       String DataStr = keyboard.nextLine().trim();    
        
        try{
         String namaBerkas;
          BigDecimal Data = new BigDecimal(DataStr);
         namaBerkas.add(new BigDecimal(Data));
 
            
        }
        catch(NumberFormatException err) {
                System.out.println("Tidak Ada Berkas!");
                break;  
    
    }
    
}
}
}