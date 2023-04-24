package day03_dataCastingWrapperClass;

public class C05_wrapperClasses {
    public static void main(String[] args) {

        int sayi=10;

        // Primitive data turlerinin hazir metodlari YOKTUR.
        // Java primitive data turleri ile bazi metodlari kullanabilmemiz icin
        //ozel wrapper classlar olusturmus

        Integer sayiWrap=10;
        /*
           Byte
           Short
           Integer
           Long
           Float
           Double
           Character
           Boolean
           classlari primitive data turleri ile ayni degerleri alabilir.
           Ayni data turundeki primitive ve Wrapper class arasinda hicbir casting olmaksizin atama yapabilir.
         */

        sayiWrap=sayi;
        sayi=sayiWrap;

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);


    }
}
