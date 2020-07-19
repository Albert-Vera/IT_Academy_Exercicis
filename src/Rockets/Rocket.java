package Rockets;

import java.util.ArrayList;
import java.util.List;

public class Rocket {

    private String id;
    private int number_Rockets;
    private List<Integer> power_propultion = new ArrayList<>();

    public Rocket() {
    }

    public Rocket(String id, int number_Rockets) {
        this.id = id;
        this.number_Rockets = number_Rockets;
    }

    public Rocket(String id, int number_Rockets, List<Integer> power_propultion) {
        this.id = id;
        this.number_Rockets = number_Rockets;
        this.power_propultion = power_propultion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getNumber_Rockets() {
        return number_Rockets;
    }

    public void setNumber_Rockets(int number_Rockets) {
        this.number_Rockets = number_Rockets;
    }

    public List<Integer> getPower_propultion() {
        return power_propultion;
    }

    public void setPower_propultion(int power_propultion) {
        this.power_propultion.add( power_propultion);
    }
}
