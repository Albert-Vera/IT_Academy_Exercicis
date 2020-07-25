package Lambda_Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fase_1 {
    public static void main(String[] args) {
        List<String> lista;
        String[] names = {"Ana", "Pedro", "Juan", "Maria", "Luisa", "Angelica", "Jose", "Sal", "Aja", "Tomeu", "Ali"};
        int[] numbers = {1, 14, 31, 33, 11, 101, 97, 83, 91, 92, 75, 389, 380, 33, 50, 99};
        String[] month = {"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Setiembre","Octubre","Noviembre","Diciembre"};

        //Apartado 1
        apartado_1(names).forEach(System.out::println);
        // Apartado 2
        Arrays.stream(apartado_2(numbers));
        //Apartado 3
        apartado_3(names).forEach(System.out::println);
        //Apartado 4
        apartado_4(names).forEach(System.out::println);
        //Apartado 5
        System.out.println("\n\nApartado 5:   Listar meses del año");
        Arrays.stream(month).forEach(System.out::println);
    }

    static List<String> apartado_1(String[] names) {
        System.out.println("\nAPARTADO 1: Que empiece por 'A'");
        List<String> lista = Arrays.stream(names)
                .filter(x -> x.startsWith("A"))
                .filter(x -> x.length() == 3)
                .collect(Collectors.toList());
        return lista;
    }

    static String[] apartado_2(int[] numbers) {
        String[] datos = new String[16];
        System.out.println("\n\n APARTADO 2: Números pares con 'e', números impares con 'o'");
        for (int i = 0; i < numbers.length; i++) {
            datos[i] = numbers[i] % 2 == 0 ? numbers[i] + "e" : numbers[i] + "o";

            if (i != 15) System.out.print(datos[i] + ", ");
            else System.out.println(datos[i] + ".");
        }
        return datos;
    }
    static List<String> apartado_3(String[] names) {
        System.out.println("\nAPARTADO 3: Que contenga 'o'");
        List<String> lista = Arrays.stream(names)
                .filter(x -> x.contains("o"))
                .collect(Collectors.toList());
        return lista;
    }
    static List<String> apartado_4(String[] names) {
        System.out.println("\nAPARTADO 4:  Filtrar que contenga 'o' o sea longitud mayor de 5");
        List<String> lista = Arrays.stream(names)
                .filter(x -> x.length() > 5 || x.contains("o"))
                .collect(Collectors.toList());
        return lista;
    }
}
