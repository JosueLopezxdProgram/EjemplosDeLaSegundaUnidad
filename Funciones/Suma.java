package Funciones;

public class Suma {

	
	float sumar(float n1,float n2) {
		float sum = n1+n2;
		return sum;
		
	}
	public static void main(String[] args) {
		
		float sum=new Suma().sumar(3,9);
		System.out.println("La suma es " + sum);
	}
}
