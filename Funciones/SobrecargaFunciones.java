package Funciones;

public class SobrecargaFunciones {

	static float multiplicar(float n1,float n2) {
		float prod = n1 * n2;
		return prod;
		
			}
	static float multiplicar(float n1,float n3, float n2) {
		float prod = n1 * n2 * n3;
		return prod;
		
			}
	public static void main(String[] args) {
		float producto = multiplicar(5,3);
		System.out.println("La multiplicacion es : " + producto);
		
		producto=multiplicar(5,3,6);
		System.out.println("El resultado es "+ producto);
	}
}

