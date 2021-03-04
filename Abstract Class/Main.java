

/**
 *
 * @author Murat Yıldırım
 */
public class Main {
    
    public static void main (String[] args) {
        sekil sekil1;
        sekil1 = new kare("Kare2", 2);
        kare kare1 = new kare("Kare",5);
        daire daire1 = new daire("Daire",3);
         
        kare1.alan_hesapla();
        daire1.alan_hesapla();
        sekil1.alan_hesapla();
        kare1.cevre_hesapla(); // çevre hesaplamayı sekil objesiyle kullanamazdık.
                               // çünkü abstract class ta cevre hesapla fonksiyonu yok..
    
    }
    
}
