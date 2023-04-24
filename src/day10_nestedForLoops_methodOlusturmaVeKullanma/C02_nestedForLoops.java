package day10_nestedForLoops_methodOlusturmaVeKullanma;

public class C02_nestedForLoops {
    public static void main(String[] args) {

        /*
        Verilen satir ve sutun sayisina uygun olarak
        asagidaki sekli yazdirin

        ornek: satir 4 sutun 5 ise

        * * * * *
        * * * * *
        * * * * *
        * * * * *

       */

        int satirSayisi=4;
        int sutunSayisi=5;
        for (int i = 1; i <=satirSayisi ; i++) {

            for (int j = 1; j <=sutunSayisi ; j++) {
                System.out.print("* ");

            }

            System.out.println("");

        }

    }
}
