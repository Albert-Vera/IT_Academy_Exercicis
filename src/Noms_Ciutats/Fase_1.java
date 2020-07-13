package Noms_Ciutats;

import java.util.Scanner;

public class Fase_1 {
    public static void main(String[] args) {
        String ciutat_1, ciutat_2, ciutat_3, ciutat_4, ciutat_5, ciutat_6;
        Scanner sc = new Scanner(System.in);

        System.out.print("Introdueix el nom de la primera ciutat: ");
        ciutat_1 = sc.nextLine();
        System.out.print("Introdueix el nom de la segona ciutat: ");
        ciutat_2 = sc.nextLine();
        System.out.print("Introdueix el nom de la tercera ciutat: ");
        ciutat_3 = sc.nextLine();
        System.out.print("Introdueix el nom de la quarta ciutat: ");
        ciutat_4 = sc.nextLine();
        System.out.print("Introdueix el nom de la cinquena ciutat: ");
        ciutat_5 = sc.nextLine();
        System.out.print("Introdueix el nom de la sisena ciutat: ");
        ciutat_6 = sc.nextLine();

        System.out.println(ciutat_1);
        System.out.println(ciutat_2);
        System.out.println(ciutat_3);
        System.out.println(ciutat_4);
        System.out.println(ciutat_5);
        System.out.println(ciutat_6);
    }
}
