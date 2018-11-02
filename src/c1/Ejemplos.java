package c1;

public class Ejemplos {
	public static void main(String args[]){
		for(int i = 1; i<=100; i++){
			if(i%10==0)
				continue;
			System.out.println(i);
		}
		System.out.println("55 in base 2: " + Integer.toString(55,2)); //Imprime la representación binaria de 55
	}
}
