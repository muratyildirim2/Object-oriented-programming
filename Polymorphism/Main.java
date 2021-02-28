class Hayvan {
    private String isim;

    public Hayvan(String isim) {   
        this.isim = isim;
    }
    public String getIsim() {
        return isim;
    }
    public void setIsim(String isim) {
        this.isim = isim;
    }
    public String konus() {
        
        return "Hayvan konuşuyor...";
    }
}
class Kedi extends Hayvan {                                                               
    public Kedi(String isim) {
        super(isim);
    }
    @Override
    public String konus() {                                  
        return this.getIsim() + " miyavlıyor...";
    }
}
class Kopek extends Hayvan {

    public Kopek(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " havlıyor...";
        
    }

}
class At extends Hayvan {

    public At(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " kişniyor...";
        
    }   
}
class Kus extends Hayvan {

    public Kus(String isim) {
        super(isim);
    }

    @Override
    public String konus() {
        return this.getIsim() + " ötüyor...";
        
    }
    
    
}
public class Main {
    
 
    public static void main(String[] args) {
        
  
       
       Hayvan kopek = new Kopek("Karabaş");
       Hayvan kedi = new Kedi("Floki");
       Hayvan at = new At("Canbaz");
       Hayvan kus1 = new Kus("Şerif");   //Bu kısımda Kuşu Hayvan Class'ını olarak tanımladık. 
       Kus kus2 = new Kus("Mızmız");     //Bu kısımda Kuşu Kuş Class'ını kullanarak tanımladık.
       
       System.out.println(kopek.konus());  
       
       System.out.println(kedi.konus());
       
       System.out.println(at.konus());
       
       System.out.println(kus1.konus());

       System.out.println(kus2.konus());

        
       
        
    }
}
