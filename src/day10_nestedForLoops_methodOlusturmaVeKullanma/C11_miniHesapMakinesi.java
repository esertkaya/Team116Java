package day10_nestedForLoops_methodOlusturmaVeKullanma;

public class C11_miniHesapMakinesi {
    public static void main(String[] args) {

        //kullanicinin verdigi iki sayi ve
        //sececegi isleme gore
        //sonucu bize double olarak donduren bir method olusturun
        // ornek: sayilar 3,5 islem*oldugunda method 15 dondurmeli
        miniHesapMakinesi(5, 4, '*');
        //bize sonuc donduren methodlarda, islem sonucunu gormek isterseniz
        // direkt yazdirabilir veya islem sonucunu kaydedip istedigimizde kullanabiliriz
        System.out.println(miniHesapMakinesi(7, 12, '*'));
        //islem sonucun kaydedip istedigimizde kullanabiliriz.
        double sonuc = miniHesapMakinesi(5, 4, '*');

    }




    public static double miniHesapMakinesi(int sayi1, int sayi2, char islemSembolu){
        //islem sembolu olarak +, -, *, ya da / kullanilabilsin
       double sonuc=0;

        switch(islemSembolu){
            case '+':
                sonuc=sayi1+sayi2;
                break;
            case '-':
                sonuc=sayi1-sayi2;
                break;
            case '*':
                sonuc=sayi1*sayi2;
                break;
            case '/':
                sonuc=(double)sayi1/sayi2;
                break;
            default:
                System.out.println("Islem Sembolu yanlis, sonuc 0 olarak atandi");


        }
      return sonuc;
    }
}
