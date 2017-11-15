/**
 * 
 */
package c2;

/**
 * @author Juan Munoz
 * Ejemplo para comprender el metodo compareTo
 * El m�todo compareTo se usa para comparar dos cadenas, indicando que cadena es mayor que otra. 
 * 
 * - N�mero positivo: la cadena 1 es mayor que la cadena 2.
 * - 0: las cadenas son iguales.
 * - N�mero negativo: la cadena 1 es menor que la cadena 2.
 * 
 * No sigue el alfabeto original sino seg�n la tabla ASCII, es decir, que a es menor que z.
 * Cuando las dos cadenas empiezan por los mismos caracteres y solo se diferencian 
 * en alg�n car�cter, es ese car�cter el que comparan.
 */
public class CompareTo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String texto1 = "americano";
		String texto2 = "coche";
		
		texto1 = "mota";
		texto2 = "mota";
		
		System.out.println(texto1.compareTo(texto2));
		
		CodigoAscci c = new CodigoAscci();
		c.convertirCadena(texto1);
		System.out.println("------");
		c.convertirCadena(texto2);
	}

}
