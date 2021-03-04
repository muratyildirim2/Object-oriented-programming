

/**
 *
 *@author Murat Yıldırım
 */
public class kare extends sekil{

    
    private int kenar;
    public kare (String isim,int kenar) {
        super(isim);
        this.kenar=kenar;
    }

    
    
    @Override
    void alan_hesapla ()
    {
        System.out.println(getIsim() +" alanı "+(kenar*kenar));  

    }
    

    public void cevre_hesapla ()
    {
        System.out.println(getIsim() +" Çevresi "+(4*kenar));  

    }
    
    
    
}
