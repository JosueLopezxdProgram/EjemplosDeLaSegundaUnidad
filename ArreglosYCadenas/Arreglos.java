package ArreglosYCadenas;
import java.util.*;
public class Arreglos {

	public static void main(String[] args) {
		Scanner lector = new Scanner(System.in);
	
		String[] trabajos = new String[5];
		//trabajos[0]="Desarrollador";
		//trabajos[1]="Analista";
		//trabajos[2]="Tester";
		//trabajos[3]="C de calidad";
		//trabajos[4]="Admin";
		System.out.println("Ingrese el cargo de los trabajadores :");
          for (int i = 0; i < trabajos.length; i++) {
			trabajos[i]=lector.nextLine();
        	  System.out.println(trabajos[5]);
		}
	
	}
	
}
