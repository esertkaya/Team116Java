package day27_pollymorphism_abstractClasses;

public class sonDersOzeti {

    /*
    1- Inheritance'da bir class'dan olusturulan objelerin data turu olarak o class veya parent class'lari secilebilir
       Burada amac child class'tan olusrturulan objenin data turu olarak secilen class'taki ozellikleri
       kullanabilmesidir.
    2- Bir obje olusturulurken constructor ve data turu ayni class ise objenin ozelliklerini(variable veya method)
       bulmak icino class'a bakariz, bulamazsak parent class'lara dogru yukari cikariz.
    3- Obje olusturulurken data turu ve constructor farkli ise aramaya data turu olan class'dan baslanir
       -variable'lar icin o class'dan baslanir ve ilk bulunan kullanilir
       -methodlar icin o class'dan baslanir aranan method bulunursa hemen kullanilmaz
        daha gunceli var mi diye constructor'in oldugu class'a kadar inilir
        Eger data turu olan class'da bulunamazsa data turunun parent'larina bakilir
        Orada da bulunamazsa CTE verir.(Constructor kullanilan class'da o method'un olmasi durumu degistirmez)
    4- Overriding : Parent class'da var olan bir methodun child class tarafindan update edilmesi yani
       parent class'daki methodun gecersiz kilinmasidir

     */

}
