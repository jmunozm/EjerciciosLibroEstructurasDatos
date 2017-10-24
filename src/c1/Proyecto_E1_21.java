/**
 * 
 */
package c1;

/**
 * @author Juan Muñoz
 *
 */
public class Proyecto_E1_21 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//enteros positivos(a,b) tales que a<b<500		
		int b = 1;
		int a = 0;
		do {
			for(int contador = 0; contador<b; contador++){
				if(a<contador){
					System.out.println("("+a+","+contador+")");	
				}
			}
			a=b-1;
			b=b+1;
		} while (b<500);

	}
}
