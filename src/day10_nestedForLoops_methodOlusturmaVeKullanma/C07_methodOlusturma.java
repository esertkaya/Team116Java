package day10_nestedForLoops_methodOlusturmaVeKullanma;

public class C07_methodOlusturma {
    public static void main(String[] args) {

        // verilen iki sayinin toplamini yazdiran bir method olusturun

        ikiSayiTopla(5,9);
        ikiSayiTopla(7,1);
        ikiSayiTopla(67,87);





    }

    public static void ikiSayiTopla(int sayi1,int sayi2){
        /*
        public: access modifier (erisim belirleyici), simdilik hep public yapiyoruz
        static: ozel bir keyword'dur.Ileride ogrenecegiz.Simdilik hep static olacak
        void:   return type, method'un bana bir sey dondurmeyecegini, sadece yazdiracagini belirtir
        isim:   Method'un yaptigi is ile baglantili olmali
        (parametreler): Method'un yapacagi is icin bizim gondermemiz gereken degiskenler



         */
        System.out.println("Iki sayinin toplami : "+(sayi1+sayi2));
    }
}
