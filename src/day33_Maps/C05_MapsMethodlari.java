package day33_Maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C05_MapsMethodlari {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodlar.ogrenciMapOlustur();
        ogrenciMap.put(110,"Sevda-Fan-12-H-MF");
        ogrenciMap.put(101,"Ayse-Yan-10-M-MF");
        System.out.println(ogrenciMap);
        //map'e eleman ekler.Eklenen key zaten map'te varsa eski value'yu yeni value olarak update eder
        ogrenciMap.replace(102,"Aysegul-Man-11-M-MF");
        System.out.println(ogrenciMap);
        ogrenciMap.replace(105,"Sevgi-Cem-11-M-TM","Kubra-Can-10-L-TS");
        ogrenciMap.replace(104,"Ali-Can-11-K-TM","Hasan-Cem-11-H-MF");
        System.out.println(ogrenciMap);

        ogrenciMap.getOrDefault(105,"Bu ogrenci map'de yok");
        ogrenciMap.getOrDefault(120,"Bu ogrenci map'de yok");
        System.out.println(ogrenciMap.get(120));


        System.out.println(ogrenciMap.containsKey(105));
        System.out.println(ogrenciMap.containsValue("Ayse"));


        ogrenciMap.putIfAbsent(120,"Nurhayat-Zan-12-M-MF");
        ogrenciMap.putIfAbsent(102,"Ahmet-Yan-10-M-MF");
        System.out.println(ogrenciMap);
    }
}
