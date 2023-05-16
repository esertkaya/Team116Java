package day30_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C01_MultipleExceptions {
    public static void main(String[] args) {

        try {
            //Erisim
            FileInputStream fis=new FileInputStream("src/day29_exceptions/deneme.txt");
            //Okuma
            int k=0;
            while((k= fis.read() ) != (-1)) {
                System.out.print((char) k);
            }



        } catch (FileNotFoundException e) {//erisim
            System.out.println("Dosya yolu hatali, dosyaya erisilemedi");

        } catch (IOException e) {//okuma

            System.out.println("Dosyaya erisim ve okumayla ilgili bir hata var");
        }

        /*
           Eger parent-child iliskisi olan birden fazla exception turunu
           try catch ile handle etmek istersek;
           1-icice iki try catch blogu olusturabiliriz
           2-Eger bir try birden fazla catch blogu olusturacaksak
             once child exception icin catch blogu yazmaliyiz
             sonra parent exception icin
             Cunku parent'dan sonra child'i yazarsak
             parent'in yakalayamayip child'in yakalayacagi
             exception olmayacagindan java child exception'i
             silmemizi ister
           3-Child exception icin catch yazmadan sadece parent icin
             bir tane catch blogu yazmak da yeterli olur
         */
    }
}
