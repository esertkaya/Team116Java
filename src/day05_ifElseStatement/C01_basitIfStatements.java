package day05_ifElseStatement;

public class C01_basitIfStatements {
    public static void main(String[] args) {

        //Bagimsiz if cumleleri kodun geri kalani ile ilgilenmez.
        //Sarta odaklanir. sart true ise body calisir
        //False ise body calismaz
        //Birden fazla bagimsiz if statement varsa
        //degerlere bagli olarak tum if body'leri calisabilecegi gibi
        //hicbir if bodysinin calismamasi da mumkundur.

        int a = 21;
        int b = -75;

        if (a > b) {
            System.out.println("a b'den buyuk");
        }
        if (a % 7 == 0) {
            System.out.println("a 7'ye tam olarak bolunur");
        }
        if (b % 5 == 0) {
            System.out.println("b 5'e tam bolunur");
        }
        if (a + b > 100) {
            System.out.println("sayilarin toplami 100'den buyuk");
        }
             /*
             Eger if sartindan sonra suslu parantez kullanmazsak
             java ilk ;'e kadar olan kismi
             if body olarak kabul eder. Sonraki satirlarla ilgilenmez

             Eger if sartini yazdigimiz parantezden hemen sonra noktali virgul yazarsak
             if statement ;'de biter
             bu sarta bagli hic kod olmaz
              */

        if (b>0) {
            System.out.println("b sifirdan buyuk");
            System.out.println("b gercekten sifirdan buyuk");
            System.out.println("Valla b sifirdan buyuk");
        }

        boolean c= a+10>b-5;
        if (c) {
            System.out.println("Ozel sart saglanamadi");
        }
        if (true){
            System.out.println("Ozel sart saglandi");

        }
    }
}


