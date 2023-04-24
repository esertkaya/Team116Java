package day13_Arrays;

import java.util.Arrays;

public class C02_tumElementlereErisim {
    public static void main(String[] args) {

        //Bir array'i yazdirmakl ile elementlerini yazdirmak farklidir
        //Bir arry'i yazdirmak istersek arrays class'indan toString() method'u ile yazdiririz
        //Standart olarak iki tarafinda koseli parantez olur
        //Aralarinda da space bulunur.
        //Elementleri yazdirmak istedigimizde ise loop kullaniriz.
        //ve nasil yazdiracagimiz bize bagli olur

        int[] arr={2,4,6,8,1,3,8,2};
        // bu array'i yazdiralim

        System.out.println(Arrays.toString(arr));//[2, 4, 6, 8, 1, 3, 8, 2]

        //Array'in tum elementlerini yanyana aralarinda - olacak sekilde yazdirin

        System.out.print(arr[0]+"-");
        System.out.print(arr[1]+"-");
        System.out.print(arr[2]+"-");
        System.out.print(arr[3]+"-");
        System.out.print(arr[4]+"-");
        System.out.print(arr[5]+"-");
        System.out.print(arr[6]+"-");
        System.out.print(arr[7]);
        System.out.println("");

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+"-");

        }
        System.out.print(arr[arr.length-1]);
    }
}
