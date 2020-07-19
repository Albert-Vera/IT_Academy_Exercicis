package Rockets;

import java.util.ArrayList;
import java.util.List;

public class Lanzar_Rocket extends Thread{
    Propulsion_Rockets propulsion_rockets;

    private String id;
    private int number_Rockets;
    private List<Integer> power_propultion = new ArrayList<>();

    public Lanzar_Rocket(String name, String id, int number_Rockets, List<Integer> power_propultion, Propulsion_Rockets propulsion) {
        super(name);
        this.id = id;
        this.number_Rockets = number_Rockets;
        this.power_propultion = power_propultion;
        this.propulsion_rockets = propulsion;
    }

    @Override
    public void run() {

        try{
            while (true) {
                for (int i = 0; i < number_Rockets; i++) {


                    if (power_propultion.get(i) < 60) {
                        power_propultion.set(i, propulsion_rockets.aumentar(power_propultion.get(i)));
                        System.out.println("Aumentando potencia del propulsor: " + i + "   " + getName() + "    Potencia al: " + power_propultion.get(i) + " %");
                    }
                    if (power_propultion.get(i) > 80) {
                        power_propultion.set(i, propulsion_rockets.aumentar(power_propultion.get(i)));
                        System.out.println("Disminuyendo potencia del propulsor: " + i + "   " + getName() + "    Potencia al: " + power_propultion.get(i) + " %");
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
