package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class ornekSoruCozumleri {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("Birinci sayi ile ikinci sayinin toplamini ve carpimini yazin: ");

        int sayi1=5;
        int sayi2=9;
        int toplam= sayi1+sayi2;
        int carpim= sayi1*sayi2;

        System.out.println("Sayilarin Toplami: " +toplam);
        System.out.println("Sayilarin Carpimi: " +carpim);


    }
}
