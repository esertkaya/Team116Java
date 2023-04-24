package day10_nestedForLoops_methodOlusturmaVeKullanma;

public class C04_nestedForLoops {
    public static void main(String[] args) {

        /*
        verilen sayi icin asagidaki sekli olusturun

        int sayi=4;
        1
        1  2
        1  2  3
        1  2  3  4
         */

        int sayi=4;

        for (int i = 1; i <=sayi ; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print(j+" ");

            }
            System.out.println("");

            }

        }

    }

