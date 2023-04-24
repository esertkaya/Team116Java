package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C03_nestedIfElse {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        //         Kadin, 60 yas ve uzeri ,
        //         Erkek 65 yas ve uzeri emekli olabilir.
        //         Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin”
        //         veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin
        // Once yas veya cinsiyetten birini ana degisken secip ona gore bir if else olusturun
        // Yas ana degisken olsun

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen Cinsiyetinizi giriniz, \nKadin icin : K, Erkek icin E");
        char cinsiyet = scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas<10 || yas>80){
            System.out.println("gecersiz yas girisi");
        }else if (yas<60){
            if (cinsiyet !='E' && cinsiyet !='K'){
                System.out.println("Cinsiyet girisi hatali");
            }else if (cinsiyet=='K'){
                System.out.println("Kadin 60 yasina kadar calismalidir, daha " + (60 - yas) + " sene calismalisin");
            }else{
                System.out.println("Erkek 65 yasina kadar calismalidir, daha " + (65 - yas) + " sene calismalisin");
            }
        }else if (yas<65) {
            if (cinsiyet != 'E' && cinsiyet != 'K') {
                System.out.println("Cinsiyet girisi hatali");
            } else if (cinsiyet == 'K') {
                System.out.println("Kadin 60 yasina kadar calismalidir, daha " + (60 - yas) + " sene calismalisin");
            } else {
                System.out.println("Erkek 65 yasina kadar calismalidir, daha " + (65 - yas) + " sene calismalisin");


            }
        }else{
            if (cinsiyet !='E' && cinsiyet !='K'){
                System.out.println("Cinsiyet girisi hatali");
            }else{
                System.out.println("Emekli olabilirsin");
            }
        }
    }
}
