package day25_inheritance;

public class yirmiDorduncuGunTekrari {

    /*
       1- Java multiple inheritance'i desteklemez. Bunun yerine multi level inheritance kullanilabilir
       2- Java'da parent ile child arasinda iki tur relationship vardir.
          *parent'dan child'a giderken has a relationship
          *child'dan parent'a giderken is a relationaship vardir
       3- Bir child class'da kendi class'indan obje olusturdugumuzda, sadece kendi class'indaki
          ozellikleri degil, parent class'larindaki ozelliklere de sahip olur. Biz biliyoruz ki
          objenin bir class'in ozelliklerini alabilmesi icin, o class'in constructor'i calismalidir
          child class'daki constructor calistiginda, parent class'daki constructor'larin da
          calismasi icin Java bir mekanizma olusturmustur.
          "Extends kullanmis bir class'da olusturulan her constructor'in ilk satirina bakilir,
          eger gorunur bir constroctor call yoksa java tarafindan default olarak super() konulur
          yani parent class'daki PARAMETRESIZ CONSTRUCTOR cagrilir"
     */
}
