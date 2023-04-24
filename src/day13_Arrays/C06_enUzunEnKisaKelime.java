package day13_Arrays;

public class C06_enUzunEnKisaKelime {
    public static void main(String[] args) {

        //verilen String bir array'de en zuun ve en kisa kelimeleri yazdiran bir method olusturun

        String[] arr={"Saida","Isa","Asil","Kubra","Elif"};
        enUzunEnKisaKelime(arr);

    }
    public static void enUzunEnKisaKelime(String[]arr){

        String enKisaEleman=arr[0];
        String enUzunEleman=arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()>enUzunEleman.length()){ //arr[i]elementi en uzun elemaninin uzunlugundan daha vuyukse
                enUzunEleman=arr[i];                    //en uzun eleman artik arr[i]elementidir
            }
            if (arr[i].length()<enKisaEleman.length()){//arr[i] elementi en kisa elemanin uzunlugundan daha kisaysa
                enKisaEleman=arr[i];                   //en kisa eleman artik arr[i] elementidir
            }


        }
        System.out.println("En Uzun Kelime : "+enUzunEleman);
        System.out.println("En kisa kelime : "+enKisaEleman);
    }
}
