package day17_Constructers;

public class C08_hastaneRunner {

    public static void main(String[] args) {

        C07_Hastane per1=new C07_Hastane();
        System.out.println("isim : "+per1.personelIsmi+"Adres : "+per1.personelAdresi+
                "Telefon :"+per1.personelTelefon+"Personel Turu :"+per1.personelTuru);

        System.out.println(per1);

        C07_Hastane per2=new C07_Hastane("Selgun");
        System.out.println(per2);
    }
}
