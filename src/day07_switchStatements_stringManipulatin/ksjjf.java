package day07_switchStatements_stringManipulatin;

import java.util.Scanner;

public class ksjjf {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        //Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin”
        //yazdirin, yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin

        System.out.println("Lutfen yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println("Lutfen cinsiyetinizi E veya K olarak giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);

        if (yas<10 & cinsiyet=='K'|| yas>85 & cinsiyet=='E') {
            System.out.println("Gecersiz giris yaptiniz");
        }else if (yas>60 & cinsiyet=='K') {
            System.out.println("Emekli olabilirsin");
        }else if (yas<65 & cinsiyet=='K'){
            System.out.println("Emekli olabilmek icin " +(60-yas)+ " yil daha calismaniz lazim");
        }else if (yas>65 & cinsiyet=='E'){
            System.out.println("Emekli olabilirsin");
        }else if (yas>65 & cinsiyet=='E'){
            System.out.println("Emekli olabilirsin");
        }else if (yas<65 & cinsiyet=='E'){
            System.out.println("Emekli olabilmek icin " +(65-yas)+ " yil daha calismaniz lazim");
        }else{
            System.out.println("Gecersiz giris yaptiniz");
        }
    }
}
