/**
 * 
 */
package c2;

import java.awt.Button;

/**
 * @author Juan Munoz
 *
 */
public class Matrices_2_4_1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Button [] arrayOfButtons;
		arrayOfButtons = new Button[5];
		for(int i = 0; i < arrayOfButtons.length; i++){
			arrayOfButtons[i] = new Button("Label " + i);
		}
		
		for(int i = 0; i<arrayOfButtons.length; i++){
			System.out.println(arrayOfButtons[i].getLabel());
		}
	}

}
