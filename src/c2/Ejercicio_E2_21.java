/**
 * 
 */
package c2;

import java.util.Random;

/**
 * @author Juan Munoz
 *
 */
public class Ejercicio_E2_21 {
	
	public static final int DIFF_NUMBERS = 100000; 
	public static final int TAMANIO_ARREGLO = 5;
	public static final int FILAS = 4;
	public static final int COLUMNAS = 2;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int arr[][];
		
//		imprimeArreglo(arr);
//		System.out.println(isDecresing(arr));
		
		
		boolean continua = true;
		
		for(int i = 0; i<10000000; i++){
			if(continua){
				arr = generaArreglo();
				if(isDecresing(arr)){
					imprimeArreglo(arr);
					continua = false;
					System.out.println("Intento # : " + i);
				}
			}
		}
				
	}
	
	public static int [][] generaArreglo(){
		int arr[][] = new int [FILAS][COLUMNAS];
		Random r = new Random();
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				arr[i][j] = r.nextInt(DIFF_NUMBERS)+1;
			}
		}
		return arr;
	}
	
	public static boolean isDecresing(int [][] arr){
		boolean valida = true;
		//Recorre filas
		for(int i = 0; i<arr.length; i++){
			if(valida){
				for(int j = 0; j<arr[i].length; j++){
					if(valida){
						if(j+1<arr[i].length){
							if(arr[i][j+1]<arr[i][j]){
								valida = true;
							}else{
								valida = false;
							}	
						}	
					}
				}
			}
		}
		
		if(valida){
			for(int i = 0; i<arr.length; i++){
				if(valida){
					for(int j = 0; j<arr[i].length; j++){
						if(valida){
							if(j+1<arr.length && i+1<arr.length){
								if(arr[j+1][i]<arr[j][i]){
									valida = true;
								}else{
									valida = false;
								}	
							}	
						}
					}
				}
			}
		}
		
		return valida;
	}
	
	public static void imprimeArreglo(int arreglo[][]){
		for(int i = 0; i<arreglo.length; i++){
			for(int j = 0; j<arreglo[i].length; j++){
				System.out.print(arreglo[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
