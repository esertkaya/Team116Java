package day16_arrayLists;

import java.util.ArrayList;
import java.util.List;

public class C06_tamBolenler {
    public static void main(String[] args) {
        //Girilen bir pozitif sayinin tam bolenlerini
        //liste olarak bize donduren bir method yaziniz

        int sayi=10;
        System.out.println(tamBolenlerListesi(sayi));


    }

    public static List<Integer> tamBolenlerListesi(Integer sayi){

        List<Integer>tamBolenlerListesi=new ArrayList<>();

        for (int i = 1; i <=sayi ; i++) {
            //Bir sayinin looptan gelen i degerine boldugumuzde kalan 0 ise;
            if (sayi%i==0){
                tamBolenlerListesi.add(i);

            }

        }

        return tamBolenlerListesi;
    }

}
