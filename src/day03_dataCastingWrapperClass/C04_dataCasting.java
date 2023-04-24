package day03_dataCastingWrapperClass;

public class C04_dataCasting {
    public static void main(String[] args) {

        int sayi=10;
        boolean bl=true;
        char chr='K';

        // String bir ifade baska turdeki variable veya degerlerle isleme girerse
        // onlari da Stringlestirir.

        String str=sayi+"";
        System.out.println(str.charAt(0)); // 1

        str= ""+bl;
        System.out.println(str.charAt(1));// r

        str=chr+"";
        System.out.println(str.toLowerCase()); // k


    }

}
