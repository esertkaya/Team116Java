package day02_dataTurleriVeScanner;

public class C03_namingConvention {
    public static void main(String[] args) {

        int sayi=10;
        int Sayi=20;
        int sAyi=50;
        int SAYI=45;
        String SAYi="34";
        //Variable isimleri buyuk/kucuk harf duyarlidir (case sensitive de denir)
        //Variable isimlerinde harf, rakam,_ ve $ kullanilabilir
        //bosluk veya ozel karakter kullanilmaz
        //NOT: Variable sayi ile baslamaz
         int _sayi=34; // Java kabul eder ama genel kullanim acisindan tavsiye edilmez
        int s123_abc=24; // sorun yok

        // int int=10; isim olarak java'da tanimli keywords kullanilamaz
        //String for="Java";

        //camelCase: Eger variable ismi birden fazla kelime veya bolumden olusursa
        // ilk harf kucuk, sonraki her kelimenin ilk harfi buyuk, kalanlar kucuk olur

        String isimIlkHarf= "d";
        int sinifGecmeNotu=50;

        // Variable isimleri buyuk harfle baslamamalidir.
        String Isim="Bilal"; // Isim buyuk harfle baslasa da java kabul eder ama acemicedir.

    }
}
