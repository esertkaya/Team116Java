package day32_Maps;

import java.util.HashMap;
import java.util.Map;

public class C02_DatayaErisim {
    public static void main(String[] args) {

       //Numarasi verilen ogrencinin isim ve soyismini ilk harfleri buyuk
        //sonraki harfler kucuk olacak sekilde yazdirin

        //Map'de bir bilgiye erisim birkac adim ile mumkun oldugundan
        //bu islemleri method olarak olusturup ihtiyac duyuldugunda
        //kullanmak daha kullanisli olacaktir.

        Map<Integer, String> ogrenciMap=new HashMap();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Veli-Cem-10-K-TM");
        ogrenciMap.put(103,"Ali-Can-11-K-TM");
        ogrenciMap.put(104,"Ayse-Can-10-H-MF");
        ogrenciMap.put(105,"Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106,"Seyma-Can-10-K-MF");

        //map ve ogrenci numarasi verdigimizde, istenen formatta
        //isim soyisim bilgisini bize donduren bir method olusturalim

        System.out.println(MapMethodlar.numaraIleOgrenciBulma(ogrenciMap, 103));


    }


}
