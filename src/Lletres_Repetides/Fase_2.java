package Lletres_Repetides;

import java.util.ArrayList;
import java.util.List;

public class Fase_2 {
    public static void main(String[] args) {
        List<String> nom = new ArrayList<>();
        nom.add("A");
        nom.add("l");
        nom.add("b");
        nom.add("1");
        nom.add("r");
        nom.add("t");

        for (int i = 0; i < nom.size(); i++) {
            if ("bcdfghjklmnñpqrstvwxyz".contains(String.valueOf(nom.get(i)).toLowerCase())){
                System.out.println("**** " + nom.get(i) + " **** es una consonante");
            }else
                if ("0123456789".contains(String.valueOf(nom.get(i)).toLowerCase())){
                    System.out.println("**** " + nom.get(i) + " **** Los nombres de personas no pueden contener números !");
                }else System.out.println("**** " + nom.get(i) + " **** es una vocal");
        }

    }
}
