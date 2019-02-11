/**
 * 
 */
package c2;

/**
 * @author Juan Munoz
 * Para compilar en linea de comandos se hace de la siguiente manera.
	- compilar javac Echo.java
	- ejecutar java -cp . Echo arg1 arg2 arg3 arg4
	
	*Nota: comentarice la linea (package c2;) para poder compilar y ejecutar desde linea de comandos.
	
 */	

public class Echo{
    public static void main( String [ ] args ){
        for( int i = 0; i < args.length - 1; i++ )
            System.out.print( args[ i ] + " " );
        if( args.length != 0 )
            System.out.println(args[ args.length - 1 ] );
        else
            System.out.println( "No arguments to echo" );
    }
}
