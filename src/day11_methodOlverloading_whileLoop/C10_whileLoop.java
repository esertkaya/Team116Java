package day11_methodOlverloading_whileLoop;

import java.util.Scanner;

public class C10_whileLoop {
    public static void main(String[] args) {

        //Soru 5- Kullanicidan bir sayi ve hesaplamak istedigi ussunu isteyin.
        // While loop kullanarak verilen sayinin istenen ussunu hesaplayip yazdiran bir method olusturun.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");

        double sayi= scan.nextDouble();

        System.out.println("Lutfen pozitif bir tamsayi olarak istenen us degerini giriniz");
        int us= scan.nextInt();

        usHesaplaYazdir(sayi,us);
    }
    public static void usHesaplaYazdir(double sayi, int us){

        int basla=1;
        double sonuc=1;
        while (basla<us){

            sonuc*=sayi;
            basla++;
        }
        System.out.println(sayi + " uzeri " +us+ " = " +sonuc);
    }
}
