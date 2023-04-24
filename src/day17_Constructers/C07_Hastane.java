package day17_Constructers;

public class C07_Hastane {

    /*
        Biz gorunur bir constructor olusturdugumuzda
        java default constructor'i siler

        Biz gorunur constructor olusturmadan once
        default constructor'i kullanarak olusturulan objeler
        CTE verir

        Boyle bir soruna sebep olmamak icin
        gorunur bir constructor olusturdugumuzda
        default constructor'in islevini yapan
        parametresiz bir constructor da olustururuz.
         */

    public C07_Hastane(String isim){

        System.out.println("Isim parametreli constructor");
    }
    public C07_Hastane(){
        System.out.println("Parametresiz constructor");
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

    @Override
    public String toString() {
        return "C07_Hastane Objesi==>{" +
                "personelIsmi :'" + personelIsmi + '\'' +
                ", personelAdresi :'" + personelAdresi + '\'' +
                ", personelTelefon :'" + personelTelefon + '\'' +
                ", personelTuru :'" + personelTuru + '\'' +
                '}';

    }

}


