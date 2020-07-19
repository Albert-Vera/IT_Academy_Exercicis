package Videos;

import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static Videos.AppMain.verificarEntradaDades;

public class Gestion_Usuarios {

    Usuari usuari;
    Date fecha = new Date();

    protected List<Usuari> insertar_Usuario(Scanner sc, List<Usuari> usuariList){
        System.out.println("\n\t\t\t\t\t\t############################################################################");
        System.out.println("\t\t\t\t\t\t#################                                           ################");
        System.out.println("\t\t\t\t\t\t#################         I N S E R T A R    U S U A R I    ################");
        System.out.println("\t\t\t\t\t\t#################                                           ################");
        System.out.println("\t\t\t\t\t\t############################################################################");
        usuari = new Usuari();
        System.out.println("Introdueix les dades: ");
        System.out.print("Nom: ");
        usuari.setNom(verificarEntradaDades("Nom: ", sc));
        System.out.print("Cognoms: ");
        usuari.setCognom(verificarEntradaDades("Cognoms: ", sc));
        System.out.print("Password: ");
        usuari.setPassword(verificarEntradaDades("Password: ", sc));
        System.out.println("Data de registre: " + fecha);
        usuari.setData_Registre(fecha);

        usuariList.add(usuari);
        return usuariList;
    }
    protected void login_Usuario(Scanner sc, List<Usuari> usuariList) {
        String nom, password, dades;

        while ( true) {
            System.out.println("\n\t\t\t\t\t\t############################################################################");
            System.out.println("\t\t\t\t\t\t#######################                             ########################");
            System.out.println("\t\t\t\t\t\t#######################       L O G I N             ########################");
            System.out.println("\t\t\t\t\t\t#######################                             ########################");
            System.out.println("\t\t\t\t\t\t############################################################################");
            System.out.print("\n\t\t\tNom: ");

            nom = verificarEntradaDades( "\n\t\t\tNom: ", sc);
            System.out.print("\n\t\t\tPassword: ");
            password = verificarEntradaDades( "\n\t\t\tPassword: ", sc);

            for (Usuari usuari : usuariList) {
                //if (nom.equalsIgnoreCase("a")) new Gestion_Videos().menu_Videos(sc, usuari); // SOLO PARA TEST
                if (usuari.getNom().equalsIgnoreCase(nom) && usuari.getPassword().equals(password)) {
                    new Gestion_Videos().menu_Videos(sc, usuari);
                }
            }
            System.out.println("L O G I N   I N C O R R E C T O");
        }
    }
}
