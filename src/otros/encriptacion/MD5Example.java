package otros.encriptacion;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/**
 * Ejemplo para extraer MD5 de una cadena de texto. Como los bytes obtenidos no
 * son legibles, los escribimos en hexadecimal y codificado base 64
 * con ayuda de la librería apache commons-codec.
 * 
 * @author Chuidiang
 * 
 */
public class MD5Example {
	 public static void main(String[] args) throws Exception {

	      MessageDigest md = MessageDigest.getInstance(MessageDigestAlgorithms.MD5);
	      md.update("texto a cifrar".getBytes());
	      byte[] digest = md.digest();

	      // Se escribe byte a byte en hexadecimal
	      for (byte b : digest) {
	         System.out.print(Integer.toHexString(0xFF & b));
	      }
	      System.out.println();

	      // Se escribe codificado base 64. Se necesita la librería
	      // commons-codec-x.x.x.jar de Apache
	      byte[] encoded = Base64.encodeBase64(digest);
	      System.out.println(new String(encoded));
	   }
}

/*Se obtiene un MessageDigest con MessageDigest.getInstance() indicando que algortimo de encriptación queremos (el parámetro MessageDigestAlgorithms.MD5).
Convertimos a bytes nuestro texto, en este caso "texto a cifrar".getBytes(), y se lo pasamos a MessageDigest con el método update().
Ahora basta con pedirle el texto encriptado con el método digest(). Nos lo devolverá como un array de bytes.
Como los bytes obtenidos pueden no ser legibles si los ponemos como caracteres en la pantalla, detrás de este código simplemente hemos puesto dos formas de sacar la clave encriptada por pantalla de una forma legible:
Como números hexadecimales, uno detrás de otro, que daría algo como 2fea7da4a3b790e7b3c7efd639fdc4
Codificado base 64, con la ayuda de la librería Apache commons-codec-1.8.jar en nuestro ejemplo, que daría algo como Av4KfaSjt5Dns8fv1jn9xA==
Este tipo de transformaciones para visualización evitan tambien, en caso de almacenarlos en fichero o base de datos, los problemas típicos de codificación de caracteres.
De aquí puedes bajarte la librería commons-codec. Y aquí tienes el código del ejemplo MD5Example.java

*http://chuwiki.chuidiang.org/index.php?title=Encriptacion_con_Java
*
*/




