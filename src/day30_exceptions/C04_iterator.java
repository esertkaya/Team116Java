package day30_exceptions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class C04_iterator {

    public static void main(String[] args) {

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);
        sayilar.add(12);
        sayilar.add(3);
        sayilar.add(9);

        System.out.println(sayilar);//[5,12,3,9]

        //List'deki tum elementleri 2 arttirip yeni halini kaydedin

        for (int i = 0; i < sayilar.size(); i++) {
            sayilar.set(i, sayilar.get(i) + 2);

        }
        System.out.println(sayilar);// [7,14,5,11]

        /*
          Java'da farkli ozelliklere sahip birden fazla element barindirabilen
          cok sayida yapi vardir.
           Biz bugune kadar : array ve list gorduk. Sonrasinda
           1- Collections (linkedList, queue, deque,Set)
           2- maps

           Bu yapilarin hepsi index kullanmaz

         */

        //Index kullanmadan list'deki elementleri 2 arttirip yazdirin
        for (Integer eachElement : sayilar) {
            System.out.println(eachElement + 2 + " ");

        }
        System.out.println("\n+sayilar");
        for (Integer eachElement : sayilar) {
            eachElement += 2;
        }
        System.out.println(sayilar);

        Iterator itr = sayilar.iterator();//interface oldugu icin new Iterator diyemiyoruz.
       /* itr.next();
        itr.remove();
        itr.next();
        itr.remove();
        itr.next();
        itr.remove();
        itr.next();
        itr.remove();
        System.out.println(sayilar);
         */
        while (itr.hasNext()) {
            itr.next();
            itr.remove();

        }
        System.out.println(sayilar);
    }
}