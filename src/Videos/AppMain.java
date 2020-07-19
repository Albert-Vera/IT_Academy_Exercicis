package Videos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppMain {
    public static void main(String[] args)  {

        Scanner sc = new Scanner(System.in);
        List<Usuari> usuariList = new ArrayList<>();

        while (true) {
            System.out.println("\n\t\t\t\t\t\t############################################################################");
            System.out.println("\t\t\t\t\t\t#######################     M E N U   T U T U B O   ########################");
            System.out.println("\t\t\t\t\t\t#######################                             ########################");
            System.out.println("\t\t\t\t\t\t#######################                             ########################");
            System.out.println("\t\t\t\t\t\t#######################     1.   Login usuario      ########################");
            System.out.println("\t\t\t\t\t\t#######################     2.   Insertar usuario   ########################");
            System.out.println("\t\t\t\t\t\t#######################     3.   Salir              ########################");
            System.out.println("\t\t\t\t\t\t#######################                             ########################");
            System.out.println("\t\t\t\t\t\t############################################################################");
            System.out.print("\t\t\t\t\t\t                         Elije una opción: ");
            int opcionMenu = opcion_Menu(sc, 4);

            switch (opcionMenu) {
                case 1:
                    new Gestion_Usuarios().login_Usuario(sc, usuariList);
                    break;
                case 2:
                    usuariList = new Gestion_Usuarios().insertar_Usuario(sc, usuariList);
                    break;
                case 3: return;
                default:
                    return;
            }
        }
    }
    protected static int opcion_Menu(Scanner sc, int tamany ){
        boolean repetir= true;
        String texto = "";
        int numero = 0;

        while (repetir) {
            try {
                texto = sc.nextLine();
                numero = Integer.parseInt(texto);

                if ( numero > 0 && numero < tamany)  repetir = false;
                else{
                    System.out.println("\nEse valor no es válido");
                    System.out.print("\n\t\t\t\t\t\tEscoge una opción del menu: ");
                }
            } catch (NumberFormatException e) {
                System.out.println("\nEse valor no es válido");
                System.out.print("\n\t\t\t\t\t\tEscoge una opción del menu: ");
            }
        }
        return numero;
    }
    protected static String verificarEntradaDades( String texto, Scanner sc) {
        boolean correcto = false;
        String dades = "";
        while (!correcto) {
            dades = sc.nextLine();
            try {
                if (dades.length() == 0) {
                    throw new Exception("no no no blanco");
                }
                correcto = true;
            } catch (Exception e) {
                System.out.println("Valor Nulo no válido !");
                System.out.print(texto);
            }
        }
        return dades;
    }
}
