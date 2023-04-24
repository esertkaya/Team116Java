package day16_arrayLists;

import java.util.List;

public class C03_kullanicidanAlinanIsimlerdenBelliisimleriYazdirma {
    public static void main(String[] args) {

// Kullanicidan alinan isimlerden olusan listede 3 harften fazla olan isimleri yazdirin

        List<String> yeniIsimler=C02_kullaniciListeOlusturma.kullanicidanStringAlarakListeOlusturma();

        // Listenin elemanlarina ulasmak icin bir loop
        //Listenin elemanlari eger 3 harf veya fazlaysa yazdiran kod

        for (int i = 0; i < yeniIsimler.size(); i++) {
            if (yeniIsimler.get(i).length()>=3){
                System.out.println(yeniIsimler.get(i));
            }

        }
    }
}
