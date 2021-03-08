
import java.util.ArrayList;



/**
 *
 * @author Murat Yıldırım
 */
public class Main {
    
    
    
    public static void main (String[] args) {
        
        ArrayList<Integer> arraylist =  new ArrayList<>();
        
        
        for (int i=0;i<10;i++)
        {
        arraylist.add(i);          // add list 0 to 9.
        }
        
        
        System.out.println("List : "+arraylist); //print all.
        
        
        for (int i=0;i<arraylist.size();i++)
        {
            if(i%2==1)    // print odd indexes.
                System.out.println(arraylist.get(i));      
        }
        
     
      
         System.out.println("List : "+arraylist); //print all.
    
           
         if(arraylist.contains(9))
         {
             System.out.println("This ArrayList contains 9..");
         }
         
         else if(arraylist.contains(9)==false)
         {
             System.out.println("This ArrayList does not contain 9..");
         }
         
         System.out.println("Index of 9 is "+arraylist.indexOf(9));
         
         
         
         
         
            arraylist.remove(4); // remove element in index 4.Value of element equals to 4.
         
         if(arraylist.contains(4))
         {
             System.out.println("This ArrayList contains 4..");
         }
         
         else if(arraylist.contains(4)==false)
         {
             System.out.println("This ArrayList does not contain 4..");
         }
    
    
        
    
    }
    
    
    
}
