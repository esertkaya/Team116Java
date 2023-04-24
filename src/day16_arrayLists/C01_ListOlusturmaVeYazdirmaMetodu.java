package day16_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C01_ListOlusturmaVeYazdirmaMetodu {
    public static void main(String[] args) {

        //olusturulan bir listeyi yazdiran method olusturma egzersizi

        List<String> isimler=new ArrayList<>();

        isimler.add("Ahmet");
        isimler.add("Murat");
        isimler.add("Muhammed");
        isimler.add("Sefa");
        isimler.add("Erhan");

        // method call:method yazdirma
        listeYazdirma(isimler);
    }
    //Sadece yazi yazdirilacaksa void return type kullanilir
    public static void listeYazdirma(List<String> isimler){
        System.out.println(isimler);


    }
}
