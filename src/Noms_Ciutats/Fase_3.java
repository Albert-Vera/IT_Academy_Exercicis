package Noms_Ciutats;
import java.util.Arrays;
import java.util.Scanner;

public class Fase_3 {
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
        Arrays.sort(array_Ciutats);

        for (int i = 0; i < array_Ciutats.length; i++) {
            array_Ciutats_Cambiadas[i] = array_Ciutats[i].replace('a','4');
            System.out.println(array_Ciutats_Cambiadas[i]);
        }
    }
}
