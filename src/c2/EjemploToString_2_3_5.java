package c2;

/**
 * @author Juan Munoz
 *
 */
public class EjemploToString_2_3_5 {
	
	public static void main(String args[]){
		System.out.println("55 in base 2: " + Integer.toString(55,2));
		
		String c = "";
		c = Integer.toString(45);
		System.out.println(c);
		
		c = Double.toString(45.5);
		System.out.println(c);
		
		c=Float.toString(45.53f);
		System.out.println(c);
		
		int x = Integer.parseInt("75");
		double y = Double.parseDouble("75.5");
		System.out.println(x);
		System.out.println(y);
	}
}
