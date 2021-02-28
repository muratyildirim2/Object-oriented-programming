public class Yonetici extends calisan {  //SubClass

    private int sorumlu_kisi; // Ekstra Özellik
    
    public Yonetici(String isim, int maas,String departman,int sorumlu_kisi) {
      
        super(isim,maas,departman);                         // SuperClass'ın constructor'ı kullanıldı. 
                                      
        this.sorumlu_kisi = sorumlu_kisi;                   //Constructor'a ek olarak sorumlu kişi bilgisi bu şekilde alınır.
        
    }
    public void zam_yap(int zam_miktarı) {
        
        System.out.println("Çalışanlara " + zam_miktarı + " tl zam yapıldı");
    }
    public void bilgileri_göster() {
        

        super.bilgileri_göster(); //Çalışan Classına ait fonksiyon 
                                                                        //Override 
        
        System.out.println("Sorumlu Kişi Sayısı: " + this.sorumlu_kisi);
      
    }
    

    
}
