package day31_iteratorVeCollections;

import java.util.Deque;
import java.util.LinkedList;

public class C04_Deque {

    public static void main(String[] args) {
        //double ended queue
        //genel olarak queue ozelliklerini gosterir ancak bastan ve sondan
        //ekleme, cikarma gibi ozellikler olur

        Deque<String> deque=new LinkedList<>();

        deque.add("Adnan");
        deque.addLast("Sevda");
        System.out.println(deque);//[Adnan, Sevda]

        deque.addFirst("Saida");//[Saida, Adnan, Sevda]
        System.out.println(deque);

        System.out.println(deque.removeLastOccurrence("Sevda"));
        System.out.println(deque);//[Saida, Adnan]
        //tek sevda oldugu icin remove(Obj), removeFirsOccurence(Obj) veya lastOccurence(Obj) fark olmaz

        System.out.println(deque.pop());

    }
}
