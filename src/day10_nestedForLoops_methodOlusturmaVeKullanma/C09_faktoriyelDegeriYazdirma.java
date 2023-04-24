package day10_nestedForLoops_methodOlusturmaVeKullanma;

public class C09_faktoriyelDegeriYazdirma {
    public static void main(String[] args) {

        //verdigimiz bir sayinin faktoriyel degerini yazdiran
        //bir method olusturun
       faktoriyelDegeriYazdir(5);
       faktoriyelDegeriYazdir(7);

    }

    public static void faktoriyelDegeriYazdir(int sayi){

        int faktoriyel=1;
        for (int i = sayi; i >=1 ; i--) {
            faktoriyel*=i;

        }
        System.out.println(sayi+"! = "+faktoriyel);

        C09_faktoriyelDegeriYazdirma.faktoriyelDegeriYazdir(5);
    }
}
