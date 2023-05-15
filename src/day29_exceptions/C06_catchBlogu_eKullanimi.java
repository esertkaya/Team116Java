package day29_exceptions;

public class C06_catchBlogu_eKullanimi {

    public static void main(String[] args) {
        int sayi1=10;
        int sayi2=0;


        try {
            System.out.println(sayi1/sayi2);
            System.out.println("Aciklama 1");
            System.out.println("Aciklama 2");
            System.out.println("Aciklama 3");



        } catch (Exception e) {

            //Burada kullanilan e, olusan exception'u icine atayabilecegimiz bir variable'dir.
            //Exception e=olusanHata seklinde bir variable olusturulmus ve deger atanmis olur
            //catch blogu icinde e icin hazirlanmis methodlar kullanilarak
            //istedigimiz sekilde hata mesajlari yazdirabilecegi gibi
            //hazir methodlari kullanmayip kendi mesajimizi da yazdirabiliriz

            /*
              Bir try blogunda sorun ile karsilasilmazsa
              kod normal olarak calismaya devam eder
              try blogundaki tum kodlar calistirilir ve catch blogu devreye girmez

              try blogunda exception olusursa exception olusan satir ile
              catch blogu arasinda kalan kodlar CALISMAZ ignore edilir
              Catch blogu devreye girer catch blogundaki kodlar calisip bitince
              kod catch blogundan sonra calismaya devam eder
             */


           // e.printStackTrace();// exception'daki tum hata mesajini yazdirir ama yoluna devam eder

            //System.out.println(e.getMessage());// / by zero

            System.out.println(e.getCause());//null


        }
        System.out.println("Catch blok sonrasi");

    }

}
