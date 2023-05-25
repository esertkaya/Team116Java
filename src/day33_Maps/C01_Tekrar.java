package day33_Maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C01_Tekrar {
    public static void main(String[] args) {

        Map<Integer,String> ogrenciMap= MapMethodlar.ogrenciMapOlustur();

        System.out.println(ogrenciMap);

        //Tum ogrenci listesini yazdir

        MapMethodlar.tumOgrenciListesiYazdir(ogrenciMap);
        //Numarasi verilen bir ogrencinin soyismini update edin
       // MapMethodlar.numaraIleSoyisimUpdateEt(ogrenciMap,102,"Jan Jan");
        System.out.println(ogrenciMap);

        MapMethodlar.numaraAraligindakiOgrencileriyazdir(ogrenciMap,1,110);

        MapMethodlar.istenenSiniftakiOgrencileriYazdir(ogrenciMap,10);

        //Su ana kadar  bize bir map verildiginde
        //key'lere ogrenciMap.keySet() ile
        //value'lere ogrenciMap.values() ile ulasabiliyoruz.

        //Eger hem key hem de value ile islem yapmamiz gerekirse
        //mecburen key'lerin bulundugu set ve value'larin bulundugu
        //Collection objelerini beraber yonetmemiz gerekiyor

        //Java key ve value'lari birlikte barindirmasi icin
        //Entry isimli bir class olusturmustur.

        //Entry ile key ve value'yu birlikte kullanabilir,
        //entry uzerinde yapilan update'leri otomatik olarak
        //map'e isleyebiliriz.
    }
}
