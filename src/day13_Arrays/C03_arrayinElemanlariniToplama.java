package day13_Arrays;

public class C03_arrayinElemanlariniToplama {
    public static void main(String[] args) {

        //Verilen int[]'in tum elementlerini toplayip
        // sonucu yazdiran bir method olusturun

        int[]arr={2,4,6,8,1,3,8,2,};
        elemanlarinToplaminiYazdir(arr);

    }
    public static void elemanlarinToplaminiYazdir(int[]arr){

        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            toplam+=arr[i];

        }
        System.out.println("Array'deki elementlerin toplami: "+toplam);
    }

}
