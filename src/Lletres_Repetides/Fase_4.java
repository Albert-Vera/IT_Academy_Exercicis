package Lletres_Repetides;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fase_4 {
    public static void main(String[] args) {
        String nameString = "Albert";
        String surNameString = "Vera";

        List<Character> name = new ArrayList<>();
        List<Character> surname = new ArrayList<>();
        List<Character> fullName = new ArrayList<>() ;

        for (int i = 0; i < nameString.length(); i++) {
            name.add(nameString.charAt(i));
        }
        for (int e = 0; e < surNameString.length(); e++) {
            surname.add(surNameString.charAt(e));
        }
       // fullName = name + surname ;

        for (int x = 0; x < name.size() ; x++ ) {
            fullName.add(name.get(x));
            if (x == name.size()-1) fullName.add(' ');
        }
        for (int z = name.size()+1; z < name.size()+1 + surname.size() ; z++ ) {
            fullName.add(surname.get(z - (name.size()+1)));
        }
        for (int x = 0; x < fullName.size() ; x++ ) {
            System.out.print(fullName.get(x));
        }
    }
}
