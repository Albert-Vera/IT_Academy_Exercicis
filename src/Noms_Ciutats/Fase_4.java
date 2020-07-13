package Noms_Ciutats;

import java.util.Arrays;
import java.util.Scanner;

public class Fase_4 {
    public static void main(String[] args) {
        String ciutat_1, ciutat_2, ciutat_3, ciutat_4, ciutat_5, ciutat_6;
        Scanner sc = new Scanner(System.in);
        String[] array_Ciutats = new String[6];
        String[] array_Ciutats_Cambiadas = new String[6];

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

        array_Ciutats[0] = ciutat_1;
        array_Ciutats[1] = ciutat_2;
        array_Ciutats[2] = ciutat_3;
        array_Ciutats[3] = ciutat_4;
        array_Ciutats[4] = ciutat_5;
        array_Ciutats[5] = ciutat_6;

        String[] array1 = new String[ciutat_1.length()];
        String[] array2 = new String[ciutat_2.length()];
        String[] array3 = new String[ciutat_3.length()];
        String[] array4 = new String[ciutat_4.length()];
        String[] array5 = new String[ciutat_5.length()];
        String[] array6 = new String[ciutat_6.length()];


        for (int i = 0; i < ciutat_1.length(); i++) {
            array1[i] = String.valueOf(ciutat_1.charAt(i));
        }
        System.out.print(array_Ciutats[0] + ": " );
        for (int e = ciutat_1.length()-1; e >= 0 ; e--) {
            System.out.print( array1[e]);
        }
        System.out.println();
        for (int i = 0; i < ciutat_2.length(); i++) {
            array2[i] = String.valueOf(ciutat_2.charAt(i));
        }
        System.out.print(array_Ciutats[1] + ": " );
        for (int e = ciutat_2.length()-1; e >= 0 ; e--) {
            System.out.print( array2[e]);
        }
        System.out.println();

        for (int i = 0; i < ciutat_3.length(); i++) {
            array3[i] = String.valueOf(ciutat_3.charAt(i));
        }
        System.out.print(array_Ciutats[2] + ": " );
        for (int e = ciutat_3.length()-1; e >= 0 ; e--) {
            System.out.print(array3[e]);
        }
        System.out.println();

        for (int i = 0; i < ciutat_4.length(); i++) {
            array4[i] = String.valueOf(ciutat_4.charAt(i));
        }
        System.out.print(array_Ciutats[3] + ": " );
        for (int e = ciutat_4.length()-1; e >= 0 ; e--) {
            System.out.print( array4[e]);
        }
        System.out.println();

        for (int i = 0; i < ciutat_5.length(); i++) {
            array5[i] = String.valueOf(ciutat_5.charAt(i));
        }
        System.out.print(array_Ciutats[4] + ": " );
        for (int e = ciutat_5.length()-1; e >= 0 ; e--) {
            System.out.print( array5[e]);
        }
        System.out.println();

        for (int i = 0; i < ciutat_6.length(); i++) {
            array6[i] = String.valueOf(ciutat_6.charAt(i));
        }
        System.out.print(array_Ciutats[5] + ": " );
        for (int e = ciutat_6.length()-1; e >= 0 ; e--) {
            System.out.print( array6[e]);
        }
    }
}
