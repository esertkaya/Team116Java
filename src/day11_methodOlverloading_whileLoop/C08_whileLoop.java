package day11_methodOlverloading_whileLoop;

public class C08_whileLoop {
    public static void main(String[] args) {

    // While loop mu for loop mu?
        // bu sorunun cevabi yapacagimiz ise bagli
        //dongu sayisi belli ise for loop kullanmak daha pratiktir
        //Ancak baslangic ve bitis degerleri verilmemisse, veya dongu sayisi belirli degilse
        //while loo daha avantajli olur


        // 1'den 100é kadar olan sayilari yanyana yazdirin

        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");

        }
        System.out.print("");

        int sayi = 1;
        while (sayi <= 100) {


            System.out.print(sayi + " ");
            sayi++;
        }
    }
}