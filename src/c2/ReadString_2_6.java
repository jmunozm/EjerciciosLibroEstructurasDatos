/**
 * 
 */
package c2;

import java.util.Scanner;

/**
 * @author Juan Munoz
 *
 * Leer un numero limitado de objetos String: devolver un String[]
 * En caso de que sea necesario se expande dinamicamente el string
 */
public class ReadString_2_6 {
	
	public static String[] getString(){
		Scanner in = new Scanner(System.in);
		String [] array = new String[5];
		int itemRead =0;
		
		System.out.println("Enter Strings. one per line");
		System.out.println("Terminate with empty line");
		
		while (in.hasNextLine()) {
			String oneLine = in.nextLine();
			if(oneLine.equals("")){
				break;
			}
			if(itemRead == array.length){
				array = resize(array, array.length * 2);
			}
			array[itemRead++] = oneLine;
		}
		return resize(array, itemRead);
	}
	
	public static String [] resize(String []array,  int newSize){
		String [] original = array;
		int numToCopy = Math.min(original.length, newSize);
		
		array = new String[newSize];
		for(int i = 0; i < numToCopy; i++){
			array[i] = original[i];
		}
		return array;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String []array = getString();
		for(int i = 0; i < array.length; i++){
			System.out.println(array[i]);
		}
	}

}
