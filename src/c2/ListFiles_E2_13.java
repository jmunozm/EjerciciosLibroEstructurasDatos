/**
 * 
 */
package c2;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Juan Munoz
 * Ejercicio de la figura 2.19
 * Ejemplo de Archivos Secuenciales 2.6.3
 * Como argumentos se pasan un listado de archivos, y el programa se encarga 
 * de leer el contenido (linea por linea) de cada archivo.
 * 
 * Se modifica para que si no recibe parametros de args[] solicite la entrada estandar de ruta de los archivos por teclado
 */	
public class ListFiles_E2_13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length == 0){
			Scanner in = new Scanner(System.in);
			ArrayList<String> array = getStrings();
			for (String fileName : array) {
				listFile(fileName);
			}
			
		}
		if(args.length>0){
			for(String fileName : args)
				listFile(fileName);
		}
	}
	
	public static void listFile(String fileName){
		Scanner fileIn = null;
		
		System.out.println("FILE: " + fileName);
		try {
			fileIn = new Scanner(new FileReader(fileName));
			while(fileIn.hasNextLine()){
				String onLine = fileIn.nextLine();
				System.out.println(onLine);
			}
		} catch(IOException e) {
			System.out.println(e);
		}finally {
			if(fileIn != null)
				fileIn.close();
		}
	}
	
	public static ArrayList<String> getStrings(){
		Scanner in = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<>();
		
		System.out.println("Introdusca una ruta de archivo por linea");
		System.out.println("Terminar con linea vacia");
		
		while (in.hasNextLine()) {
			String oneLine = in.nextLine();
			if(oneLine.equals(""))
				break;
			array.add(oneLine);
		}
		System.out.println("Done reading");
		return array;
	}
}
