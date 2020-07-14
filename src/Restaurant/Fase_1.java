package Restaurant;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fase_1 {
    public static void main(String[] args) {
        int billet_5, billet_10, billet_20, billet_50, billet_100, billet_200, billet_500, preu_Total = 0;
        String[] plats = new String[6];
        String tornar_Demanar= "";
        double[] preu_Plat = new double[6];
        Scanner sc = new Scanner(System.in);
        List<String> plats_aServir = new ArrayList<>();

        for (int i = 1; i < 6; i++) {
            plats[i] = "plat_"+i;
            preu_Plat[i] = 10.0 * i;
        }

        while ( true) {
            System.out.println("\n\t\t\t\t\t\t ########################################################################");
            System.out.println("\t\t\t\t\t\t #################  M E N U    R E S T A U R A N T  #####################");
            System.out.println("\n\t\t\t\t\t\t\t      1.   " + plats[1] + "  .................................   " + preu_Plat[1]);
            System.out.println("\n\t\t\t\t\t\t\t      2.   " + plats[2] + "  .................................   " + preu_Plat[2]);
            System.out.println("\n\t\t\t\t\t\t\t      3.   " + plats[3] + "  .................................   " + preu_Plat[3]);
            System.out.println("\n\t\t\t\t\t\t\t      4.   " + plats[4] + "  .................................   " + preu_Plat[4]);
            System.out.println("\n\t\t\t\t\t\t\t      5.   " + plats[5] + "  .................................   " + preu_Plat[5]);
            System.out.print("\n\n\n\t\t\t\t\t\tTriar un plat: ");

            int opcio = opcion_Menu(sc);

            switch (opcio) {
                case 1:
                    plats_aServir.add(plats[1]);
                    preu_Total += preu_Plat[1];
                    System.out.println("Has demanat un " + plats[1] + " i el import de la teva factura puja: " + preu_Total);

                    break;
                case 2:
                    plats_aServir.add(plats[2]);
                    preu_Total += preu_Plat[2];
                    System.out.println("Has demanat un " + plats[2] + " i el import de la teva factura puja: " + preu_Total);
                    break;
                case 3:
                    plats_aServir.add(plats[3]);
                    preu_Total += preu_Plat[3];
                    System.out.println("Has demanat un " + plats[3] + " i el import de la teva factura puja: " + preu_Total);
                    break;
                case 4:
                    plats_aServir.add(plats[4]);
                    preu_Total += preu_Plat[4];
                    System.out.println("Has demanat un " + plats[4] + " i el import de la teva factura puja: " + preu_Total);
                    break;
                case 5:
                    plats_aServir.add(plats[5]);
                    preu_Total += preu_Plat[5];
                    System.out.println("Has demanat un " + plats[5] + " i el import de la teva factura puja: " + preu_Total);
                    break;
                default:
                    return;
            }
            while ( !tornar_Demanar.equalsIgnoreCase("s") && !tornar_Demanar.equalsIgnoreCase("n")) {
                System.out.print("\n\t\t\t           Demanar un altre plat ( S/N ): ");
                tornar_Demanar = sc.nextLine();
            }
            if (tornar_Demanar.equalsIgnoreCase("n")) break;
            tornar_Demanar = "";
        }
        System.out.println("\n\n\t\t ########  C O M A N D A    D E L   C L I E N T   ************");
        for ( String cosas: plats_aServir){
            System.out.println("\t\t\t\t plat: " + cosas);
        }
        System.out.println("\n\t\tPreu total: " + preu_Total);

    }

    static int opcion_Menu(Scanner sc){
        boolean repetir= true;
        String texto = "";
        int numero = 0;

        while (repetir) {
            try {
                texto = sc.nextLine();
                numero = Integer.parseInt(texto);

                if ( numero > 0 && numero < 6)  repetir = false;
                else{
                    System.out.println("\nEse valor no es válido");
                    System.out.print("\n\t\t\t\t\t\tTriar un plat: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEse valor no es válido");
                System.out.print("\n\t\t\t\t\t\tTriar un plat: ");
            }
        }
        return numero;
    }
}
