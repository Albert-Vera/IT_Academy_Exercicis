package Exercici_1;

public class Fase_4 {
    public static void main(String[] args) {
        String nom = "Albert";
        String cognoms = " XXXX XXXX";
        int dia = 10; int mes = 12 ; int any = 1969;
        String fraseTrue = " és de traspàs.";
        String fraseFalse= " no és de traspàs.";
        String frase;

        boolean es_Bisiesto = calcular_Bisiesto(any);
        if (es_Bisiesto) frase = fraseTrue;
        else frase = fraseFalse;

        System.out.println( "El meu nom és " + nom + " " + cognoms);
        System.out.println("Vaig néixer el " + dia + "/" + mes + "/" + any);
        System.out.println(" El meu any de naixement" + frase);

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
