
import java.util.Scanner;



/**
 *
 * @author MURAT
 */
public class Matematik {
     private double pi=Math.PI;
    public class Factorial
    {
        public void factorial()
        {
        Scanner scanner = new Scanner (System.in);
        int sayi = scanner.nextInt();
        
        int fakt=1;
        for(int i=2;i<=sayi;i++)
        {
            fakt*=i;
        }
            System.out.println(sayi +" Faktöriyel : "+fakt);
            
        }
          
    }
    
    
    public class asal
    {
    
        public boolean asal_mı(int sayi)
        {
        int i=2;
        if(sayi == 1 || sayi ==0)
            return false;
        
        if(sayi == 2)
            return true;
            
        
        
        while(i<sayi)
        {
        if(sayi%i==0)
            return false;
        
        i++;
        }
         return true;
        }
        
    }
    
    
    public class daire
    {
        public class alan
        {
            public void daire_alan(int yarıcap)
            {
                System.out.println("Dairenin Alanı :"+ pi*yarıcap*yarıcap);
            }
        
        }
    
    
    }
    
}
