package day32_Maps;

import java.util.*;

public class C01_MapOlusturma {
    public static void main(String[] args) {

        //variable olusturma;
        int sayi=5;
        String str="Java Candir";

        //coklu element barindiran collections olusturma;
        List<String> liste=new ArrayList<>();
        Set<Integer> sayiseti=new HashSet();


        //map herzaman key-value ikilisi barindirir
        //bu ozelligi sebebiyle map olustururken
        //key ve value'nun data turleri yazilmalidir

        Map<Integer, String> ogrenciMap=new HashMap();
        ogrenciMap.put(101,"Ali-Can-11-H-MF");
        ogrenciMap.put(102,"Ali-Uysal-10-K-TM");
        ogrenciMap.put(103,"Ali-Can-11-K-TM");
        ogrenciMap.put(104,"Ali-Cem-10-H-MF");
        ogrenciMap.put(105,"Ali-Can-11-M-TM");
        ogrenciMap.put(106,"Ali-Kut-10-K-MF");
        System.out.println(ogrenciMap);


        System.out.println(ogrenciMap.get(101)); //Ali-Can-11-H-MF





        //1-Once istenen ogrencinin value'sunu bulalim ve kaydedelim.

        String value103=ogrenciMap.get(103);

        //2-value ozel bir isaretle birlestirilen farkli bilgilerden olusur
        //  split("-") ile bu bilgileri bir array'e donusturup kaydedelim

        String[] valueArr=value103.split("-"); //[Ali, Can, 11, K, TM]

        //Artik istedigim bilgiye tanimli index'le ulasabilirim
        System.out.println(Arrays.toString(valueArr));
        System.out.println(valueArr[3]);

    }
}
