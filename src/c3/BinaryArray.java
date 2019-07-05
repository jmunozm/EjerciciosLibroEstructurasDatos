/**
 * 
 */
package c3;

/**
 * @author Juan Munoz
 *
 */
public class BinaryArray {
	
	private boolean datos[];
	
	public BinaryArray(String string) {
		if(!stringValido(string))
			throw new IllegalArgumentException("Caracter ilegal");
		
		datos = new boolean[string.length()];
		for(int i = 0; i<string.length(); i++)
			if(string.charAt(i)=='F' || string.charAt(i) == 'f')
				datos[i] = false;
			else
				datos[i] = true;
	}
	
	public boolean[] getDatos() {
		return datos;
	}

	public void setDatos(boolean[] datos) {
		this.datos = datos;
	}
	
	public boolean stringValido(String string) {
		char listCaracteres[] = string.toCharArray();
		for (char c : listCaracteres) {
			if(! (c == 'F' || c == 'f' || c == 'T' || c == 't'))
				return false;
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinaryArray binaryArray = new BinaryArray("TFTTFffftt");
		boolean datos[] = binaryArray.getDatos();
		for(int i = 0; i < datos.length; i++)
			System.out.println(datos[i]);
	}

}
