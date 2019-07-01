package c2;

public class Ejercicio_2_19 {
	
	public static void main(String[] args){
		int [ ][ ] c = { { 1, 2 }, { 3, 4, 5 }, { 6 }, {4,3,2,1,2,1,2},{1,1,1,1,2,3,2,1,3}, {4,1,2,3} };
		System.out.println(rowWinMostOnes(c));
	}
	
	public static int rowWinMostOnes(int [][] arr){
		int sumaUnosAnterior = 0;
		int sumaUnosActual = 0;
		int filaMasUnos = 0;
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j<arr[i].length; j++){
				if(arr[i][j]==1){
					sumaUnosActual++;
				}
			}
			if(sumaUnosActual>sumaUnosAnterior){
				filaMasUnos = i;
			}
			sumaUnosAnterior = sumaUnosActual;
			sumaUnosActual = 0;
		}
		return filaMasUnos;
	}

}
