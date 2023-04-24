package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class soruCozumleri_1 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int sayi=26;
        int bolen=4;

        int bolum= sayi/bolen;
        int kalan= sayi%bolen;

        System.out.println("islem: " + sayi + "/"+bolen);
        System.out.println("bolum: " +bolum);
        System.out.println("kalan: " +kalan);
    }
}
