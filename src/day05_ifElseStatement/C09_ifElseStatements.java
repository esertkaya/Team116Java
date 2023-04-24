package day05_ifElseStatement;

import java.util.Scanner;

public class C09_ifElseStatements {
    public static void main(String[] args) {

        //Kullanicidan bir harf isteyin
        // girilen karakter kucuk harf ise onu buyuk olarak yazdirin
        // yoksa girilen harfi yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz: ");
         char harf=scan.next().charAt(0);

         if (harf>='a' && harf<='z') {
             System.out.println("Girilen kucuk harfin yeni hali: " + Character.toUpperCase(harf));
         }else{
             System.out.println("Girilen karakter : " +harf);

         }


    }
}
