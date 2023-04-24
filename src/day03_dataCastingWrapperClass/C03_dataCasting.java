package day03_dataCastingWrapperClass;

import java.util.Scanner;

public class C03_dataCasting {
    public static void main(String[] args) {

        char ch1='a';
        char ch2='b';

        System.out.println(ch1+ch2); // 195 ASCII table

        //char data turu ASCII table'la ortak calisir. Char sadece 1 karakter icerir
        //ancak degerlerini tuttugundan matematiksel islemlerde ASCII kodlarina gore
        //islemlere dahil olur. char data turu variabella matematiksel islemlerde
        //kullanilirsa ASCII tablosundaki islemler devreye girer

        //Kullanicidan bir karakter alin
        //ASCII tablosuna gore o karakterden sonraki 3 karakteri yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz: ");
        char girilenChr= scan.next().charAt(0);

        System.out.println("Girilen karakterden sonraki 3 karakter : "
                +(char)(girilenChr+1) + " , " + (char)(girilenChr+2) + ", " + (char)(girilenChr+3) );


    }
}
