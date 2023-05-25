package day32_Maps;

import com.sun.source.tree.IfTree;

import java.util.*;

public class MapMethodlar {


    //bu class'da static methodlar olusturalim ki
    //her yerden class ismi ile kullanabilelim.

    //map ve ogrenci numarasi verdigimizde, istenen formatta
    //isim soyisim bilgisini bize donduren bir method olusturalim


    public static String numaraIleOgrenciBulma(Map<Integer, String> ogrenciMap, int ogrenciNo) {
        // 1.adim==>Istenen numaraya ait value'yu kaydedelim
        String ogrenciValue = ogrenciMap.get(ogrenciNo);//[Ali, Can, 11, K, TM]

        //2. adim==> tek bir String olan value'yu bilgileri alabilmek icin split edelim
        String[] valueArr = ogrenciValue.split("-");

        //3.adim==> Istenen bilgileri alip istenen formatta kaydedelim
        String isim = valueArr[0];
        String soyIsim = valueArr[1];
        String formataUygunIsimSoyisim = isim.substring(0, 1).toUpperCase() +
                isim.substring(1).toLowerCase() +
                " " +
                soyIsim.substring(0, 1).toUpperCase() +
                soyIsim.substring(1).toLowerCase();
        return formataUygunIsimSoyisim;
    }

    public static Map<Integer, String> ogrenciMapOlustur() {
        Map<Integer, String> ogrenciMap = new HashMap();
        ogrenciMap.put(101, "Ali-Can-11-H-MF");
        ogrenciMap.put(102, "Veli-Cem-10-K-TM");
        ogrenciMap.put(103, "Ali-Can-11-K-TM");
        ogrenciMap.put(104, "Ayse-Can-10-H-MF");
        ogrenciMap.put(105, "Sevgi-Cem-11-M-TM");
        ogrenciMap.put(106, "Seyma-Can-10-K-MF");

        return ogrenciMap;
    }

    public static void tumOgrenciListesiYazdir(Map<Integer, String> ogrenciMap) {
        //tum ogrencilerin isim ve soyisimlerin bir liste olarak yazdirin
        //tum ogrencilere ulasabilmek icin tum ogrencilerin key'lerine ihtiyac var
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); //[101, 102, 103, 104, 105, 106]

        //tum key'leri tek tek ele alip o key'e ait isim ve soyismi yukaridaki methodu kullanarak yazdiralim

        int siraNo = 1;
        for (Integer eachKey : ogrenciKeySeti) {
            //herbir key'e ait isim soyimi yazdiralim

            System.out.println(siraNo + " " + numaraIleOgrenciBulma(ogrenciMap, eachKey));
            siraNo++;

        }


    }


    public static void istenenSiniftakiOgrencileriYazdir(Map<Integer, String> ogrenciMap, int sinif) {


        Collection<String> valueCollection = ogrenciMap.values();
        //siniflari kontrol edip istenen siniftaki ogrencileri yazdirmak icin herbir value'yu gozden gecirmeliyiz
        for (String eachValue : valueCollection) {
            //her bir value'yu split edip class bilgisini kontrol etmeliyiz

            String[] eachValueArr = eachValue.split("-");//[Ali, Can, 11, H, MF]
            if (eachValueArr[2].equals(sinif + "")) {

                int siraNo = 1;
                System.out.println(siraNo + "- " + eachValueArr[0] + " " + eachValueArr[1] + " " + eachValueArr[2]);
                siraNo++;
            }

        }
        // verilen soyisme sahip tum ogrencileri yazdirin
        // verilen sube'deki tum ogrencileri yazdirin
        // verilen sinif ve sube'deki tum ogrencileri yazdirin


    }

    public static void numaraAraligindakiOgrencileriyazdir(Map<Integer, String> ogrenciMap, int basNo, int bitNo) {
        // ogrenci numarasi verilen iki deger arasinda olan (sinir degerleri dahil)
        // tum ogrencilerin numara, isim, soyisim ve bolumlerini yazdirin
        // ogrencileri numaralarina gore kontrol edebilmek icin tum key'lere ihtiyacim var
        Set<Integer> ogrenciKeySeti = ogrenciMap.keySet(); // [101, 102, 103, 104, 105, 106]
        int siraNo = 1;
        for (Integer eachKey : ogrenciKeySeti
        ) { // 101
            if (basNo <= eachKey && eachKey <= bitNo) {
                // istenen araliktaki key'ler buraya ulasir, ornegin 103
                // burada o key'e ait isim, soyisim ve bolum'e ulasmaliyiz
                String value = ogrenciMap.get(eachKey); // Ali-Can-11-H-MF
                String[] valueArr = value.split("-"); // [Ali, Can, 11, H, MF]
                System.out.println(siraNo + "- " +
                        eachKey + " " +
                        valueArr[0] + " " +
                        valueArr[1] + " " +
                        valueArr[4]);
                siraNo++;
            }
        }

    }

    public static Map<Integer, String> numaraIleSoyisimUpdateEt(final Map<Integer, String> ogrenciMap, int ogrenciNo, String yeniSoyIsim) {
        // 102 numarali ogrencinin value'sunu kaydet  Veli-Cem-10-K-TM
        final Integer ogrNo = null;
        String value = ogrenciMap.get(ogrNo);
        // update yapabilmek icin bilgileri split etmeliyiz [Veli, Cem, 10, K, TM]
        final String[] valueArr = value.split("-");
        // bu array'de soyisim olarak yeni soyismi atayabilirim [Veli, Han, 10, K, TM]
        final String yeniSoyisim = "";
        valueArr[1] = yeniSoyisim;
        // bu array'deki guncel bilgileri value yapisina uygun olarak yeniden birlestirmeliyiz
        // Veli-Han-10-K-TM
        value = valueArr[0] + "-" + valueArr[1] + "-" + valueArr[2] + "-" + valueArr[3] + "-" + valueArr[4];
        // 102 numarali ogrenciyi yeni value'su ile map'e ekleyelim
        ogrenciMap.put(ogrNo, value);
        // key'ler unique oldugu icin
        // varolan bir elementi yeniden eklemek isterseniz
        // key varoldugu icin, eski value'yu silip, yeni value yapar
        return ogrenciMap;
    }


    public static void numaraliTumOgrenciListesiYazdir(Map<Integer, String> ogrencimap) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrencimap.entrySet();
        //[101=Ali-Can-11-H-MF, 102=Veli-Cem-10-K-TM, 103=Ali-Can-11-K-TM, 104=Ayse-Can-10-H-MF, 105=Sevgi-Cem-11-M-TM,
        // 106=Seyma-Can-10-K-MF]
        //bu sekilde map ile degil set ile ugrasmis olacagiz
        //tek bir for-each loop ile hem key'e hem de value'ye ulasabilecegiz.
        System.out.println("No   Isim    Soyisim     Sinif");
        System.out.println("________________________________");

        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti) {
            String ogrenciValue = eachEntry.getValue();//Ali-Can-11-H-MF
            String[] ogrenciValueArr = ogrenciValue.split("-");//[Ali, Can, 11, H, MF]

            System.out.println(eachEntry.getKey() + " " + ogrenciValueArr[0] + " "
                    + ogrenciValueArr[1] + " " + ogrenciValueArr[2]);


        }
        /*101=Ali-Can-11-H-MF
        102=Veli-Cem-10-K-TM
        103=Ali-Can-11-K-TM
        104=Ayse-Can-10-H-MF
        105=Sevgi-Cem-11-M-TM
        106=Seyma-Can-10-K-MF

         */

    }

    public static Map<Integer, String> yilSonuSinifArtir(Map<Integer, String> ogrenciMap) {
        // tum entry'leri ele almak icin bir entrySet olusturalim
        Set<Map.Entry<Integer, String>> ogrenciEntrySeti = ogrenciMap.entrySet();
        // ogrenciEntrySet'inde herBir entry'i ele alip
        // istenen update'i yapalim
        for (Map.Entry<Integer, String> eachEntry : ogrenciEntrySeti
        ) {
            // sinifi update edebilmek icin once value'u parcalayip
            // istenen bilgiye ulasalim,
            String eachValue = eachEntry.getValue(); // 101=Ali-Can-11-H-MF
            String[] eachValueArr = eachValue.split("-");// [Ali, Can, 11, H, MF]
            // array'de 2.index'deki sinif bilgisini inceleyip
            // gerekli update'i yapalim
            // 9-10-11 ==> bir artir, 12 ==> Mezun , Mezun ==> dokunma
            if (!eachValueArr[2].equalsIgnoreCase("Mezun")) {
                Integer sinif = Integer.parseInt(eachValueArr[2]); // 11
                if (sinif < 12) {
                    sinif++;
                    eachValueArr[2] = "" + sinif;
                } else {
                    eachValueArr[2] = "Mezun";
                }
                // [Ali, Can, 12, H, MF]
            }
            // bilgi update edildikten sonra array'de yapilan degisikligin
            // map'e islenmesi icin, herbir entry'i update edelim
            eachEntry.setValue(eachValueArr[0] + "-" + eachValueArr[1] + "-" +
                    eachValueArr[2] + "-" + eachValueArr[3] + "-" + eachValueArr[4]);
        }
        return ogrenciMap;
    }

    public static Map<Integer, String> soyisimleriBuyukHarfyap(Map<Integer, String> ogrenciMap) {
        Set<Map.Entry<Integer, String>> ogrenciEntrySet = ogrenciMap.entrySet();
        for (Map.Entry<Integer, String> each : ogrenciEntrySet
        ) {
            String eachValue = each.getValue();
            String[] eachValueArr = eachValue.split("-");

            eachValueArr[1] = eachValueArr[1].toUpperCase();
            each.setValue(eachValueArr[0] + "-" + eachValueArr[1] + "-" + eachValueArr[2]
                    + "-" + eachValueArr[3] + "-" + eachValueArr[4]);
        }
        return ogrenciMap;
    }

}
























