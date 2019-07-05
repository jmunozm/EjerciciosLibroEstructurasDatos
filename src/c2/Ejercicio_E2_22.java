/**
 * 
 */
package c2;

import java.util.Random;

/**
 * @author Juan Munoz
 *
 */
public class Ejercicio_E2_22 {

	public static final int TAMANIO_ARREGLO = 20;
	public static final int DIFF_NUMBERS = 9;
	
	public static void main(String[] args) {
		int arr[] = new int[TAMANIO_ARREGLO];
		int val = 4;
		System.out.println("VAL: " + val);
		llenarArreglo(arr);
		System.out.print("Arreglo: ");
		imprimirArreglo(arr);
		System.out.println();
		System.out.println("How Many []: " + hoMany(arr, val));

		int [ ][ ] c = { { 0, 2 ,0 }, {3,4,5,1,1,1}, { 1,0,1,2,3,2,1,1,2,3,2,1 } , {1,4,1,4,3,1},  {1,4,1,4,3}};
		System.out.println();
		System.out.println("Arreglo: ");
		imprimirArreglo(c);
		System.out.println("How Many [][]: " + hoMany(c, val));
	}
	
	public static int hoMany(int [][]arr, int val){
		int count = 0;
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				if(arr[i][j]==val)
					count++;
			}
		}
		return count;
	}
	
	public static int hoMany(int [] arr, int val){
		int count = 0;;
		for(int i = 0; i < arr.length; i++){
			if(arr[i]==val)
				count++;
		}
		return count;
	}
	
	public static int[] llenarArreglo(int arr[]){
		Random r = new Random();
		for(int i = 0; i < arr.length; i++){
			arr[i] = r.nextInt(DIFF_NUMBERS) + 1;
		}
		return arr;
	}
	
	public static void imprimirArreglo(int arr []){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
	}
	
	public static void imprimirArreglo(int arr[][]){
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(arr[i][j]+ " ");
			}
			System.out.println();
		}
	}

}
