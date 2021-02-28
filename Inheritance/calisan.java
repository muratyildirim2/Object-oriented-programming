public class calisan {            //SuperClass

private String isim;
private int maas;
private String departman;

public calisan(String isim,int maas,String departman)
{
    this.isim=isim;
    this.maas=maas;
    this.departman=departman;
}


public void bilgileri_göster()
{
    System.out.println("İsim : "+this.isim);
    System.out.println("Maas : "+this.maas);
    System.out.println("Departman : "+this.departman);
}

public void departman_degistir(String yeni_departman)
{
this.departman=yeni_departman;

System.out.println("Yeni Departman : "+this.departman);
}


public String getIsim() {
    return isim;
}


public void setIsim(String isim) {
    this.isim = isim;
}


public int getMaas() {
    return maas;
}


public void setMaas(int maas) {
    this.maas = maas;
}


public String getDepartman() {
    return departman;
}


public void setDepartman(String departman) {
    this.departman = departman;
}



    
}
