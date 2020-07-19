package Rockets;

public class Propulsion_Rockets {
    boolean disponible_Aumento = true;
    boolean disponibles_bajada = true;

    protected synchronized int aumentar(Integer propulsion_power) throws InterruptedException {
        while( !disponible_Aumento) wait();
        disponible_Aumento = false;
        Thread.sleep(1500);
        disponible_Aumento = true;

        return propulsion_power += 10;
    }
    protected synchronized int disminuir(Integer propulsion_power) throws InterruptedException {
        while( !disponibles_bajada) wait();
        disponibles_bajada = false;
        Thread.sleep(1500);
        disponibles_bajada = true;

        return propulsion_power -= 10;
    }
}
