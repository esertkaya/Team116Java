package day05_ifElseStatement;

import java.util.Scanner;

public class C02_ifStatement {
    public static void main(String[] args) {

        //Kullanicidan bir harf alin
        //Harf ile baslayan bir ay varsa yazdirin
        //Not:Buyuk harf,kucuk harf hassasiyeti olmasin
        //Kullanici o veya O yazdiginda output Ocak olsun

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yazdirmak istediginiz ayin ilk harfini giriniz : ");

        char ilkHarf = scan.next().toUpperCase().charAt(0);

        if (ilkHarf == 'o' || ilkHarf == 'O') {
            System.out.println("Ocak");
        }

        if (ilkHarf == 's') {
            System.out.println("Subat");
        }
        if (ilkHarf == 'm') System.out.println("Mart veya Mayis");
        if (ilkHarf == 'n') System.out.println("Nisan");
        if (ilkHarf == 'h') System.out.println("Haziran");
        if (ilkHarf == 't') System.out.println("Temmuz");
        if (ilkHarf == 'a') System.out.println("Agustos veya Aralik");
        if (ilkHarf == 'e') System.out.println("Eylul veya Ekim");
        if (ilkHarf == 'k') System.out.println("Kasim");
    }
}

