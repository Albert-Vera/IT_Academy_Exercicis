package Rockets;

import java.util.ArrayList;
import java.util.List;

public class Fase_2 {
    public static void main(String[] args) {

        List<Integer> rocketsList = new ArrayList<>();
        Rocket rocket_1 ;
        Rocket rocket_2 ;
        rocketsList.add(10);
        rocketsList.add(30);
        rocketsList.add(80);

        rocket_1 = new Rocket( "32WESSDS", 3, rocketsList );
        System.out.print("Rocket: " + rocket_1.getId() +  ": ");

        for (int i = 0; i < rocket_1.getPower_propultion().size(); i++) {
            System.out.print(rocket_1.getPower_propultion().get(i) + ", ");
        }

        rocketsList.clear();
        rocketsList.add(30);
        rocketsList.add(40);
        rocketsList.add(50);
        rocketsList.add(50);
        rocketsList.add(30);
        rocketsList.add(10);

        rocket_2 = new Rocket( "LDSFJA32", 6, rocketsList );
        System.out.print("\nRocket: " + rocket_2.getId() +  ": ");

        for (int i = 0; i < rocket_2.getPower_propultion().size(); i++) {
            System.out.print(rocket_2.getPower_propultion().get(i) + ", ");
        }

    }
}
