package day32_Maps;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static day32_Maps.MapMethodlar.numaraIleOgrenciBulma;

public class C03_Keys {

    public static void main(String[] args) {

        //Her class'da map ile islem yapabilmek icin
        //bir map olusturmak ve ogrencileri eklemek zorundayiz
        //Mapmethodlar class'inda bir map olusturup,
        // ogrenciler ekleyip bize donduren bir method olusturalim

       /* Map<Integer, String> ogrenciMap=new HashMap();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Can-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Seyma-Can-10-K-MF");
       */

        Map<Integer, String> ogrenciMap = MapMethodlar.ogrenciMapOlustur();

        //Map'deki tum key'leri yazdir

        System.out.println(ogrenciMap.keySet());

        // bu seti kaydetmek istersek

        Set<Integer> keySeti = ogrenciMap.keySet();
        //keySet'deki ogrenci numaralarini asagidaki formatta yazdirin

        //1-101
        //2-102
        //3-103

        int siraNo = 1;
        for (Integer eachKey : keySeti) {
            System.out.println(siraNo + "- " + eachKey);
            siraNo++;

        }

        //tum ogrencilerin isim ve soyisimlerini bir liste olarak yazdiran bir method olusturun

        MapMethodlar.tumOgrenciListesiYazdir(ogrenciMap);


    }

    }

