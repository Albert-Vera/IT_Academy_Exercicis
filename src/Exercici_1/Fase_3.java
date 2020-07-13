package Exercici_1;

public class Fase_3 {

    public static void main(String[] args) {
        final int any_inicial = 1948;
        int any_nacimiento = 1969;
        int cantidadBisiestos = 0;
        String frase = "El año ";
        String fraseTrue = " es un año bisiesto";
        String fraseFalse = " no";

        for (int anys = any_inicial; anys < any_nacimiento +1; anys++) {
            boolean es_Bisiesto = calcular_Bisiesto(anys);

            if ( es_Bisiesto ) {     // Si es año bisiesto imprime el año
                cantidadBisiestos++;
                System.out.println( frase + anys + fraseTrue);
            }else System.out.println( frase + anys + fraseFalse + fraseTrue);
        }
    }
    static boolean calcular_Bisiesto(int anys){
        int dos_Ultimos = anys - (anys / 100 * 100);  // Obtiene los dos últimos digitos para calcular bisiesto
        int bisiesto = dos_Ultimos % 4;               // Calcula bisiesto

        if ( dos_Ultimos == 0) {  //   Si dos últimos dígitos son Zero, calcula sobre los dos primeros
            bisiesto = (anys / 100) % 4;
        }
        if (bisiesto == 0) return true;
        return false;
    }
}
