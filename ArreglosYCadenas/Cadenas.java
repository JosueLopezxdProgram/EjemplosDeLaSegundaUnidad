package ArreglosYCadenas;

public class Cadenas {
	public static void main(String[] args) {
		
			String nombre="Danilo Noguera";
			System.out.println("Cantidad de carater : " + nombre.length());
			System.out.println("Primer caracter : " + nombre.charAt(0));
			System.out.println("Ultimo caracter :" + nombre.charAt(nombre.length()-1));
			System.out.println("Tota la cadena usando ciclo for");
			for (int i = 0; i < nombre.length(); i++) {
				System.out.println(nombre.charAt(i));
			}
		    for (int i = nombre.length()-1; i >=0; i--) {
				System.out.println(nombre.charAt(i));
			}
		    String texto="Ya soy un crack en java";
		    String[]separador=texto.split("");
		    System.out.println("\nImprimir las palabras por separado :");
		    for (int i = 0; i < separador.length; i++) {
				System.out.println(separador[i]);
			}
	}

}
