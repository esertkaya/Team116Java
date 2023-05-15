package day29_exceptions;

import java.util.Scanner;

public class C05_multipleExceptions {
    /*
      Eger birden fazla exception olusma ihtimali varsa bu exceptionalr arasinda parent-child iliskisi yoksa
      3 farkli yaklasim kullanabiliriz

      1-Iki farkli exception ihtimali icin 2 farkli try-catch olusuturabiliriz
      2-bir try iki catch blogu olusturabiliriz\
      3-Iki exception'i kapsayan tek bir exception varsa onu kullanarak
        bir try bir catch ile sorunu cozeriz
     */

    public static void main(String[] args) {

        //Elimizde input olarak verilmis bir string ve sayilardan olusmus bir array var

        String str="Java her seyi dusunmus";
        int [] sayilar={2,4,6,7,8,9,1,3,4,2,6,3,7,4};

        // Kullanicidan 0 veya pozitif bir tamsayi isteyin
        // verilen tamsayiyi index olarak kullanip
        // String ve Array'den o index'deki harf ve sayiyi yazdirin


        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen index olarak pozitif bir tamsayi girin");
        int index= scan.nextInt();

        //1.yontem

/*
        System.out.print("Istenen index'teki degerler : ");
        try {
            System.out.print(str.charAt(index));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("Verilen index String'in sinirlari disinda");
        }
        try {
            System.out.println(sayilar[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Verilen index array'in sinirlari disinda");
        }

 */
        //2.yontem
        //Bir try biden fazla catch oldugunda bir catch calisinca otekilere bakmaz(if -else if -else gibi)
       /* try {
            System.out.print("Istenen index'teki degerler : "+str.charAt(index)+sayilar[index]);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.print("Verilen index String'in sinirlari disinda");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Verilen index Array'in sinirlari disinda");
        }
      */
        //3.yontem
        //Bu cozumde detaya bakmadigimiz icin iki exception'i da kapsayacak genel bir aciklama yazabiliriz
        try {
            System.out.print("Istenen index'teki degerler : "+str.charAt(index)+sayilar[index]);
        } catch (RuntimeException e) {
            System.out.print("Verilen index input'un sinirlari sinirlari disinda");
        }


    }
}
