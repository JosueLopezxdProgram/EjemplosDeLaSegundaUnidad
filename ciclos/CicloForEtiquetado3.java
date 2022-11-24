package ciclos;

public class CicloForEtiquetado3 {


   public static void main(String[] args) {
       aa: for(int i=0; i < 5; i++) {
         bb: for(int j = 0; j < 5; j++) {
           System.out.print(" * ");
           if(j == 1) {
              continue aa;
           }

         }
         System.out.println();
       }
   }
}
