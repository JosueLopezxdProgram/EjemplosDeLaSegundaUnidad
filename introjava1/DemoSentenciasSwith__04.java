package introjava1;

public class DemoSentenciasSwith__04 {


   public static void main(String[] args) {
     int dia = 99; 
     System.out.println("Día número: " + dia);

    switch (dia) {
      case 0:
         System.out.println("Una nueva semana inicia!");
         break;
      case 1:
         System.out.println("Aburrido!");
         break;
      case 2:
         System.out.println("Ok, volvamos a intentarlo!");
         break;
      case 3:
         System.out.println("Yupi, ya estamos a mitad de camino!");
         break;
      case 4:
         System.out.println("Aún falta!");
         break;
      case 5:
         System.out.println("Sí, ya viene el fin de semana!");
         break;
      default:
         System.out.println("Los fines de semana son lo mejor, pero duran poco!");
         break;
    }
   }
}