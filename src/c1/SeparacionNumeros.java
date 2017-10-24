/**
 * 
 */
package c1;

/**
 * @author Juan
 *
 */
public class SeparacionNumeros {

	private int miles;
	private int centenas;
	private int decenas;
	private int unidades;
	
	
	public void separarNumero(int numero) {
		this.miles = numero / 1000;
		this.centenas = numero%1000/100;
		this.decenas = numero%100/10;
		this.unidades = numero%10/1;
	}
	
	
	public static void main(String[] args) {
		SeparacionNumeros numero = new SeparacionNumeros();
		numero.separarNumero(1352);
		System.out.println(numero.getMiles());
		System.out.println(numero.getCentenas());
		System.out.println(numero.getDecenas());
		System.out.println(numero.getUnidades());
	}


	public int getMiles() {
		return miles;
	}


	public int getCentenas() {
		return centenas;
	}


	public int getDecenas() {
		return decenas;
	}


	public int getUnidades() {
		return unidades;
	}
	
}
