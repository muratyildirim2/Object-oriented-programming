public class makinemuhendisi implements  Imuhendis {

    private boolean askerlik;
    private boolean adli_sicil;
 
 public makinemuhendisi(boolean askerlik ,boolean adli_sicil)
 {
     this.askerlik=askerlik;
     this.adli_sicil=adli_sicil;
 
 }
 
 
 
       @Override
    public void askerlik_durumu_sorgula()
     {
 
         if(askerlik)
         {
             System.out.println("Askerliğimi Yaptım.");
         }
 
         else
         {
             System.out.println("Askerliğimi Henüz Yapmadım.");           
         }
 
         
     }
     @Override
     public String mezuniyet_ortalamsi(double derece)
     {
 
       return "Ortalamam : " + derece;  
 
     }
     @Override
     public  void adli_sicil_sorgula()
     {
         
         if(adli_sicil)
         {
             System.out.println("Adli Sicil Kaydım Bulunuyor.");
         }
 
         else
         {
             System.out.println("Adli Sicil Kaydım Bulunmuyor.");           
         }
 
     }
     @Override
     public  void is_tecrubesi(String [] array)
     {
 
         System.out.println("Makine Mühendisi olarak Çalıştığım yerler şöyle : ");
                     
         for(int i=0;i<array.length;i++)
         {
             System.out.println(array[i]);
             
         }
 
 
     }

 
     public void referanslar(String [] ref)
     {

    System.out.println("Referanslarım : ");

         for ( int i=0;i<ref.length;i++)
         {
          System.out.println(ref[i]);
         }
     }     
    
}
