package Operadores;

public class DemoSentenciasSwitch_02 {


   public static void main(String[] args) {
     char caracter = 'y';
      System.out.println("Sentencia antes de la primera sentencia switch");
      switch(caracter) { //Comparando caracter con constantes en el bloque switch
        case 'x':
           System.out.println("caracter tiene el valor x");
           break;
        case 'y':
           System.out.println("caracter tiene el valor y");
           break;
        case 'z':
           System.out.println("caracter tiene el valor ");
        break;
      }
      System.out.println("Sentencia después de la primera sentencia switch");
   }
}