package day07_switchStatements_stringManipulatin;

import java.util.Scanner;

public class ornekSoru {

    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz : ");
        String isim= scan.nextLine().toUpperCase();
        System.out.println("Lutfen soyadinizi giriniz : ");
        String soyisim= scan.nextLine().toUpperCase();
        System.out.println("Lutfen yasinizi giriniz : ");
        int yas=scan.nextInt();
        System.out.println("Adiniz : " +isim+ "\nSoyadiniz : " +soyisim+ "\nYasiniz : " +yas+
                "\nKaydiniz basariyla alinmistir");





    }
}
