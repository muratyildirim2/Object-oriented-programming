
public class Main {
    
    public static void main(String[] args) {
        
 pcmuhendisi muhendis1 = new pcmuhendisi(false, false);
 System.out.println("\n********************************** BİLGİSAYAR MÜHENDİSİ   **************************************\n");

 muhendis1.adli_sicil_sorgula();
 muhendis1.askerlik_durumu_sorgula();
   System.out.println(muhendis1.mezuniyet_ortalamsi(3.63));

   String [] pcmühendisi_tecrübe ={"Havelsan","Baykar","Aurora"};
   muhendis1.is_tecrubesi(pcmühendisi_tecrübe);


System.out.println("\n********************************** MAKİNE MÜHENDİSİ   **************************************\n");
   makinemuhendisi muhendis2 = new makinemuhendisi(true, false);
   String [] makinemühendisi_tecrübe ={"Havelsan","Pi Makina","Roketsan"};
   String [] makinemühendisi_referans ={"Ahmet İlhan","Semih Yılmaz"};


   muhendis2.adli_sicil_sorgula();
   muhendis2.askerlik_durumu_sorgula();
   muhendis2.is_tecrubesi(makinemühendisi_tecrübe);
   muhendis2.referanslar(makinemühendisi_referans);
   muhendis2.mezuniyet_ortalamsi(2.99);

    }
    
}
