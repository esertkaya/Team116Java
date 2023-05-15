package day29_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_tryCatch {
    public static void main(String[] args) {

        //Kullanicidan iki tam sayi alin
        //Kullanici tamsayi girmezse hata mesaji verip yeniden sayi isteyin
        //Ilk sayiyi ikinciye bolun
        //ve sonucun tams sayi kismini yazin

        Scanner scan = new Scanner(System.in);

        boolean sayiIste=true;
        int sayi1=0;

        while(sayiIste){
            try {
                scan=new Scanner(System.in);
                System.out.println("Lutfen bolunecek tamsayi yazin");
                sayi1 = scan.nextInt();
                sayiIste=false;


            } catch (InputMismatchException e) {
                String temp= scan.next();
                System.out.println("Tamsayi degeri girmelisiniz");
            }


        }


        sayiIste=true;
        int sayi2=0;

        while(sayiIste){
            try {
                scan=new Scanner(System.in);
                System.out.println("Lutfen bolunecek tamsayi yazin");
                sayi2 = scan.nextInt();
                sayiIste=false;


            } catch (InputMismatchException e) {
                String temp= scan.next();
                System.out.println("Tamsayi degeri girmelisiniz");
            }


        }
        System.out.println(sayi1/sayi2);



    }
}




