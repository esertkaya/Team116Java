package day13_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {

        String[] arr1={"Ayten","Sevda","Adem"};

        //Array'i yazdirmak istersek
        //Arrays class'indan toString()methodunu kullanmaliyiz

        System.out.println(arr1);// [Ljava.lang.String;@4dd8dc3

        System.out.println(Arrays.toString(arr1));//[Ayten, Sevda, Adem]

        /*
           Koseli parantez icinde elenmentleri yazdirir.
           Elementler arasinda bir virgul ve bir space birakir.(bu standarttir)

         */

        // Bir arrayi'in uzunluguna ulasmak istersek
        // Array'de kac tane element oldugunu gosterir.
        // Method degil variable'dir, yaninda () yok
        System.out.println(arr1.length); //3 length burada variable'dir.Method degildir

        //String str="ali";
        //System.out.println(str.length());//Burada method

        int[] arr2=new int[6];

        System.out.println(Arrays.toString(arr2)); // [0, 0, 0, 0, 0, 0]
        arr2[0]=5;
        arr2[3]=9;
        arr2[4]=1;
        System.out.println(Arrays.toString(arr2)); //[5, 0, 0, 9, 1, 0]






    }
}
