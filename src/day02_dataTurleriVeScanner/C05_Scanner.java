package day02_dataTurleriVeScanner;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini isteyip ismi buyuk harfe cevirip kaydedin.
        // Sonra kullaniciya yeni halini yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen ismini giriniz: ");
        String girilenIsim= scan.nextLine();
        // nextLine() yazilan bilginin tumunu getirir.
        // next() ise ilk space'e kadar olan kismini getirir. H Ibrahim==> H

        girilenIsim=girilenIsim.toUpperCase();
        System.out.println("Girilen ismin duzenlenmis hali : " + girilenIsim);




    }
}
