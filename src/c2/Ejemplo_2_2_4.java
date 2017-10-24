/**
 * 
 */
package c2;

import java.awt.Button;

import javax.swing.JPanel;

/**
 * @author BRM05461
 *
 */
public class Ejemplo_2_2_4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		JPanel p = new JPanel();
		
		Button noButton = new Button("No");
		Button yesButton = new Button();
		yesButton = noButton;
		yesButton.setLabel("yes");
		
		System.out.println(noButton.getLabel());
		System.out.println(yesButton.getLabel());
		
		p.add(noButton);
		p.add(yesButton);
		

	}

}
