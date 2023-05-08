package day26_inheritanceDataTypeKullanimi_overriding;

public class sonDersTekrari {
    /*
      1-Inheritance : Bir class'in extends keyword kullanarak baska bir class'daki tum class uyelerini edinmesidir.
      (Access modifier'a uygun olarak)
      2 : Java'da parent'lar child edinmez, tam tersi child class'lar ozelliklerini inherit etmek istedikleri
          herhangi bir class'i parent edinebilirler.
      3 : Bir class baska bir class'i parent edindiginde;
          *parent class'daki tum ozellikleri inherit eder
          *isterse parent class'daki ozellikleri kendine uyarlayabilir
          *isterse de parent class'da olmayan yeni ozellikler ekleyebilir
      4 : Child class'dan olusturulan bir obje istenirse paren class'larla tanimlanabilir
      5 : Child class'da olusturulan bior obje parent class'daki ozelliklere sahip olur. Java'da bir class'daki
          ozelliklere sahip olmak(initialization) icin o class'daki constructor'in calismasi gerekir.
          Java bunu cozmek icin super() ozelligini kullanir. extends keyword kullanilan bir class'da olusturulan
          her constructor'in ilk satirinda constructor call vardir. Eger gorunur bir constructor call varsa o
          kullanilir, gorunur bir constructor call yoksa Java default olarak parent class'daki parametresiz
          constructor'i super() ile call eder.
     */
}
