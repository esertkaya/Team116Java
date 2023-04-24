package day10_nestedForLoops_methodOlusturmaVeKullanma;

public class C05_nestedForLoops {
    public static void main(String[] args) {

        /*
        verilen sayi icin asagidaki sekli olusturun

        int sayi=5;

        *
        * *
        * * *
        * * * *
        * * * * *
         */

        int sayi = 5;

        for (int i = 1; i <= sayi; i++) {//outer==>satirlar
            for (int j = 0; j <= i; j++) {//inner==>sutunlar
                System.out.print("* ");
            }
            System.out.println("");


            }
        for (int a = sayi-1; a >=1 ; a--) {
            for (int b = 1; b <=a ; b++) {
                System.out.print("*"+" ");

            }
            System.out.println("");



        }
        }
    }
