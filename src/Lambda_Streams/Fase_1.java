package Lambda_Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Fase_1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
       String[] names = {"Ana", "Pedro","Juan", "Maria", "Luisa", "Angelica", "Jose", "Sal", "Aja", "Tomeu", "Ali"};

       lista = Arrays.stream(names).filter(x -> x.startsWith("A"))
               .filter(x -> x.length()==3)
               .collect(Collectors.toList());


       for (String lis: lista){
           System.out.println("lñasdlalñdk  " + lis);
       }
    }
}
//  lista.add(Arrays.stream(names).filter(x -> x.length()==3).collect(Collectors.joining()));
//.filter(x -> x.startsWith("a"))
