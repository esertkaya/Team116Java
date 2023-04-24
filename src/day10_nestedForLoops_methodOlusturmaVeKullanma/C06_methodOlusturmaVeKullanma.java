package day10_nestedForLoops_methodOlusturmaVeKullanma;

public class C06_methodOlusturmaVeKullanma {
    public static void main(String[] args) {

        String str="Java'nin robotlari";

        str.toUpperCase();

        //eger bir method bize bir sonuc donduruyorsa methodu calistirmak sonucu gormek icin yeterli DEGILDIR!

        //Sonucu mutlaka gormek istiyorsak;
        //-ya direkt methodCall'u sout icerisinde yapariz.
        //-ya da donen bilgiyi bir variable'a kaydeder
        //kodumuzda istedigimiz zaman onu yazdirir veya kullaniriz.

        System.out.println(str.toUpperCase());//JAVA'NI ROBOTLARI

        str=str.toUpperCase();


    }
}
