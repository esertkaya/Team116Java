package day21_dateTime_varargs;

import java.time.LocalTime;
import java.time.temporal.TemporalUnit;

public class C01_localTime {

    public static void main(String[] args) {

        LocalTime saat=LocalTime.now();
        // calistigi anda sistemde var olan zamani alip saat variable'ina kaydeder
        //Kronometre gibi calismaz. sadece 9.satirin calistigi zamani kaydeder
        //Eger farkli satirlarin calisma zamanlarini gormek istersek
        //o satirlarda da yeni lokal time objeleri olusturmaliyiz

        System.out.println(saat);//10:04:55.448062800
        //zamani saat, dakika, saniye ve nano saniye olarak yazdirir

        System.out.println(saat.getNano());
        System.out.println(saat.getSecond());
        //get methodlari bize saatin istedigimiz bolumunu getirir

        System.out.println(saat.withHour(14));//14:08:30.159323600
        System.out.println(saat.withHour(11).withSecond(0).withNano(0));//11:10
        // with methodlari saatin istedigimiz bolumunu istedigimiz yeni bir deger ile
        //degistirerek zamani verir

        System.out.println(saat.plusHours(100));//14:12:50.071056300
        System.out.println(saat.plusMinutes(10000));//08:53:36.655665500
        System.out.println(saat.minusHours(37).minusMinutes(22));//20:52:26.329111300
        //plus methodlari ve minus methodlari saati istedigimiz miktarda ileri veya geri goturur

        //Istedigimiz saat, dakika saniye ve nano saniye ile zaman variable'i olusturmak istersek

        LocalTime istenenZaman=LocalTime.of(12,23,15,10);
        System.out.println(istenenZaman);//12:23:15.000000010

        //Iki zamani birbiriyle karsilastirmak istersek
        System.out.println(istenenZaman.isAfter(saat));//true
        System.out.println(istenenZaman.isBefore(saat));//false

        System.out.println(saat.compareTo(istenenZaman));//-1
        System.out.println(istenenZaman.compareTo(saat));//1
        //Iki zamni karsilastirir, kucukse negatif,
        //buyukse pozitif bilgi doner




    }
}
