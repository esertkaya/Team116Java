package day24_inheritance;

public class yeniDersNotu {
    /*
      1- Inheritance :Kalitim==> Bir class'in baska bir class'i parent edinerek
         parent class'daki tum class uyelerini (access modifier'a uygun olarak)
         otomatik olarak sahiplenmesi icin yapilan java konseptidir
      2- Inheritance'i yogun olarak 2 durumda kullaniriz.
         -Bir uygulamanin tasarim asamasinda ortak opzelliklere sahip class'lari
         parent class'lar altinda toplayarak bazi method ve variable'lari tekrar
         tekrar olusturmaktan kurtuluruz.
         -Devam eden bir projede yeni olusturacagimiz bir class'in baska bir class'taki
         tum method ve variable'lari kullanmasi gerekiyorsa tum method ve variable'lari
         yeniden olusturmak yerine yeni olusturulan class'i istenen class'a child yapariz
      3- Java'da parent class'lar child edinmez, child class'lar extends keyword ile parent edinirler.

      4- Access modifier'lar acisindan dusunursek inheritance'a uygun access modifier protected'dir
         Cunku protected olarak belirlenen class uyeleri proje kapsamindaki tum chil class'lardan
         kullanilabilir.
         *public yaparsak yine kullanilabilir ama child class'lara ozel olmaz, herkes kullanir
         *default yaparsak, sadece icinde bulundugu package'dan inherit edilebilir
         *private yaparsak inherit edilemez.

      5- Inheritance bize reusability, kolay maintenance ve projenin daha anlasilir olmasi gibi
         faydalar saglar
      6- Icinde bulundugumuz class'da baska bir class'dan obje olusturarak o class'daki class uyelerine
         ulasmak INHERITANCE degildir.
         Inheritance icinde bulunulan class'dan olusturulan bir objenin parent class'lardaki class uyelerine
         otomatik olarak ulasabilmesini saglar.(evde tuz yoksa babamlardan aliriz)
      7- Inheritance sayesinde baska class'a child yapilan bir class
         -oncelikle parent class'daki TUM CLASS UYELERINE sahip olur
         -istersek parent class'daki ozelliklerden bazilarini kendimize uyarlayabiliriz.
         -istersek de parent class'da olmayan yeni ozellikler ekleyebiliriz.
      8- Bir child class'da variable veya method kullandigimizda alacagi degeri bulmak icin
         oncelikle kendi class'imiza bakariz, kendi class'imizda aradigimiz variable ya da method
         yoksa, parent class(lar)'a bakariz. Eger kendi class'imizda veya parent class(lar)'da bulamazsak
         CTE olusur.

     */

    /*
      ADVANTAGES OF INHERITANCE
      Sometimes we need to repeat the code, or we need to repeat the whole class properties.
      So it helps in various ways:
         1- It saves memory space
         2- It saves time
         3- It will remove frustration
         4- It increases reliability of the code
         5- It saves the developing and testing efforts
     */
}
