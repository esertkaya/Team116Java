package day14_Arrays;

import java.util.Arrays;

public class C02_arraysElemanlariSagakaydirma {
    public static void main(String[] args) {


        //Soru 3- Verilen bir array’deki tum elementleri bir saga kaydirip,
        // sondaki elementi de basa tasiyacak bir method olusturun,
        // array’i yeni haliyle kaydedin.
        //Orn : input : [4,5,6,7]  array’in son hali. : [7,4,5,6]

        //1- sondaki elemani gecici bir yere kaydet
        //2-elemanlari saga kaydir
        //3-son elemani basa koy
        int[] arr = {4, 5, 6, 7};
        arr=elemanlariSagaKaydir(arr);//Methodu kullanmak icin cagirdik
        System.out.println(Arrays.toString(arr));

    }

    public static int[] elemanlariSagaKaydir(int[] arr) {
        int sonKarakter = arr[arr.length - 1];//array'in sonuncu elemanini kaydet.length kullanarak dinamiklestiririz
        for (int i = arr.length - 2; i >= 0; i--) {
            arr[i + 1] = arr[i];

        }
        arr[0] = sonKarakter;//kaydedilen sonKarakteri basa koy
        return arr;//uzerinde degisiklikler yapilan array method'u cagrildigi yere dondurulur
    }
}