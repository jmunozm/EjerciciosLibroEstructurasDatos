/**
 * 
 */
package c2;

/**
 * @author Juan Munoz
 * Clase para convertir caracter o cadena a numero ascii
 */
public class CodigoAscci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CodigoAscci a = new CodigoAscci();
		String cadena = "automovil";
		a.convertirCadena(cadena);
	}	
	
	
	/**
	 * Metodo que convierte un caracter a numero ascii
	 *
	 * @param  		caracter a convertir
	 * @return      el valor ascii
	 * @see         int
	 */
	public int convertirCaracter(char character){
		return (int) character;
	}
	
	/**
	 * Metodo que convierte una cadena a numeros ascii, "caracter" => "numero ascii"
	 *
	 * @param  		cadena de texto
	 */
	public void convertirCadena(String cadena){
		char arrayChar[]= cadena.toCharArray();
		for(int i = 0; i<=arrayChar.length-1; i++){
			System.out.println(arrayChar[i] + " => "+convertirCaracter(arrayChar[i]));
		}
	}
}
