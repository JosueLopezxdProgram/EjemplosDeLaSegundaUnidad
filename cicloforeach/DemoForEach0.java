package cicloforeach;

import java.util.ArrayList;
import java.util.Iterator;

public class DemoForEach0 {


   public static void main(String[] args) {
      //Declaración e inicialización de un ArrayList
      ArrayList objeto= new ArrayList<>();
      //Agregamos al ArrayList unas cadenas
      //El método add() está disponible dentro de ArrayList
      objeto.add("Hola");
      objeto.add("Hello");
      objeto.add("Hi");

   
      for (Iterator iterator = objeto.iterator(); iterator.hasNext();) {
		Object object = (Object) iterator.next();
		System.out.println(objeto);
	}
   }
}
