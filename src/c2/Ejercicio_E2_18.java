/**
 * 
 */
package c2;

import java.util.ArrayList;

import javax.swing.text.AbstractDocument.LeafElement;

/**
 * @author Juan Munoz
 *
 */
public class Ejercicio_E2_18 {

	public static void main(String[] args) {
		int [] arrayEnteros = {16,7,0,18,-10,-1,26,14,8,24,13,2,3,-4,9,6,5,4};
		System.out.println(hasDuplicates(arrayEnteros));
		
		int [ ][ ] c = { { 1, 2 }, {3,4,5}, { 1 } };
		System.out.println(hasDuplicates(c));
		
		String [] arrayString = {"Este", "es", "un", "string", "es"};
		System.out.println(hasDuplicates(arrayString));
		
		String [][] arrayStringMulti = {{"Este", "es", "un", "string", "do"},{"raro", "fa", "tu", },{"Esto"},{"Vamos", "a"}};
		System.out.println(hasDuplicates(arrayStringMulti));
	}
	
	public static boolean hasDuplicates(String[] arr){
		for(int i = 0; i<arr.length; i++)
			for(int j = i+1; j<arr.length; j++)
				if(arr[i].compareTo(arr[j])==0)
					return true;
		return false;
	}
	
	public static boolean hasDuplicates(String [][]arr){
		ArrayList<String> array = new ArrayList<String>();
		for(int i= 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				array.add(arr[i][j]);
			}
		}
		String []arreglo = new String[array.size()]; 
		for(int i = 0; i<array.size(); i++){
			arreglo[i]=array.get(i);
		}
		return hasDuplicates(arreglo);
	}
	
	public static boolean hasDuplicates(int[] arr){
		for(int i = 0; i<arr.length; i++)
			for(int j = i+1; j<arr.length; j++)
				if(arr[i]==arr[j])
					return true;
		return false;
	}
	
	public static boolean hasDuplicates(int [][]arr){
		ArrayList<Integer> array = new ArrayList<Integer>();
		for(int i= 0; i<arr.length; i++){
			if( arr[ i ] == null )
				continue;
			for(int j = 0; j<arr[i].length; j++){
				array.add(arr[i][j]);
			}
		}
		int []arreglo = new int[array.size()]; 
		for(int i = 0; i<array.size(); i++){
			arreglo[i]=(int)array.get(i);
		}
		return hasDuplicates(arreglo);
	}
	

}
