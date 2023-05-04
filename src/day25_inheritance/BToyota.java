package day25_inheritance;

public class BToyota extends Araba {
    BToyota(){

        System.out.println("Toyota int yil parametreli constructor'i calistir");
    }
    BToyota(int yil) {
        this();
        System.out.println("Toyota int parametreli constructor calistir");
    }
    String uretimYeri;
    String marka="Toyota";

}
