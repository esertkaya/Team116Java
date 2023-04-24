package day4_incrementConctenation;

public class C05_karsilastirmaOperatorleri {
    public static void main(String[] args) {

        int a=10;
        int b=20;

        //Karsilastirma operatorleri 2 variabl'i karsilastirip istenen sart saglaniyorsa TRUE
        //sart saglanmiyorsa FALSE degeri ureten operatorlerdir.


        // a b'ye esit mi?
        System.out.println(a==b); //false
        System.out.println(2*a==b);//true
        System.out.println(a==b/2);//true

        // a ile b'nin esit olmadigini kontrol edin

        System.out.println(a!=b);//true
        System.out.println(a!=b/2);// false

        // a be'den kucuk mu?
        System.out.println(a<b);//true
        System.out.println(a<b/2);//false

        // a b'den kucuk degil sartini kontrol edelim
        System.out.println(!(a<b));//false

        // a b'den kucuk veya esit mi?

        System.out.println(a<=b);//true
        System.out.println(2*a <=b);//true

        //a b'den buyuk mu?

        System.out.println(a>b);//false
        System.out.println(5*a>2*b);//true

        boolean c=2*a>=b; //true

        // a'nin 3 katinin b'den buyuk olmadigi sartini kontrol edin

        System.out.println(!(a*3>b));//false








    }
}
