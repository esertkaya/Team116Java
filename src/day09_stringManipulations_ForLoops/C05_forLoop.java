package day09_stringManipulations_ForLoops;

public class C05_forLoop {
    public static void main(String[] args) {

        // 10 kere "hello World" yazdirin

        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");
        System.out.println("Hello World");

        System.out.println("*******************");
        String str="Hello World";
        System.out.println(str.repeat(10));

        // 1'den 100é kadar olan sayilari yazdirin
        //3 basamakli cift sayilari toplayin
        //verilen bir sayinin rakamlar toplamini bulun

        // 1'den 100é kadar(100 dahil) olan sayilari yazdirin
        for (int i = 1; i <=100 ; i++) {

            System.out.print(i + " ");

            //3 basamakli cift sayilari toplayin

            int sayilarToplami=0;
            for (int j = 100; j <1000 ; j+=2) {
                sayilarToplami+=j;
                System.out.println(sayilarToplami);

            }

        }

    }

}
