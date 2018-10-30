package c2;

import java.util.Random;

/**
 * @author Juan Munoz
 *
 */
public class Ejercicio_E2_12 {
	
	public static final int TAMANO_MAXIMO_ARREGLO = 10;
	public static final int VALOR_MAXIMO_RANDOM = 10;
	public static final int NUMERO_ARREGLOS = 1;
	
	public static void main(String[] args) {
		System.out.println("Arreglos tamaño randoom valores randoom");

		double [] arreglo1;
		
		for(int i = 1; i<=NUMERO_ARREGLOS; i++){
			arreglo1 = new double[valorRandoom(TAMANO_MAXIMO_ARREGLO)];
			arreglo1 = asignarValores(arreglo1);
			
			//Para pruebas
			arreglo1 = new double[13]; //1, 1, 1, 4, 4, 5, 5, 5, 7, 8, 9, 9, 9
			arreglo1[0] = 1;
			arreglo1[1] = 1;
			arreglo1[2] = 1;
			arreglo1[3] = 4;
			arreglo1[4] = 4;
			arreglo1[5] = 5;
			arreglo1[6] = 5;
			arreglo1[7] = 5;
			arreglo1[8] = 7;
			arreglo1[9] = 8;
			arreglo1[10] = 9;
			arreglo1[11] = 9;
			arreglo1[12] = 9;
			imprimirArreglo(arreglo1);
			System.out.println("SUM: " + sum(arreglo1));
			System.out.println("MEDIA: " + average(arreglo1));
			System.out.println("MODA: " + mode(arreglo1));
			System.out.println();
		}
	}
	
	public static double mode(double [] arr){
		double arrModa [] = new double[arr.length];
		double [][]matriz = new double[arr.length][2];
		boolean guarda = true;
		for(int i = 0; i<arr.length; i++){
			guarda = true;
			for(int j = 0; j<matriz.length; j++){
				if(matriz[j][0]==arr[i]){
					matriz[j][1]++;
					guarda = false;
					break;
				}
			}
			if(guarda){
				matriz[i][0] = arr[i];
				matriz[i][1]++;	
			}
		}
		
		ordenarMatriz(matriz);
		
		double max = 0;
		for(int i = 0; i<matriz.length; i++){
			System.out.println(matriz[i][0] +" "+ matriz[i][1]);
			if(matriz[i][1]>max){
				max=matriz[i][1];
				i=0;
			}
		}
		
		
		
		return max;
	}
	
	public static double[][] ordenarMatriz(double [][]matriz){
		
		int pos1 = 0;
		
		for(int i = 0; i<matriz.length; i++) {
			
			if(matriz[i][1] == 0 && pos1 == 0) {
				pos1=i;
			}
			if(matriz[i][1] != 0 && pos1 != 0) {
				matriz[pos1][0]=matriz[i][0];
				matriz[pos1][1]=matriz[i][1];
				matriz[i][0]=0;
				matriz[i][1]=0;
				i = pos1 -1;
				pos1 = 0;
			}
		}
		
		return matriz;
	}
	
	public static double average(double [] arr){
		return sum(arr) / arr.length;
	}
	
	public static double sum(double [] arr){
		double suma = 0.0;
		for (double d : arr) {
			suma+=d;
		}
		return suma;
	}
	
	public static double[] asignarValores(double arreglo[]){
		for(int i = 0; i<arreglo.length; i++){
			//arreglo[i] = valorRandoom(VALOR_MAXIMO_RANDOM);
			arreglo[i] = valorRandoom(VALOR_MAXIMO_RANDOM);
		}
		return arreglo;
	}
	
	public static int valorRandoom(int valorMaximo){
		//Generar los numeros
		Random r = new Random();
		return r.nextInt(valorMaximo)+1;
	}
	
	public static double valorRandoom(){
		//Generar los numeros
		Random r = new Random();
		return r.nextDouble();
	}
	
	public static void imprimirArreglo(int arreglo[]){
		System.out.print("{");
		for(int i = 0; i<arreglo.length; i++){
			System.out.print(arreglo[i]);	
			if(i<arreglo.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}\n");
	}
	
	public static void imprimirArreglo(double arreglo[]){
		System.out.print("{");
		for(int i = 0; i<arreglo.length; i++){
			System.out.print(arreglo[i]);	
			if(i<arreglo.length-1){
				System.out.print(", ");
			}
		}
		System.out.print("}\n");
	}
	
}


