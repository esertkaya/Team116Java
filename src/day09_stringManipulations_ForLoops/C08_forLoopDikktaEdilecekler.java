package day09_stringManipulations_ForLoops;

public class C08_forLoopDikktaEdilecekler {
    public static void main(String[] args) {

        //Verilen ilk deger bitis sartini saglamiyorsa;

        for (int i = 10; i <0 ; i++) {
            System.out.println(i);

        }
        //kod calisir ancak ilk deger icin bile bitis sarti saglanmadigindan
        //loop body hic calismaz

        //baslangic degeri ve artis/azalis miktari ile
        //bitis sarti hic saglanamazsa

        for (int i = 10; i >=0 ; i++) {
            System.out.println(i+ " ");

        }
        //buna sonsuzluk denir. ve makinenin ramí dolana kadar kod calisir
    }
}
