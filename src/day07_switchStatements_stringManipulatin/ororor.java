package day07_switchStatements_stringManipulatin;

import java.util.Scanner;

public class ororor {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        // Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        //NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
        //Kullanici o veya O yazdiginda output Ocak olsun.
        System.out.println("Bir harf giriniz");
        char harf=scan.next().charAt(0);

        if (harf<'a' || harf>'z'){
            System.out.println("Gecersiz giris");
        }else if (harf=='o') {
            System.out.println("Ocak");
        }else if (harf=='s'){
            System.out.println("Subat");
        }else if (harf=='m'){
            System.out.println("Mart veya Mayis");
        }else if (harf=='n'){
            System.out.println("Nisan");
        }else if (harf=='h'){
            System.out.println("Haziran");
        }else if (harf=='t'){
            System.out.println("Temmuz");
        }else if (harf=='a'){
            System.out.println("Agustos veya Aralik");
        }else if (harf=='e'){
            System.out.println("Eylul veya Ekim");
        }else if (harf=='k'){
            System.out.println("Kasim");

        }else{
            System.out.println("Gecersiz giris yaptiniz");
        }

    }
}
