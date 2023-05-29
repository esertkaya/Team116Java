package day34_nestedMaps;

import java.util.ArrayList;
import java.util.List;

public class C02_FakliDataTurleriKullanimi {
    public static void main(String[] args) {

        List<String> ogrenciList = new ArrayList<>();
        ogrenciList.add("Sevda");
        //ogrenciList.add(12);
        //ogrenciList.add(true);\
        System.out.println(ogrenciList);

        //tum data turlerinde bilgiyi kabul edecek bir List olusturmak istesek

        List<Object> hersey = new ArrayList<>();
        hersey.add("Selgun");
        hersey.add(24);
        hersey.add(true);
        hersey.add('Q');

        System.out.println(hersey);


        // ogrenciList'deki ilk ogrencinin basharfini yazdirin
        System.out.println(ogrenciList.get(0).charAt(0)); // S
        // hersey'deki ilk elementin basharfini yazdirin
        System.out.println(((String) hersey.get(0)).charAt(0)); // S
        // hersey'deki 2.elementin degerinin 2 katini yazdirin
        System.out.println((Integer) hersey.get(1) * 2); // 48
        // hersey'deki 3.element true ise "Merhaba", false ise "Hoscakal" yazdirin
        if ((Boolean) hersey.get(2)) {
            System.out.println("Merhaba");
        } else {
            System.out.println("Hoscakal");


        }
    }
}