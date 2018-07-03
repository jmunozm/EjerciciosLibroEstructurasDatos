/**
 * 
 */
package c2;

import java.util.Scanner;

/**
 * @author Juan Munoz
 * Ejercicio de la figura 2.11
 * Ejemplo de manejo de exepciones.
 */	
public class DivideByTwo_2_11
{
    public static void main( String [ ] args )
    {
        Scanner in = new Scanner( System.in );
        int x;

        System.out.println( "Introducir entero: " );
        try{
            String oneLine = in.nextLine( );
            x = Integer.parseInt( oneLine );
            System.out.println( "La mitad de x es: " + ( x / 2 ) );
        }
        catch( NumberFormatException e ){ 
        	System.out.println( e );
    	}
    }
}
