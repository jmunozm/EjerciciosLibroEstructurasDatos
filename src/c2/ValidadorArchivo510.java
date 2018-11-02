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
 * 
 * 
 * Ruta archivos:
 * resources\archivos\I0077.B0079EMI.TXS.180306_error
 * resources\archivos\I0077.B0079EMI.TXS.181028_error
 */	
public class ValidadorArchivo510 {
	
	private static final int LONGITUD_LINEA = 510;
	

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
		int numeroLinea = 0;
		int trailer_num_operac = 0;
		int trailer_num_Ventas = 0;
		int [][]totalesOperaciones = new int[2][2]; 
		System.out.println("FILE: " + fileName);
		try {
			fileIn = new Scanner(new FileReader(fileName));
			int registrosTotalVentas = 0;
			int registrosTotalOperaciones = 0;
			
			while(fileIn.hasNextLine()){
				
				String onLine = fileIn.nextLine();
				numeroLinea++;
				
				//Validar longitud de linea
				validarLoingitudLinea(onLine, numeroLinea); 
				//valida caracteres de la linea (caracteres invalidos) true OK, false BAD
				if(!validaCaracteresLinea(onLine, numeroLinea)){
					continue;
				}
				
				/*Valores del header*/
				if(onLine.substring(0,9).trim().equalsIgnoreCase("HEADER")){
					continue;
				}
				
				if(onLine.substring(0,7).trim().equalsIgnoreCase("TRAILER")){
					//System.out.println(onLine.substring(17,24));
					trailer_num_operac = new Integer(onLine.substring(8, 16)).intValue();
					trailer_num_Ventas = new Integer(onLine.substring(17, 23)).intValue();
					totalesOperaciones[0][0] = trailer_num_operac; //total operaciones
					totalesOperaciones[1][0] = trailer_num_Ventas; //total ventas
					
					continue;
				}
				
				if(onLine.length()==LONGITUD_LINEA){
					if(!onLine.substring(479, 481).equalsIgnoreCase("  ")){
						if(onLine.substring(46, 48).equalsIgnoreCase("01") || onLine.substring(46, 48).equalsIgnoreCase("18") || onLine.substring(46, 48).equalsIgnoreCase("26")){
							registrosTotalVentas++;	
						}
						registrosTotalOperaciones++;
						//System.out.println(onLine.substring(47, 49));
					}
				}
				//System.out.println(onLine);
			}
//			System.out.println("totalVentas: "+totalVentas);
//			System.out.println("num_Operac: " + num_Operac);
			totalesOperaciones[0][1]=registrosTotalOperaciones;
			totalesOperaciones[1][1]=registrosTotalVentas;
//			System.out.println("totalVentas: "+totalesOperaciones[1][0]);
//			System.out.println("totalVentas: "+totalesOperaciones[1][1]);
			System.out.println(validaTotalOperaciones(totalesOperaciones));
			
		} catch(IOException e) {
			System.out.println(e);
		}finally {
			if(fileIn != null)
				fileIn.close();
		}
	}
	
	public static String validaTotalOperaciones(int [][] totalesOperaciones){
		String error = "";
		if(totalesOperaciones[0][0]!=totalesOperaciones[0][1]){
			error = "Número de registros de detalle incorrecto (err007) \n";
			error += "TOTAL OPERACIONES TRILER : "+totalesOperaciones[0][0] +"\n";
			error += "TOTAL OPERACIONES Conteo : "+totalesOperaciones[0][1];
			return error;
		}
		
		if(totalesOperaciones[1][0]!=totalesOperaciones[1][1]){
			error = "Número de operaciones de venta incorrecto (err008) \n";
			error += "TOTAL Ventas TRILER : "+totalesOperaciones[1][0] +"\n";
			error += "TOTAL Ventas Conteo : "+totalesOperaciones[1][1];
			return error;
		}
		
		return error;
	}
	
	public static boolean validaCaracteresLinea(String linea, int numeroLinea){
		boolean valida = true;
		int valorCaracter = 0;
		String errores = "";
		for(int i = 0; i<linea.length(); i++){
			valorCaracter = (int)linea.charAt(i);
			if(valorCaracter<32 || valorCaracter>126){
				//System.out.println("Linea con error: " + numeroLinea + " Caracter: " + linea.charAt(i) + " Valor: " + (int)linea.charAt(i));
				errores += "\nCaracter: " + linea.charAt(i) + " Valor: " + (int)linea.charAt(i);
				valida = false;
			}
		}
		
		if(!valida){
			System.out.println("Linea :" + numeroLinea +  errores);
		}
		
		return valida;
	}
	
	public static void validarLoingitudLinea(String linea, int numeroLinea){
		/*Validar longitud de la linea*/
		if(linea.length()>LONGITUD_LINEA){
			System.out.println("Linea "+ numeroLinea +" con longitud mayor (" + linea.length() +" caracteres )");
		}
		if(linea.length()<LONGITUD_LINEA){
			System.out.println("Linea "+ numeroLinea +" con longitud menor (" + linea.length() +" caracteres )");
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


