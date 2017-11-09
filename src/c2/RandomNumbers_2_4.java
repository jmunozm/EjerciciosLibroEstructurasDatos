/**
 * 
 */
package c2;

import java.util.Random;

/**
 * @author Juan Munoz
 * 
 * Genarar numeros aleatorios entre (1-DIFF_NUMBERS)
 * Imprimir el numero de apariciones de cada numero
 *
 */
public class RandomNumbers_2_4 {

	public static final int DIFF_NUMBERS = 100;
	public static final int TOTAL_NUMBERS = 100000;
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//Se crea la matriz, iniciandola con valores 0
		int [] numbers = new int[DIFF_NUMBERS+1];
		for(int i = 0;i<numbers.length; i++){
			numbers[i]= 0;
		}
			
		//Generar los numeros
		Random r = new Random();
		for(int i = 0;i<TOTAL_NUMBERS; i++){
			numbers[r.nextInt(DIFF_NUMBERS)+1]++;
		}
		
		//Imprimir el resumen
		for(int i = 1;i<=DIFF_NUMBERS; i++){
			System.out.println(i + ": " + numbers[i]);
		}
	}
}
