package Rockets;

import java.util.ArrayList;
import java.util.List;

public class Fase_3 {
    public static void main(String[] args) {
        Propulsion_Rockets propulsion = new Propulsion_Rockets();
        List<Integer> rocketsList = new ArrayList<>();

        rocketsList.add(0);
        rocketsList.add(0);
        rocketsList.add(0);
        Lanzar_Rocket rocket_1 = new Lanzar_Rocket( "Cohete_1", "32WESSDS", 3, rocketsList, propulsion);

        rocketsList.clear();
        rocketsList.add(0);
        rocketsList.add(0);
        rocketsList.add(0);
        rocketsList.add(0);
        rocketsList.add(0);
        rocketsList.add(0);
        Lanzar_Rocket rocket_2 = new Lanzar_Rocket("cohete_2", "LDSFJA32", 6, rocketsList, propulsion);


        rocket_1.start();
        rocket_2.start();
    }



}
