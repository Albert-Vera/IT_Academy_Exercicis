package Lambda_Streams.Fase_3;

public class MainApp {
    public static void main(String[] args) {

        String_Reverse string_reverse = (string) -> {
            string.chars()
                    .mapToObj(e -> String.valueOf((char)e)) //convierte cada letra a String
                    .reduce((a, e)-> e.concat(a)) //concadena, pero con el orden contrario
                    .ifPresent(System.out::println);
            return string ;
        };
        string_reverse.reverse("madrid");
    }
}
