package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class ornek_k {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        //Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini
        //hesaplayin (kilo*10000 / (boy *boy)) vucut kitle endeksi 30’dan buyukse
        //obez, 25-30 arasi ise kilolu, 20-25 arasi ise normal, 20’den kucukse
        //zayif yazdirin.

        System.out.println("Lutfen kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("Lutfen boyunuzu metre ve santimetre cinsinden giriniz");
        double boy= scan.nextDouble();
        double vke= kilo*10000 / (boy *boy);

        if (vke>30) {
            System.out.println("obez");
        }else if (vke>=25 & vke<=30){
            System.out.println("kilolu");
        }else if (vke>=20 & vke<25){
            System.out.println("Normal");
        }else if (vke<20){
            System.out.println("Zayif");

        }else{
            System.out.println("Gecersiz giris");
        }

        {

        }
    }
}
