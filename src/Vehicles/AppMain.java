package Vehicles;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Exercicio Vehiculo
 */
public class AppMain {
    public static void main(String[] args) {
        Car car = null;
        Bike bike;
        Wheel wheel = new Wheel();
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        String davant = "davant";
        String darrera = "darrera";
        String esquerra = " esquerra: ";
        String dreta = " dreta: ";
        String opcio_Vehicle;
        List<Wheel> pneumatic_delantero = new ArrayList<>();
        List<Wheel> pneumatico_trasero = new ArrayList<>();

        opcio_Vehicle = triar_Vehicle(sc);

        switch ( opcio_Vehicle){
            case "1":   bike = crear_Vehicle_Bike( sc);
                        Wheel pneumatic_1 = new Wheel();
                        Wheel pneumatic_2 = new Wheel();
                        pneumatic_1 = llegir_Dades(wheel, sc, davant, ": ");
                        pneumatic_2 = llegir_Dades(wheel, sc, darrera, ": ");
                        try {
                            bike.addWheels(pneumatic_1, pneumatic_2);
                        }catch (Exception e){
                            System.out.println("\nError en entrada de datos");
                            e.printStackTrace();
                        }
                System.out.println("\nLa teva elecció es una: " + bike.brand + " matricula: " + bike.plate + " i de color " + bike.color + " i amb dues rodes");

                break;

            case "2":   car = crear_Vehicle_Car( sc);
                        pneumatic_delantero.add(llegir_Dades(wheel, sc, davant, esquerra));
                        pneumatic_delantero.add(llegir_Dades(wheel, sc, davant, dreta));
                        pneumatico_trasero.add(llegir_Dades(wheel, sc, darrera, esquerra));
                        pneumatico_trasero.add(llegir_Dades(wheel, sc, darrera, dreta));
                        try {
                            car.addWheels(pneumatic_delantero, pneumatico_trasero);
                        } catch (Exception e) {
                            System.out.println("\nError en entrada de datos");
                            e.printStackTrace();
                        }
                System.out.println("\nLa teva elecció es un: " + car.brand + " matricula: " + car.plate + " i de color " + car.color + " i amb quatre rodes");
                        break;
        }

    }

    private static String triar_Vehicle(Scanner sc) {
        String opcio_Vehicle;
        while (true){
            System.out.println("\n\t\t\t###################   T R I A R   U N  V E H Í C L E   ##################");
            System.out.println("\n\t\t\t\t\t\t 1.   Bicicleta");
            System.out.println("\n\t\t\t\t\t\t 2.   Cotxe");
            System.out.print("\n\n\t\t\t Opció: ");
            opcio_Vehicle = sc.nextLine();

            if ( opcio_Vehicle.equals("1") || opcio_Vehicle.equals("2")) return opcio_Vehicle;
            System.out.println("Si us plau, només una de les dues opcions.");

        }
    }

    private static Car crear_Vehicle_Car(  Scanner sc) {
        String matricula;
        String marca;
        String color;
        Car car;
        String expr_matricula = "^[0-9]{1,4}[A-Z]{2,3}";

        while (true) {
            System.out.print("\nIntrodueix la matricula del cotxe: ");
            matricula = sc.nextLine();

            if (Pattern.matches(expr_matricula, matricula)) break;
            System.out.println("Una matricula vàlida es 4 digits i 2 ó 3 lletres majúsculas");
        }
        System.out.print("Introdueix la marca del vehicle: ");
        marca = sc.nextLine();
        System.out.print("Introdueix el color del vehicle: ");
        color = sc.nextLine();
        car = new Car(matricula, marca, color);
        return car;
    }
    private static Bike crear_Vehicle_Bike(  Scanner sc) {
        String matricula;
        String marca;
        String color;
        Bike bike;
        String expr_matricula = "^[0-9]{1,4}[BCDFGHJKLMNPRSTVWXYZ]{2,3}";

        while (true) {
            System.out.print("\nIntrodueix la matricula de la bicicleta: ");
            matricula = sc.nextLine();

            if (Pattern.matches(expr_matricula, matricula)) break;
            System.out.println("Una matricula vàlida es 4 digits i 2 ó 3 lletres majúsculas");
        }
        System.out.print("Introdueix la marca del vehicle: ");
        marca = sc.nextLine();
        System.out.print("Introdueix el color del vehicle: ");
        color = sc.nextLine();
        bike = new Bike(matricula, marca, color);
        return bike;
    }

    private static Wheel llegir_Dades(Wheel wheel, Scanner sc, String texte_1, String texte_2) {
        System.out.print("\nIntrodueix marca pneumàtic " + texte_1 + texte_2);
        wheel.setBrand(sc.nextLine());

        while (true) {
            System.out.print("Introdueix diàmetre pneumàtic " + texte_1 + texte_2);
            wheel.setDiameter(sc.nextDouble());
            sc.nextLine();
            if ((wheel.getDiameter() > 0.4) && (wheel.getDiameter() < 4)) return wheel;
            System.out.println("El valor ha de ser entre 0.4 i 4 ");
        }
    }
}
