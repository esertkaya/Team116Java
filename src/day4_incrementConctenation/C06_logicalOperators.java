package day4_incrementConctenation;

public class C06_logicalOperators {
    public static void main(String[] args) {
        //Java'da karsilastirma operatorleri sadece 2 variable'i karsilastirir.

        int a=10;
        int b=20;
        int c=15;

        //Ucunun birbirine esit oldugunu kontrol edin

        System.out.println(a==b && b==c);//false

        //a sayisinin pozitif ve iki ile tam bolunebilir oldugunu kontrol edin

        System.out.println(a>0 && a%2==0);//true

        // b sayisinin 10 ile 50 arasinda oldugunu kontrol edin

        System.out.println(b>10 && b<50);

        // b sayisinin 10 ile 50 arasinda olmadigini kontrol edin

        System.out.println(b<10 || b>50);// false


    }
}
