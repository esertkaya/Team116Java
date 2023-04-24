package day17_Constructers;

public class C05_Hastane {

    /*
    Bir class'ta gorunurde constructor yoksa
    default constructor vardir

    Default constructor parametresiz bir constructor'dir
    ve body'sinde hicbir kod bulunmaz

    default constructor asagida verilen constructor'a benzer
    C05_Hastane () {
     }

     Ancak bir constructor gorunur ise artik ona default constructor demeyiz
     parametresi yoksa ona parametresiz constructor diyebiliriz

     biz herhangi bir constructor olusturursak
     Java default constructor'i siler
     yani bir class'ta gorunur bir constructor varsa
     DEFAULT CONSTRUCTOR yoktur diyebiliriz.

     */

    C05_Hastane () {
        System.out.println("Parametresiz constructor calisti");
    }

    static String hastaneAdi="Yildiz hastanesi";
    static String hastanetelefonu="03123456789";

    String personelIsmi="isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefon="telefon belirtilmedi";
    String personelTuru="personel turu belirtilmedi";

    public int maas(){

        switch (personelTuru){
            case "Doktor":
                return 5000;
            case "Hemsire":
                return 3000;
            case "Bashemsire":
                return 4000;
            default:
                return 1900;
        }

    }
}
