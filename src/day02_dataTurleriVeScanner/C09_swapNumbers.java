package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class C09_swapNumbers {
    public static void main(String[] args) {
         // Kullanicidan iki sayi alip ikisinin degerlerini degistirin

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen ilk sayiyi giriniz: ");
        double sayi1=scan.nextDouble();

        System.out.println("Lutfen ikinci sayiyi giriniz: ");
        double sayi2=scan.nextDouble();

        // mesela sayi1=10 , sayi2= 20 , temp=0
        double temp=0;
        temp =sayi2;
        //  sayi1=10 , sayi2= 20 , temp=20

        sayi2=sayi1;
        // mesela sayi1=10 , sayi2= 10 , temp=20

        sayi1=temp;
        // mesela sayi1=20 , sayi2= 10 , temp=0

        System.out.println("Sayilarin yerini degistirdim" +
                "\nartik sayi1: " + sayi1 + "\nsayi2: " + sayi2);





    }
}
