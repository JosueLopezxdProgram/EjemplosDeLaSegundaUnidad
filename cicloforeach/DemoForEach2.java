package cicloforeach;

import java.util.ArrayList;

public class DemoForEach2 {


   public static void main(String[] args) {
      //Declaración de una colección genérica de String
      //Es un Arreylist de cadenas
      ArrayList<String> baldeString = new ArrayList<>();
      String nombre = "Danilo";
      baldeString.add("Hola");
      baldeString.add("Hello");
      baldeString.add("Hi");
      baldeString.add(nombre);
      
      for (String cadena : baldeString) {
         System.out.println("La cadena es"+ cadena);
      }
   }
}