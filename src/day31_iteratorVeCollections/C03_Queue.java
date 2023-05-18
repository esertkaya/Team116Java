package day31_iteratorVeCollections;

import java.util.LinkedList;
import java.util.Queue;

public class C03_Queue {
    public static void main(String[] args) {

        Queue<String> yemekSirasi=new LinkedList<>();
        yemekSirasi.add("Murat");
        yemekSirasi.add("Muhammet");

        //Murat ile Muhammed'in arasina bir eleman ekleyelim
        //queue ozelliginden dolayi araya eleman eklenemez

        System.out.println(yemekSirasi);//[Murat, Muhammet]
        System.out.println(yemekSirasi.remove());//Murat
        //bastakini siler ve biz dondurur
        System.out.println(yemekSirasi);//[Muhammet]

        yemekSirasi.add("Sevda");
        yemekSirasi.add("Veysel");
        yemekSirasi.add("Aysegul");
        System.out.println(yemekSirasi); //[Muhammet, Sevda, Veysel, Aysegul]

        System.out.println(yemekSirasi.poll());
        System.out.println(yemekSirasi);//[Sevda, Veysel, Aysegul]

        Queue<String> liste2=new LinkedList<>();
       // liste2.remove();//NoSuchElementException
        System.out.println(liste2.poll());//null

        System.out.println(yemekSirasi.offer("Firdevs"));
        System.out.println(yemekSirasi); //[Sevda, Veysel, Aysegul, Firdevs]
        //eger kapasite sinirlamasi yoksa add() ile ayni islevi yapar

        System.out.println(yemekSirasi.peek());//Sevda
        System.out.println(yemekSirasi);//[Sevda, Veysel, Aysegul, Firdevs]
        //bastaki elementi silmeden bize dondurur
        System.out.println(liste2.peek());//null
        //bos liste olursa null dondurur

        System.out.println(yemekSirasi.element());//Sevda
        System.out.println(yemekSirasi);//[Sevda, Veysel, Aysegul, Firdevs]
       // System.out.println(liste2.element());//NoSuchElementException
        //bos liste olursa Exception firlatir


    }
}
