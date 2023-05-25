package day33_Maps;

import day32_Maps.MapMethodlar;

import java.util.Map;

public class C02_entrySet {
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

    public static void main(String[] args) {
        //ogrenci listesini numara-isim-soyisim-sinif seklinde yazdirin
        Map<Integer,String> ogrencimap=MapMethodlar.ogrenciMapOlustur();

        MapMethodlar.numaraliTumOgrenciListesiYazdir(ogrencimap);

    }
}
