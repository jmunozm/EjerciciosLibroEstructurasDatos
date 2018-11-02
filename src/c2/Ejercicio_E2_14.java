/**
 * 
 */
package c2;

import java.util.ArrayList;

/**
 * @author Juan Munoz
 *
 */
public class Ejercicio_E2_14 {

	public static void main(String[] args) {
		
		System.out.println("Texto Original");
		imprimirArreglo(args);
		System.out.println();
		System.out.println("Matriz reverse: ");
		reverse(args);
		
		ArrayList<String> arrayList = new ArrayList<>();
		for(int i = 0; i<args.length; i++){
			arrayList.add(args[i]);
		}
		
		System.out.println();
		System.out.println("Array reverse: ");
		reverse(arrayList);
		
	}
	
	public static void reverse(String[] arr){
		String arrayReverse[] = new String[arr.length];
		int posArr = arr.length-1;
		for(int i = 0; i<arrayReverse.length && posArr>=0; i++){
			arrayReverse[i] = arr[posArr];
			posArr--;
		}
		imprimirArreglo(arrayReverse);
	}
	
	public static void reverse(ArrayList<String> arr){
		String arrayReverse[] = new String[arr.size()];
		int posArr = arr.size()-1;
		for(int i = 0; i<arrayReverse.length && posArr>=0; i++){
			arrayReverse[i] = arr.get(posArr);
			posArr--;
		}
		imprimirArreglo(arrayReverse);
	}
	
	public static void imprimirArreglo(ArrayList<String> arr){
		for (String string : arr) {
			System.out.print(string + " ");
		}
	}
	
	public static void imprimirArreglo(String [] arr){
		for (String string : arr) {
			System.out.print(string + " ");
		}
	}
}
