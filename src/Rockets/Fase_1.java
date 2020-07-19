package Rockets;

public class Fase_1 {
    public static void main(String[] args) {
        Rocket rocket_1 = new Rocket("LDSFJA32", 3);
        Rocket rocket_2 = new Rocket("LDSFJB36", 6);

        System.out.println("\nRocket id: " + rocket_1.getId());
        System.out.println("Rocket number propultion: " + rocket_1.getNumber_Rockets());
        System.out.println("\nRocket id: " + rocket_2.getId());
        System.out.println("Rocket number propultion: " + rocket_2.getNumber_Rockets());
    }
}
