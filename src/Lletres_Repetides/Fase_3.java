package Lletres_Repetides;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Fase_3 {
    public static void main(String[] args) {
        String nom = "Alberttttttttt";
        Map<Integer, Character> nomMap = new HashMap<>();

        for (int i = 0; i < nom.length(); i++) {
            nomMap.put(i, nom.charAt(i));
        }
        Iterator it = nomMap.keySet().iterator();
        while(it.hasNext()){
            Integer key = (Integer) it.next();
            int apariciones = calcular_Apariciones(nom, nomMap.get(key));
            System.out.println("Clave: " + key + " -> Valor: " + nomMap.get(key) + " La letra se repite: " + apariciones + " veces.");
        }
    }
    static int calcular_Apariciones(String nom, Character character){
        int contador= 0;
        for (int i = 0; i < nom.length(); i++) {
            if ( nom.charAt(i) == character) contador ++;
        }
        return  contador;
    }
}
