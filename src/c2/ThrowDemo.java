/**
 * 
 */
package c2;

import java.io.IOException;

/**
 * @author Juan Munoz
 *
 */
public class ThrowDemo {
	
	public static void processFile(String toFile) throws IOException{
		
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		for(String fileName : args){
			try {
				processFile(fileName);
			} catch (Exception e) {
				System.err.println(e);
			}
		}
	}

}
