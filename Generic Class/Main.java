

/**
 *
 * @author Murat Yıldırım
 */
public class Main {
    
    public static void main (String[] args) {
        
        Character [] karakter  = {'a','b','c','d','e','f'};
        Integer [] sayi = {1,2,3,4,5,6,7,8};
        Double [] kesir = {1.2,3.1,7.9,12.3,0.1};
        
        String [] string_dizi = {"Murat","Ahmet","Selim","Ali"};
        
        
        Yazdirma_sinifi<Character> yazdir_char = new Yazdirma_sinifi<Character>();
        
        Yazdirma_sinifi<Integer> yazdir_int = new Yazdirma_sinifi<Integer>();
        
        Yazdirma_sinifi<Double> yazdir_kesir = new Yazdirma_sinifi<Double>();
        
        Yazdirma_sinifi<String> yazdir_string = new Yazdirma_sinifi<String>();
        
        System.out.println("*********** Characters ************");
        yazdir_char.yazdir(karakter);
        
        System.out.println("*********** Integers ************");
        yazdir_int.yazdir(sayi);
        
        System.out.println("*********** Doubles ************");
        yazdir_kesir.yazdir(kesir);
        
        System.out.println("*********** Strings ************");
        yazdir_string.yazdir(string_dizi);
        
    }
    
}
