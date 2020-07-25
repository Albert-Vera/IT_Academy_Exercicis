package Lambda_Streams.fase_2;

import java.util.function.Function;
import java.util.function.Supplier;

public class MainApp {
    public static void main(String[] args) {


        // Utilizando expresión lambda
        ValorDe_Pi valorDe_pi = () -> 3.1415;
        System.out.println(valorDe_pi.getPiValue());
    }
}
