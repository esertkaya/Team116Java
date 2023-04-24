package day06_nestedIfElseStatements_ternaryOperators;

public class C06_ternary {
    public static void main(String[] args) {

        //Verilen sayi pozitif ise degerini 2 katina cikarin
        //Pozitif degil ise degerini 10 artirin

        int sayi=10;

        sayi=sayi>0? 2*sayi : sayi+10;
        //Ternary bize sonuc verir, bu sonucu ya direkt yazdirmaliyiz
        // ya da variable'a atamaliyiz
        System.out.println(sayi);

        // sayi cift ise 2 katini yazdirin, tek ise "sayi tek" yazdirin
        sayi++;

        System.out.println(sayi%2==0? 2*sayi : "Tek Sayi");
    }
}
