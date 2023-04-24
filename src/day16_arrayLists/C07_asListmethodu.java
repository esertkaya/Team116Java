package day16_arrayLists;

import java.util.Arrays;
import java.util.List;

public class C07_asListmethodu {
    public static void main(String[] args) {
        Integer[] arr={1,3,5};

        //Verilen bir arr'i liste cevirmek icin for loop olusturup liste eklemeyi tavsiye ediyoruz

        //Yine de gormek adina asList methodunu kullanalim

        List<Integer>arraydenList= Arrays.asList(arr);
        System.out.println(arraydenList);

        System.out.println("array : "+Arrays.toString(arr));
        System.out.println("Array'den List : "+arraydenList);

        //Olusturulan listeye ekleme-cikartma yapilabilmeli

        //arraydenList.add(5); List olusturuyoruz gibi ama o hala bir array
        //arraydenList.remove(1); List olusturuyoruz gibi ama o hala bir array


       // sadece array degistiriyoruz
        arr[0]=23;
        System.out.println("Array: "+Arrays.toString(arr));
        System.out.println("array'i degistirdikten sonra listin hali : "+arraydenList);

        /*
        Bir array'i listeyue cevirirken asList methodunu kullanmanin iki negatif yonu vardir:
        1-asList methodu ile olusturulan liste, esnek bir yapiya sahip degildir.Ekleme veya cikarma yapamayiz
        2-Kaynak array degistirildigi zaman, otomatik olarak bu array'den olusturulan liste de degisir
         */
    }


}
