package Floristeria.Gestio;

import Floristeria.Model.Floristeria;
import Floristeria.View.View;

import java.util.Scanner;

import static Floristeria.AppMain.opcion_Menu;

/**
 * Esta clase es para gestión de la floristeria
 */
public class Gestio_Floristeria {
  public void crear_Floristeria(Scanner sc){
      Floristeria floristeria = new Floristeria();
      new View().menu_Crear_Floristeria();
      System.out.print("\n\n\t\t\tNombre: ");
      floristeria.setNom(lectura_Datos(sc));
      System.out.print("\t\t\tDirección: ");
      floristeria.setAdress(lectura_Datos(sc));
      System.out.print("\t\t\tTeléfono: ");
      floristeria.setPhone(lectura_Datos(sc));
  }
  public void gestor_Floristeria(Scanner sc){
      while(true) {
          new View().Gestor_Floristeria();
          int opcion = opcion_Menu(sc, 6);

          switch (opcion) {
              case 1:
                  insertar_Arbol();
                  break;
              case 2:
                  insertar_Flor();
                  break;
              case 3:
                  insertar_Decoracion();
                  break;
              case 4:
                  new View().ver_stock();
                  break;
              case 5:
                  System.exit(0);
          }
      }
  }
  void insertar_Arbol(){
      //TODO hacer método insertar

  }
  void insertar_Flor(){
      // TODO hacer método insertar

  }
  void insertar_Decoracion(){
      // TODO hacer método insertar

  }

  private String lectura_Datos(Scanner sc){
      //TODO hacer método lectura datos falta filtro de entrada datos
      String dato;

      dato = sc.nextLine();

      return dato;

  }
}
