

/**
 *
 * @author Murat Yıldırım
 */
public class daire extends sekil{
private int yarıcap;
    public daire (String isim,int yarıcap) {
        super(isim);
        this.yarıcap=yarıcap;
    }

    @Override
    void alan_hesapla () {
        
        System.out.println(getIsim()+" alanı "+(Math.PI)*yarıcap*yarıcap);
     }
    
}
