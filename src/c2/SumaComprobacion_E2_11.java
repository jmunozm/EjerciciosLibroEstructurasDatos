/**
 * 
 */
package c2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

/**
 * @author Juan Munoz
 *
 */
public class SumaComprobacion_E2_11 {

	/**
	 * @param args
	 * 
	 */
	public static void main(String[] args) {
		String texto = "Texto prueba";
		int suma = 0;
		
		for (int i = 0; i < texto.length(); i++) {
			suma+= (int)texto.charAt(i);
		}
		System.out.println("Texto: " + texto);
		System.out.println("Suma: " + suma);
		
		System.out.println();
		
		int sumaArchivo1 = sumaComprobacion("resources/archivos/I0077.B0079EMI.TXS.160327");
		int sumaArchivo2 = sumaComprobacion("resources/archivos/I0077.B0079EMI.TXS - copia.160327");
		
		System.out.println("Suma archivo 1: " + sumaArchivo1);
		System.out.println("Suma archivo 2: " + sumaArchivo2);
		
		if(sumaArchivo1==sumaArchivo2){
			System.out.println("Archivos iguales");
		}else{
			System.out.println("Archivos diferentes");
		}
	}
	
	public static int sumaComprobacion(String ruta){
		
		int suma = 0;
		File archivo = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			archivo = new File (ruta);
		    fr = new FileReader (archivo);
		    br = new BufferedReader(fr);
		    
		    String linea = ""; 
			
			int numeroLinea = 0;
			int numeroCaracter = 0;
			
		    if(archivo.exists()){
		    	while((linea=br.readLine())!=null){
		    		numeroLinea++;
		    		numeroCaracter = 0;
		    		for (int i = 0; i < linea.length(); i++) {
		    			numeroCaracter++;
		    			suma+= (int)linea.charAt(i);
		    			/*if(suma>=2147483647 || suma<=0){
		    				System.out.println("DESBORDAMIENTO: ");
		    				System.out.println("Linea:" + numeroLinea );
		    				System.out.println("Suma:" + suma );
		    				System.out.println("NumeroCaracter:" + numeroCaracter );
		    				System.out.println("Caracter: " + linea.charAt(i));
		    				System.out.println("valor: " + (int)linea.charAt(i));
		    				System.out.println("SumaAnterior:" + (suma -(int)linea.charAt(i)) );
		    				break;
		    			}*/
		    		}
		    	}
		    	
		    }
		    
		   
		} catch(Exception e){
			e.printStackTrace();
		}finally{
			// En el finally cerramos el fichero, para asegurarnos
			// que se cierra tanto si todo va bien como si salta 
			// una excepcion.
			try{                    
				if( null != fr ){   
					fr.close();     
				}                  
			}catch (Exception e2){ 
				e2.printStackTrace();
			}
		}
		
		return suma;

	}

}
