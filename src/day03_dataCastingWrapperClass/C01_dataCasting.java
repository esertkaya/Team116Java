package day03_;

public class C01_dataCasting {

    public static void main(String[] args) {

        int in1=10;
        short shrt=12;
        byte byt=15;
        long lng=20;

        float flt=1.2f;
        double dbl=3.2;

        boolean bn=true;

        char chr='a';

        String str="Java Candir";


        /* Bir data turundeki variable'a baska data turunden deger atanabilir mi?
        Bazi data turleri deger olarak baska data turundeki degerleri ASLA kabul etmez.
        Sayisal deger alan primitive data turlerinde ise
        daha kapsamli olan data turundeki variable,
        daha dar kapsamli data turundeki degeri otomatik olarak kabul eder
        */


        in1=shrt;
        in1=byt;
        //in1=lng; kabul etmiyor
        //in1=dbl; kabul etmiyor
        //in1=flt; kabul etmiyor

        lng=byt;
        lng=shrt;
        lng=in1;
        //lng=flt; kabul etmiyor
        //lng=flt;kabul etmiyor






    }



}
