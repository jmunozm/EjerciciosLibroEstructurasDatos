/**
 * 
 */
package c2;

/**
 * @author Juan Munoz
 *
 */
public class Sufijo_E2_9 {

	public boolean isSufijo (String str1, String str2){
	
		boolean test=false;
		int len1=str1.length();
		int len2=str2.length();
		  
		if (len1 >= len2){
		  String t="";
		  for (int i=len1-len2; i<len1; i++) 
			  t=t+str1.charAt(i);
		  test = t.equals(str2);
		 } 
		return test;
	}
	
	public static void main(String args[]){
		
		String str1 = "1cadenastring";
		String str2 = "str4ng";
		
		Sufijo_E2_9 s = new Sufijo_E2_9();
		System.out.println(s.isSufijo(str1, str2));
		
	}

}