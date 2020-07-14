package Restaurant;

import java.util.Scanner;

public class Fase_1 {
    public static void main(String[] args) {
        int billet_5, billet_10, billet_20, billet_50, billet_100, billet_200, billet_500, preu_Total;
        String[] plats = new String[5];
        double[] preu_Plat = new double[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            plats[i] = "plat_"+i;
            preu_Plat[i] = 10.0 * i;
        }

        System.out.println("\n\t\t\t\t\t\t ########################################################################");
        System.out.println("\t\t\t\t\t\t #################  M E N U    R E S T A U R A N T  #####################");
        System.out.println("\n\t\t\t\t\t\t\t      1.   " + plats[0] + "  .................................   " + preu_Plat[0] );
        System.out.println("\n\t\t\t\t\t\t\t      2.   " + plats[1] + "  .................................   " + preu_Plat[1] );
        System.out.println("\n\t\t\t\t\t\t\t      3.   " + plats[2] + "  .................................   " + preu_Plat[2] );
        System.out.println("\n\t\t\t\t\t\t\t      4.   " + plats[3] + "  .................................   " + preu_Plat[3] );
        System.out.println("\n\t\t\t\t\t\t\t      5.   " + plats[4] + "  .................................   " + preu_Plat[4] );

        System.out.print("\n\n\n\t\t\t\t\t\tTriar un plat: ");
        String opcio = sc.nextLine();

        System.out.println("\n\n\t\t\t\t\t\t\t           Demanar un altre plat ( S/N )");


    }
}
