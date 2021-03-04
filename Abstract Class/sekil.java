
/**
 *
 * @author Murat Yıldırım
 */
public abstract class sekil {
    
    
    private String isim;

    public sekil (String isim) {
        this.isim = isim;
    }
    
   public void ismini_soyle()
   {
   
       System.out.println("Bu obje "+isim+" objesidir.");
   }
    
   abstract void alan_hesapla();

    public void setIsim (String isim) {
        this.isim = isim;
    }

    public String getIsim () {
        return isim;
    }
    
    
}
