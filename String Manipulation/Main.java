
public class Main {
    
    public static void main(String[] args) {
        
       String b="Murat"; 
          

      System.out.println(b);
        
       System.out.println("Harf Sayısı: " + b.length());  // Length of String
        
        System.out.println("0.indeks : "+ b.charAt(0));  // 0. index
        System.out.println("2.indeks : "+ b.charAt(2));  // 2. index
        System.out.println("Son eleman : "+ b.charAt(b.length()-1)); // last index
        
      for (int i = 0; i < b.length();i++) {
            
            System.out.println(b.charAt(i));
            
        }
        System.out.println(b.startsWith("Mu"));  // True Murat starts with "Mu"
        System.out.println(b.endsWith("ya"));    // False
        
        System.out.println(b.indexOf('a'));            // indexof and lastindexof equal because string has only one 'a'
        System.out.println(b.lastIndexOf('a'));
        
       System.out.println(b.toLowerCase());   // Lower Case
        System.out.println(b.toUpperCase());   // Upper Case
        
       String a1 = "1999";
        
        int n = Integer.parseInt(a1);   // String to integer function
        
        System.out.println(n +22);
        
        int t1 = 1923;
        String c = String.valueOf(t1); // Integer to String
        
        System.out.println(c);
       
        
        String k1 = "Murat";
        String k2 = "Murat";
        
        if (k1 == k2 ) {
            System.out.println("Eşitler");
        }


        String b1 = new String("Murat");
        String b2 = new String("Murat");                       
        
        if (b1.equals(b2)) {                   // In here we have to use 'equals' keyword.
            System.out.println("Eşitler");
        }
   
        
        
        String name="Murat ";
        String surname="Yıldırım";

        System.out.println(name.concat(surname)); // concat appends a string to the end of another string
        
        
        System.out.println( surname.replace('ı', 'a')); // use 'a' instead of 'ı'
        
        
    }
    
}
