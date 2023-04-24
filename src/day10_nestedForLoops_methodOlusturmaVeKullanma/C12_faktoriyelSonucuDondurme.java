package day10_nestedForLoops_methodOlusturmaVeKullanma;

public class C12_faktoriyelSonucuDondurme {
    public static void main(String[] args) {
        //verilen sayinin  faktoriyel degerini hesaplayip
        //sonucu donduren bir method olusturun

        System.out.println(faktoriyelDegeriDondur(6));

        int yediFaktoriyel=faktoriyelDegeriDondur(7);
    }

    public static int faktoriyelDegeriDondur(int sayi) {
        int faktoriyel = 1;
        for (int i = sayi; i >= 1; i--) {
            faktoriyel *= i;

        }
        return faktoriyel;
    }
}