package Lambda_Streams.Fase_3;

import org.w3c.dom.ls.LSOutput;

public class ManejoDeString implements String_Reverse {

//    String_Reverse metodo ( String string_reverse){
//        String_Reverse string_reverse1 = ( ) -> {
//        string_reverse.chars()
//                    .mapToObj(e -> String.valueOf((char) e)) //convierte cada letra a String
//                    .reduce((a, e) -> e.concat(a)) //concadena todo pero con el orden contrario
//                    .ifPresent(System.out::println);
//            return string_reverse1.reverse("Manolo cabeza bolo");
//    };//esta linia solo imprime
//
//    }



//    String metodo ( String_Reverse string_reverse){
//        return string_reverse.reverse("maritimo");
//    }

//
//    String_Reverse string_reverse = (String string) -> {
//        return string.chars()
//                    .mapToObj(e -> String.valueOf((char) e)) //convierte cada letra a String
//                    .reduce((a, e) -> e.concat(a)) //concadena todo pero con el orden contrario
//                    .ifPresent(System.out::println);
//    };//esta linia solo imprime la palabra



    @Override
    public String reverse(String string) {
        string.chars()
                .mapToObj(e -> String.valueOf((char)e)) //convierte cada letra a String
                .reduce((a, e)-> e.concat(a)) //concadena todo pero con el orden contrario
                .ifPresent(System.out::println);//esta linia solo imprime la palabra
        return string;
    }
}
