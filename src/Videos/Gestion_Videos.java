package Videos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Videos.AppMain.verificarEntradaDades;

public class Gestion_Videos {
    List<Video> videoList = new ArrayList<>();

    protected void menu_Videos(Scanner sc, Usuari usuari) {

        while (true) {
            System.out.println("\n\t\t\t\t\t\t############################################################################");
            System.out.println("\t\t\t\t\t\t#######################                             ########################");
            System.out.println("\t\t\t\t\t\t#######################     T U S   V I D E O S     ########################");
            System.out.println("\t\t\t\t\t\t#######################      User: " + usuari.getNom() + "             ########################");
            System.out.println("\t\t\t\t\t\t#######################                             ########################");
            System.out.println("\t\t\t\t\t\t#######################       1. Ver lista          ########################");
            System.out.println("\t\t\t\t\t\t#######################       2. Añadir video       ########################");
            System.out.println("\t\t\t\t\t\t#######################       3. Añadir tag           ######################");
            System.out.println("\t\t\t\t\t\t#######################       4. Salir              ########################");
            System.out.println("\t\t\t\t\t\t#######################                             ########################");
            System.out.println("\t\t\t\t\t\t############################################################################");
            System.out.print("\t\t\t\t\t\t                         Elije una opción: ");
            int opcionMenu = AppMain.opcion_Menu(sc, 5);

            switch (opcionMenu) {
                case 1:
                    lista_videos();
                    break;
                case 2:
                    insertar_video(sc);
                    break;
                case 3:
                    anadir_Tag(sc);
                    break;

                case 4:
                    System.exit(0);
            }
        }
    }

    protected void lista_videos() {
        System.out.println("\n\t\t\t\t\t\t############################################################################");
        System.out.println("\t\t\t\t\t\t#######################                             ########################");
        System.out.println("\t\t\t\t\t\t#######################     T U S   V I D E O S     ########################");
        System.out.println("\t\t\t\t\t\t#######################                             ########################");
        System.out.println("\t\t\t\t\t\t############################################################################");
        for (Video videos : videoList) {
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t Titol: " + videos.getTitol());
            System.out.println("\t\t\t\t\t\t\t\t\t\t URL: " + videos.getUrl());

            for (String tag : videos.getTags()) {
                System.out.println("\t\t\t\t\t\t\t\t\t\t Tag: " + tag);
            }
        }
        if (videoList.size() == 0) System.out.println("No tienes videos insertados !");

    }

    protected void insertar_video(Scanner sc) {

        System.out.println("\n\t\t\t\t\t\t############################################################################");
        System.out.println("\t\t\t\t\t\t#################                                           ################");
        System.out.println("\t\t\t\t\t\t#################         I N S E R T A R    V I D E O      ################");
        System.out.println("\t\t\t\t\t\t#################                                           ################");
        System.out.println("\t\t\t\t\t\t############################################################################");


        Video video = new Video();
        boolean correcto = false;

        System.out.print("\n\t\t\tTitol: ");
        video.setTitol(verificarEntradaDades( "\n\t\t\tTitol: ", sc));

        System.out.print("\n\t\t\tUrl: ");
        video.setUrl(verificarEntradaDades("\n\t\t\tUrl: ", sc));

        System.out.print("\n\t\t\ttags: ");
        video.setTags(verificarEntradaDades("\n\t\t\ttags: ", sc));


        videoList.add(video);
    }

    protected void anadir_Tag(Scanner sc) {
        String nom = "", tag = "";
        boolean existeVideo = false;

        while (!existeVideo ) {
            System.out.print(" Nom del video on vols afegir-li un tag: ");
            nom = verificarEntradaDades(" Nom del video on vols afegir-li un tag: ", sc);

                for (Video video : videoList) {
                    if (video.getTitol().equalsIgnoreCase(nom)) existeVideo = true;
                }
                if (!existeVideo) System.out.println("El video introduït no existeix !");
        }
            System.out.print("Introdueix el tag: ");
            tag = verificarEntradaDades(" Introdueix el tag: ", sc);

        for (Video video : videoList) {
            if (video.getTitol().equalsIgnoreCase(nom)) {
                video.setTags(tag);
                System.out.println("\n\t\t\t Tag Introduït ! ");
            }
        }
    }
}
