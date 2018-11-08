/**
 * 
 */
package c2;

/**
 * @author Juan Munoz
 *
 */
public class Ejercicio_E2_17 {

	public static void main(String[] args) {
		int [] arrayEnteros = {6,7,-1,8,-10,-1,6,4,7,8,4,3,2,3,4,9,6,5,4};
		System.out.println(min(arrayEnteros));
		int [][] arrayEnterosMulti = {{9,-2},{3,4,5},{6},{86,34,-22},{6,34,6,2}, {-23}};
		System.out.println(min(arrayEnterosMulti));
		String [] arrayString = {"Este", "es", "un", "string"};
		System.out.println(max(arrayString));
	}
	
	public static int min(int [] arr){
		int min = 0;
		if(arr.length>0)
			min = arr[0];
		for(int i = 0; i<arr.length; i++)
			min = Math.min(min, arr[i]);
		return min;
	}
	
	public static int min(int [][]arr){
		int min = 0;
		
		if(arr.length>0)
			min = arr[0][0];
		for( int i = 0; i < arr.length; i++ ){
            if( arr[ i ] != null ){
                for( int j = 0; j < arr[i].length; j++ )
                	min = Math.min(min, arr[i][j]);
            }
        }
		return min; 
	}
	
	public static String max(String arr[]){
		String max = "";
		int valor = 0;
		if(arr.length>0)
			max = arr[0];
		for(int i = 0; i<arr.length; i++){
			if(max.compareTo(arr[i])<0){
				max = arr[i];
			}
		}
		return max; 
	}

}
