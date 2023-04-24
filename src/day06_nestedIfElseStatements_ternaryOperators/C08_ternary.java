package day06_nestedIfElseStatements_ternaryOperators;

import java.util.Scanner;

public class C08_ternary {
    public static void main(String[] args) {

        // Kullanicidan notunu alin
        //50 veya daha buyukse "Sinifi gectin"
        // 50 veya daha kucukse "Maallesef kaldin" yazalim

        Scanner scan=new Scanner(System.in);

        System.out.println("Lutfen notunuzu girin");
        double not= scan.nextDouble();

        System.out.println(not>=50 ? "Sinifi gectin" : "Maalesef kaldin");
    }
}
