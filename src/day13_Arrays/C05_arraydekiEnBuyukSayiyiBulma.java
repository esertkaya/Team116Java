package day13_Arrays;

public class C05_arraydekiEnBuyukSayiyiBulma {
    public static void main(String[] args) {

        //verilen int arraydeki en buyuk sayiyi bize donduren bir method olusturun
        int[] arr = {2, 4, 6, 8, 1, 3, 8, 2,45};
        System.out.println(enBuyukSayi(arr));


    }

    public static int enBuyukSayi(int[] arr) {
        int enBuyukSayi = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > enBuyukSayi) {
                enBuyukSayi=arr[i];

            }

        }
       return enBuyukSayi;

    }
}
