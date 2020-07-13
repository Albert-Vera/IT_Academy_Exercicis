package Variables_i_Constants;

public class Fase_2 {
    public static void main(String[] args) {
        final int any_inicial = 1948;
        int any_nacimiento = 1969;
        int cantidadBisiestos = 0;

        for (int anys = any_inicial; anys < any_nacimiento +1; anys++) {

            int dos_Ultimos = anys - (anys / 100 * 100);  // Obtiene los dos últimos digitos para calcular bisiesto
            int bisiesto = dos_Ultimos % 4;               // Calcula bisiesto
            if ( dos_Ultimos == 0) {  //   Si dos últimos dígitos son Zero, calcula sobre los dos primeros
                bisiesto = (anys / 100) % 4;
            }
            if ( bisiesto == 0) {     // Si es año bisiesto imprime el año
                cantidadBisiestos++;
                System.out.println( "Años bisiestos: " + anys);
            }
        }
        System.out.println("\nNúmero de años bisiestos entre " + any_inicial + " y " + any_nacimiento +": " + cantidadBisiestos);
    }
}
