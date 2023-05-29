package day34_nestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C01_nestedMaps {
    public static void main(String[] args) {

//ogrenciMap.put(101, "Ali-Can-11-H-MF");
//        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
//        ogrenciMap.put(103, "Ali-Can-11-K-TM");
//        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
//        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
//        ogrenciMap.put(106, "Seyma-Can-10-K-MF");
    //ogrenciler map'e eklerken key olarak numara,value olarak tum bilgiyi girdigimizde
    //ogrenciyi eklemek tek bir satir surerken, ogrencinin bilgisine ulasmak veya update etmek cok uzun suruyor
    //eger bilgilere erisim ve update'in daha hizli yapilmasini istersek nested map kullanabiliriz
    //Ogrencileri ve bilgilerini nested map olarak girmek uzun olacaktir
    //ancak erisim ve update'in kisa olmasi icin bunu tercih edebiliriz

    //ogrenciMap={101={ogrenciBilgiMap1}, 102={ogrenciBilgiMap2}...}

       Map<Integer,Map<String,String>> ogrenciMap=new HashMap<>();

       Map<String,String> ogrenciBilgiMapi101=new HashMap<>();
    ogrenciBilgiMapi101.put("isim","Ali");
    ogrenciBilgiMapi101.put("soyisim","Can");
    ogrenciBilgiMapi101.put("sinif","11");
    ogrenciBilgiMapi101.put("sube","H");
    ogrenciBilgiMapi101.put("brans","MF");

    ogrenciMap.put(101,ogrenciBilgiMapi101);


        Map<String,String> ogrenciBilgiMapi102=new HashMap<>();
        ogrenciBilgiMapi102.put("isim","Veli");
        ogrenciBilgiMapi102.put("soyisim","Cem");
        ogrenciBilgiMapi102.put("sinif","10");
        ogrenciBilgiMapi102.put("sube","K");
        ogrenciBilgiMapi102.put("brans","TM");
        ogrenciMap.put(102,ogrenciBilgiMapi102);

        Map<String,String> ogrenciBilgiMapi103=new HashMap<>();
        ogrenciBilgiMapi103.put("isim","Ali");
        ogrenciBilgiMapi103.put("soyisim","Can");
        ogrenciBilgiMapi103.put("sinif","11");
        ogrenciBilgiMapi103.put("sube","K");
        ogrenciBilgiMapi103.put("brans","TM");
        ogrenciMap.put(103,ogrenciBilgiMapi102);

        System.out.println(ogrenciMap);

        // 101 numarali ogrencinin bilgilerini iceren map'i yazdirin

        System.out.println(ogrenciMap.get(101));

        //102 numarali ogrencinin soyismini yazdirin

        System.out.println(ogrenciMap.get(102).get("soyisim"));

        //103 numarali ogrencinin bransi

        System.out.println(ogrenciMap.get(103).get("brans"));


    }
}
