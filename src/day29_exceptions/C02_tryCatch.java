package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_tryCatch {
    public static void main(String[] args) {
        //Kullanicidan iki tam sayi alip ilk sayiyi ikinciye bolun
        //ve sonucun tams sayi kismini yazin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bolecek tamsyi yazin");
        int sayi1 = 0;
        try {
            sayi1 = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Sayilar sifira bolunemez");
        }

        System.out.println("Lutfen bolunecek tam sayi yazin");
        int sayi2 = 0;
        try {
            sayi2 = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Tamsayi degeri girmelisiniz");
        }


        //Kodumuzu yazarken bir exception olusmaihtimali goruyorsak sorun cikmasi muhtemel kodumuzu
        //try-catch ile cevreleriz

        //try-catch temel uc bolumden olusuru
        //1-try blogu : exception olusmasi muhtemel kodlarin konuldugu bolum
        //2-catch (Exception e) : catch keyword ve beklenen exception turunu yazdigimiz bolum
        //3-catch blogu : Ongordufgumuz exception olustugunda calismasini istedigimiz kodlar

        //Kullanicinin yapmasi muhtemel hatalari tamamiyla ayiklamak icin
        //genis kapsamli dusunup tum ihtimalleri cozmek gerekir


        try {
            System.out.println("Iki sayinin bolme sonucu: " + sayi1 / sayi2);
        } catch (ArithmeticException e) {
            System.out.println("Lutfen tamsayi degeri giriniz");
        }


        if (sayi2 == 0) {


        } else {

        }
    }
}