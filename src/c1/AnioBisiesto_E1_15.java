/**
 * 
 */
package c1;

/**
 * @author Juan Munoz
 * Ejercicio 1.15 
 * Metodo que recibe como parametro el año y deterina si es bisiesto o no.
 *
 */
public class AnioBisiesto_E1_15 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(isAnioBisiesto(2016));
	}
	
	public static boolean isAnioBisiesto(int anio){
		boolean valida = false;
		if ((anio % 4 == 0) && ((anio % 100 != 0) || (anio % 400 == 0))){
			valida = true;
		}
		return valida;
	}
}
