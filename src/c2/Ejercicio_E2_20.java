/**
 * 
 */
package c2;

/**
 * @author Juan Munoz
 *
 */
public class Ejercicio_E2_20 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		char caracter = 'e';
		String cadenaTexto = "texto de prueba";
		String []cadenasTexto = {"estas son varias cadenas","de texto","donde buscare","un","caracter.","Necesito saber cuantas coincidencias hay"};
		
		System.out.println("Caracter a buscar: " + caracter);
		System.out.println();
		System.out.println("Cadena 1: " + cadenaTexto);
		System.out.println("Coincidencias: " + countChars(cadenaTexto, caracter));
		System.out.println();
		System.out.println("Cadena 2: ");
		imprimirArreglo(cadenasTexto);
		System.out.println("Coincidencias: " + countChars(cadenasTexto, caracter));
	}
	
	public static void imprimirArreglo(String str[]){
		for(int i = 0; i<str.length; i++){
			System.out.println(str[i]);
		}
	}
	
	public static int countChars(String str[], char ch ){
		int countChar = 0;
		for(int i = 0; i<str.length; i++){
			for(int j = 0; j<str[i].length(); j++){
				if(str[i].charAt(j) == ch){
					countChar++;
				}
			}
		}
		return countChar;
	}
	
	public static int countChars(String str, char ch){
		
		int countChar = 0;
		
		for(int i = 0; i<str.length(); i++){
			if(str.charAt(i) == ch){
				countChar++;
			}
		}
		return countChar;
	}
}
