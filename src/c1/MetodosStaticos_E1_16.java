/**
 * 
 */
package c1;

/**
 * @author Juan Munoz
 * Metodo devuelve el numero mayor de cuatro enteros, y
 * otro que devuelve el numero mayor de 5 enteros
 */
public class MetodosStaticos_E1_16 {
	
	public static final int NUMERO_MAXIMO = 50;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*NUMERO_MAXIMO)+1; 
		int num2 = (int)(Math.random()*NUMERO_MAXIMO)+1;
		int num3 = (int)(Math.random()*NUMERO_MAXIMO)+1;
		int num4 = (int)(Math.random()*NUMERO_MAXIMO)+1;
		int num5 = (int)(Math.random()*NUMERO_MAXIMO)+1;
	
//		int m = numeroMayor(num1, num2, num3, num4);
//		
//		while(m>num5){
//			num5 = (int)(Math.random()*NUMERO_MAXIMO)+1;
//		}
		
		
		
		System.out.println(num1+", " +	num2+", " +	num3+", " +	num4+"");
		System.out.println("NumeroMayor: " + numeroMayor(num1, num2, num3, num4));
		
		num1 = (int)(Math.random()*NUMERO_MAXIMO)+1; 
		num2 = (int)(Math.random()*NUMERO_MAXIMO)+1;
		num3 = (int)(Math.random()*NUMERO_MAXIMO)+1;
		num4 = (int)(Math.random()*NUMERO_MAXIMO)+1;
		num5 = (int)(Math.random()*NUMERO_MAXIMO)+1;
		
		System.out.println(num1+", " +	num2+", " +	num3+", " +	num4  +", "+ num5);
		System.out.println("NumeroMayor: " + numeroMayor(num1, num2, num3, num4, num5));
	}
	
	public static int numeroMayor(int num1, int num2){
		if(num1 > num2){
			return num1;
		}else{
			return num2;
		}
	}
	
	public static int numeroMayor(int num1, int num2, int num3, int num4){
		if(numeroMayor(num1, num2)>numeroMayor(num3, num4)){
			return numeroMayor(num1, num2);
		}else{
			return numeroMayor(num3, num4);
		}
	}
	
	public static int numeroMayor(int num1, int num2, int num3, int num4, int num5){
		if(numeroMayor(num1, num2, num3, num4)>num5){
			return numeroMayor(num1, num2, num3, num4);
		}else{
			return num5;
		}
	}

}
