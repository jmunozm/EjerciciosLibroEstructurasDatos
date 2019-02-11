/**
 * 
 */
package c2;

/**
 * @author Juan Munoz
 *
 */
public class Ejercicio_E2_10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
	}
	
	public static void resize(int [] arr){
		int [] old = arr;
		arr = new int[ old.length * 2 + 1 ];
		
		for( int i = 0; i < old.length; i++)
			arr[ i ] = old[i];
		
	}
	
//	public static void foo(){
//		try{
//			return 0;
//		}finally{
//			return 1;
//		}
//	}
	
	public static void bar(){
		try{
			throw new NullPointerException();
		}finally{
			throw new ArithmeticException();
		}
	}

}
