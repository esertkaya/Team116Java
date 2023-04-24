package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen adinizi, soyadinizi ve yasini giriniz: ");

        char ilkHarf= scan.nextLine().toUpperCase().charAt(0);
        String soyIsim= scan.nextLine();
        int yas= scan.nextInt();
        System.out.println("girilen bilgiler: " + ilkHarf + " "  + soyIsim +"," +  + yas);
    }
}
