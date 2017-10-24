/**
 * 
 */
package c1;

/**
 * @author BRM05461
 *
 */
public class TablasMultiplicar_E1_17 {
	
	public static final int NUMERO_MAXIMO = 10000;

	public static void main(String[] args) {

		for(int i = 0; i<=NUMERO_MAXIMO; i++ ){
			tablaMultiplicar(i);
			System.out.println();
		}
		
//		System.out.println(randoom(10) + " x " + randoom(10) + " = " );
		
	}
	
	public static void tablaMultiplicar(int tabla){
		for(int i = 1; i<=10; i++ ){
			System.out.println(tabla + " x " + i + " = " + (tabla*i));
		}
	}
	
	 private static int randoom(int maximo){
		 return (int)(Math.random()*maximo)+1;
	 }
}
