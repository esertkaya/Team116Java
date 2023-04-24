package day10_nestedForLoops_methodOlusturmaVeKullanma;

public class C03_nestedForLoops {
    public static void main(String[] args) {

        /*
        Verilen bir sayi icin asgidaki tabloyu olusturun

        ornek: sayi=3

        1*1  1*2  1*3
        2*1  2*2  2*3
        3*1  3*2  3*3
         */

        int sayi=8;

        for (int i = 1; i <=sayi ; i++) { //disaridaki loop (outer loop) satirlari kontrol eder

            for (int j = 1; j <=sayi; j++) {//icerideki loop (inner loop) sutunlari kontrol eder

                System.out.print(i+"*"+j+ " ");
            }
            System.out.println("");

        }

         /*
        Verilen iki sayi icin asgidaki tabloyu olusturun

        ornek: a=3
               b=4

        1*1  1*2  1*3  1*4
        2*1  2*2  2*3  2*4
        3*1  3*2  3*3  2*4
         */

        System.out.println("=======================");

        int a=3;
        int b=4;
        for (int i = 1; i <=a ; i++) {
            for (int j = 1; j <=b ; j++) {
                System.out.print(i+"*" +j+" ");

            }
            System.out.println("");

        }

    }
}
