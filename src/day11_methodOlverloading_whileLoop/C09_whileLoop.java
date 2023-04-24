package day11_methodOlverloading_whileLoop;

import java.util.Scanner;

public class C09_whileLoop {
    public static void main(String[] args) {

        // Kullanicidan toplanmak uzere pozitif tam sayilar isteyin
        //Kullanici 0'a basana kadar isleme devam edin
        //Kullanici 0'a bastiginda girdigi pozitif tamsayi adedini ve toplamini yazdirin
        //Kullanici negatif sayi girerse uyari verin ve o sayiyi adete eklemeyin

        Scanner scan=new Scanner(System.in);
        int sayi=1; // 0'a basinca islem biteceginden burada sifirdan farkli deger kullanmak lazim
        int sayac=0;
        int toplam=0;

        while(sayi!=0){
            System.out.println("Toplanmak uzere pozitif tamsayi girin \nBitirmek icin 0'a basin");
            sayi=scan.nextInt();

            if (sayi>0){
                sayac++;
                toplam +=sayi;
            }else if (sayi<0){
                System.out.println("Pozitif tamsayi girmelisiniz");
            }
        }
        System.out.println("Girdiginiz " +sayac+ " adet pozitif tamsayilarin toplami " +toplam);
    }
}
