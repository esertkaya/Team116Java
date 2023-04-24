package day17_Constructers;

public class C03_Hastane {

    static String hastaneAdi="Yildiz hastanesi";
    static String hastanetelefonu="03123456789";

    String personelIsmi="isim belirtilmedi";
    String personelAdresi="Adres belirtilmedi";
    String personelTelefon="telefon belirtilmedi";
    String personelTuru="personel turu belirtilmedi";

    public int maas(String personelturu){
        switch (personelturu){
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

