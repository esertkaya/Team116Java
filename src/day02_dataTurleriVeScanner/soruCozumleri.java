package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class soruCozumleri {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        float sayi1= 2.7f;
        float sayi2= 3.4f;

        float toplam=sayi1+sayi2;
        float carpim=sayi1*sayi2;

        System.out.println("Ondalik sayilarin toplami: " +toplam);
        System.out.println("Ondalik sayilarin carpimi: " +carpim);


    }
}
