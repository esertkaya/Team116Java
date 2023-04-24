package day12_doWhileLoop_Scope;

import java.util.Scanner;

public class C01_whileLoop {
    public static void main(String[] args) {

        //While loop'ta kullanacagimiz variablellara bastan deger atamamiz gerekir.
        //Eger bu variabllara yanlis deger atamasi yaparsak
        //while loop body'si hic calismayabilir
        //Java bu dezavantaji ortadan kaldirmak icin do while loop olusturmustur
        //do while loo ilk kontrolu yapmadan kodu bir kez calistirir
        //sonra kontrol yapar



        //kullanicidan deger alip toplayalim.
        //kullanici 0'a bastiginda islem bitsin
        //ve toplami yazdirsin

        Scanner scanner= new Scanner(System.in);
        int sayi=0;
        int toplam=0;
        System.out.println("Lutfen toplamak icin bir sayi yazin \nBitirmek icin 0'a basin");
        sayi= scanner.nextInt();
        toplam+=sayi;
        while(sayi != 0){
            System.out.println("Lutfen toplamak icin bir sayi yazin \nBitirmek icin 0'a basin");
            sayi= scanner.nextInt();
            toplam+=sayi;
        }
        System.out.println("Girilen sayilarin toplami : " + toplam);
    }
}