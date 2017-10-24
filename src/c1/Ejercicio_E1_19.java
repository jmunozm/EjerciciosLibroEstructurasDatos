/**
 * 
 */
package c1;

/**
 * @author Juan Muñoz
 *
 */
public class Ejercicio_E1_19 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		imprimeCaracteres(100000, 1000);
	}
	
	public static void imprimeCaracteres(int cantidadNumeros, int longitudLinea){
		
		boolean validaBln = true;
		
		if(longitudLinea<3){
			validaBln = false;
			System.out.println("La longitud debe ser por lo menos 3 caracteres");
		}
		
		if(longitudLinea < new Integer(new Integer(cantidadNumeros).toString().length()).intValue()+2){
			validaBln = false;
			System.out.println("La longitud debe ser por lo menos de caracteres " + (((Integer)new Integer(cantidadNumeros).toString().length()).intValue()+2));
		}
		
		if(validaBln){
			//calcular numeros por linea
			String cadena = "";
			String linea = "";
			String strNumero = "";
			for(int i = 1; i<=cantidadNumeros;i++){
				if(i==9999){
					validaBln=true;
				}
				strNumero = "["+new Integer(i).toString()+"]";
				linea +=strNumero;
				if(linea.length()<=longitudLinea){
					cadena +=strNumero;
				}else{
					cadena+="\n" + (strNumero.length()<=longitudLinea?strNumero:"");
					linea = strNumero;
				}
				if(i%10000==0)
					System.out.println(i/10000);
			}
			System.out.print(cadena);
		}
	}
}
