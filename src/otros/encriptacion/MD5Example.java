package otros.encriptacion;

import java.security.MessageDigest;

import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.MessageDigestAlgorithms;

/**
 * Ejemplo para extraer MD5 de una cadena de texto. Como los bytes obtenidos no
 * son legibles, los escribimos en hexadecimal y codificado base 64
 * con ayuda de la librer�a apache commons-codec.
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

	      // Se escribe codificado base 64. Se necesita la librer�a
	      // commons-codec-x.x.x.jar de Apache
	      byte[] encoded = Base64.encodeBase64(digest);
	      System.out.println(new String(encoded));
	   }
}

/*Se obtiene un MessageDigest con MessageDigest.getInstance() indicando que algortimo de encriptaci�n queremos (el par�metro MessageDigestAlgorithms.MD5).
Convertimos a bytes nuestro texto, en este caso "texto a cifrar".getBytes(), y se lo pasamos a MessageDigest con el m�todo update().
Ahora basta con pedirle el texto encriptado con el m�todo digest(). Nos lo devolver� como un array de bytes.
Como los bytes obtenidos pueden no ser legibles si los ponemos como caracteres en la pantalla, detr�s de este c�digo simplemente hemos puesto dos formas de sacar la clave encriptada por pantalla de una forma legible:
Como n�meros hexadecimales, uno detr�s de otro, que dar�a algo como 2fea7da4a3b790e7b3c7efd639fdc4
Codificado base 64, con la ayuda de la librer�a Apache commons-codec-1.8.jar en nuestro ejemplo, que dar�a algo como Av4KfaSjt5Dns8fv1jn9xA==
Este tipo de transformaciones para visualizaci�n evitan tambien, en caso de almacenarlos en fichero o base de datos, los problemas t�picos de codificaci�n de caracteres.
De aqu� puedes bajarte la librer�a commons-codec. Y aqu� tienes el c�digo del ejemplo MD5Example.java

*http://chuwiki.chuidiang.org/index.php?title=Encriptacion_con_Java
*
*/




