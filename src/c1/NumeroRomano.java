/**
 * 
 */
package c1;

/**
 * @author Juan
 * 
 * 
 */
public class NumeroRomano {
	
	private static final int I = 1;
	private static final int V = 5;
	private static final int X = 10;
	private static final int L = 50;
	private static final int C = 100;
	private static final int D = 500;
	private static final int M = 1000;
	
	private String numeroRomano;
	private String guionAlto;
	
	
	public String convertirNumero(int numero){
		
		//adaptar para los guiones dobles y para cambiar todas las variables int por long para abarcar mas rango
		
		numeroRomano = new String();
		guionAlto = new String();
		SeparacionNumeros n = new SeparacionNumeros();
		n.separarNumero(numero);
		int miles = n.getMiles();
		int centenas = n.getCentenas();
		int decenas = n.getDecenas();
		int unidades = n.getUnidades();
		
		if(miles>=10) {
			convertirNumero(miles);
			guionAlto = "";
			for(int i = 0; i<numeroRomano.length(); i++) {
				guionAlto= guionAlto + "_";
			}
		}
		
		if(miles>0 && miles<=9) {
			if (miles == 9) {
				guionAlto= guionAlto + "__";
				numeroRomano = numeroRomano + "IX";
			} else if (miles >= 5) {
				guionAlto= guionAlto + "_";
				numeroRomano = numeroRomano + "V";
				for (int i = 6; i <= miles; i++) {
					guionAlto= guionAlto + "_";
					numeroRomano = numeroRomano + "I";
				}
			} else if (miles == 4) {
				guionAlto= guionAlto + "__";
				numeroRomano = numeroRomano + "IV";
			} else {
				for (int i = 1; i <= miles; i++) {
					numeroRomano = numeroRomano + "M";
				}
			}
		}
		
		if(centenas>0) {
			if (centenas == 9) {
				numeroRomano = numeroRomano + "CM";
			} else if (centenas >= 5) {
				numeroRomano = numeroRomano + "D";
				for (int i = 6; i <= centenas; i++) {
					numeroRomano = numeroRomano + "C";
				}
			} else if (centenas == 4) {
				numeroRomano = numeroRomano + "CD";
			} else {
				for (int i = 1; i <= centenas; i++) {
					numeroRomano = numeroRomano + "C";
				}
			}
		}
		
		if(decenas>0) {
			if (decenas == 9) {
				numeroRomano = numeroRomano + "XC";
			} else if (decenas >= 5) {
				numeroRomano = numeroRomano + "L";
				for (int i = 6; i <= decenas; i++) {
					numeroRomano = numeroRomano + "X";
				}
			} else if (decenas == 4) {
				numeroRomano = numeroRomano + "XL";
			} else {
				for (int i = 1; i <= decenas; i++) {
					numeroRomano = numeroRomano + "X";
				}
			}
		}
		
		if(unidades>0) {
			if (unidades == 9) {
				numeroRomano = numeroRomano + "IX";
			} else if (unidades >= 5) {
				numeroRomano = numeroRomano + "V";
				for (int i = 6; i <= unidades; i++) {
					numeroRomano = numeroRomano + "I";
				}
			} else if (unidades == 4) {
				numeroRomano = numeroRomano + "IV";
			} else {
				for (int i = 1; i <= unidades; i++) {
					numeroRomano = numeroRomano + "I";
				}
			}
		}		
		return numeroRomano;
	}


	public static void main(String[] args) {
		NumeroRomano nr = new NumeroRomano();
//		System.out.println(nr.convertirNumero(2));
		String numeroRomano = new String();
		for(int i = 5804; i<=5804; i++) {
			numeroRomano = nr.convertirNumero(i)+ "->" +i;
			System.out.println(nr.getGuionAlto());
			System.out.println(numeroRomano);
		}
	}

	public String getResultado() {
		return numeroRomano;
	}

	public String getGuionAlto() {
		int longitudNumero = numeroRomano.length();
		int longitudGuion = guionAlto.length();
		for(int i = 1; i<=longitudNumero - longitudGuion;i++) {
			guionAlto+="_";
		}
		return guionAlto;
	}
}
