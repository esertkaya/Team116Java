package day33_Maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C04_UpdateEntry {
    public static void main(String[] args) {
        //ogrenci map'indeki tum soyisimleri buyuk harfe cevirin

        Map<Integer,String > ogrenciMap = MapMethodlar.ogrenciMapOlustur();
        MapMethodlar.soyisimleriBuyukHarfyap(ogrenciMap);
        System.out.println(ogrenciMap);
    }
}
