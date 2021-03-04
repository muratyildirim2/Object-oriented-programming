
import java.util.Scanner;



/**
 *
 * @author MURAT Yıldırım
 */
public class Main {
   
    
    public static void main (String[] args) {
        
         Matematik.Factorial facto= new Matematik().new Factorial();
    
    Matematik.asal as= new Matematik().new asal();
    Matematik.daire.alan d1 = new Matematik().new daire().new alan();
    
 
    
    Scanner scanner = new Scanner(System.in);
    
        System.out.println("Bir sayı giriniz  : ");
        
        int inp= scanner.nextInt();
        
        String sonuc ;
        sonuc = (as.asal_mı(inp)) ? "Asal" : "Asal değil.";
        
        System.out.println(inp+" Sayısı "+sonuc );
        
        System.out.println("Bir sayı giriniz  : ");
        
        facto.factorial();
        
        
        System.out.println("Yarıçap Giriniz : ");
        int inp2=scanner.nextInt();
        d1.daire_alan(inp2);
        
        
       
        
        
    }
  
  
    
    
}
