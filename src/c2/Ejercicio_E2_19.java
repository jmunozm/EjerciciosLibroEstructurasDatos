package c2;

/**
 * @author Juan Munoz
 *
 */
public class Ejercicio_E2_19 {
	
	public static void main(String args[]){
		int [ ][ ] c = { { 0, 2 ,0 }, {3,4,5,1,1,1}, { 1,0,1,2,3,2,1,1,2,3,2,1 } , {1,4,1,4,3,1},  {1,4,1,4,3}};
		imprimirArreglo(c);
		System.out.println();
		imprimirArreglo(cantidadDeNumeroPorFila(c));
		System.out.println();
		System.out.println("Fila con mas unos: " + rowWithMostOnes(c));
	}
	
	public static int[] cantidadDeNumeroPorFila(int [][] arr){
		int contadorUnos = 0;
		int arrayCantidadUnos[] = new int [arr.length]; 
		for(int i = 0; i<arr.length; i++){
			contadorUnos = 0;
			for(int j = 0; j<arr[i].length; j++){
				if(arr[i][j]==1){
					contadorUnos++;
				}
				arrayCantidadUnos[i] = contadorUnos;
			}
		}
		return arrayCantidadUnos;
	}
	
	public static void imprimirArreglo(int [] arr){
		for(int i = 0; i<arr.length; i++){
			System.out.println(i + ": " + arr[i]);
		}
	}
	
	public static void imprimirArreglo(int [][] arr){
		for(int i = 0; i<arr.length; i++){
			System.out.print(i + ":");
			for(int j = 0; j<arr[i].length; j++){
				System.out.print(" "+arr[i][j]);
			}
			System.out.println();
		}
	}
	
	public static int rowWithMostOnes(int [][] arr){
		int contadorUnos = 0;
		int filaConMasUnos = 0;
		int cantidadMaximaUnos = 0;
		for(int i = 0; i<arr.length; i++){
			contadorUnos = 0;
			for(int j = 0; j<arr[i].length; j++){
				if(arr[i][j]==1)
					contadorUnos++;
			}
			if(contadorUnos>cantidadMaximaUnos){
				filaConMasUnos = i;
				cantidadMaximaUnos = contadorUnos;
			}
		}
		return filaConMasUnos;
	}
}
