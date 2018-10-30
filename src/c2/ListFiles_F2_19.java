/**
 * 
 */
package c2;

import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author Juan Munoz
 * Ejercicio de la figura 2.19
 * Ejemplo de Archivos Secuenciales 2.6.3
 * Como argumentos se pasan un listado de archivos, y el programa se encarga 
 * de leer el contenido (linea por linea) de cada archivo.
 */	
public class ListFiles_F2_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		if(args.length == 0)
			System.out.println("No archivos");
		for(String fileName : args)
			listFile(fileName);
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
}
