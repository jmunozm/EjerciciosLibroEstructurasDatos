package c1;

/**
 * @author Juan Munoz
 * Ejercicio 1.16
 */

public class NumerosRomanos {
	
	private int i = 1;
	private int v = 5;
	private int x = 10;
	private int l = 50;
	private int c = 100;
	private int m = 1000;
	
	private String resultado = "";
	
	public static void main(String[] args) {
		NumerosRomanos n = new NumerosRomanos();
//		for(int i =1; i<=90;i++) {
//			n.resultado = "";
//			System.out.println(i+" =>" + n.convertirNumero(i));
//		}
		System.out.println("=>" + n.convertirNumero(80));
	}
	
	public String convertirNumero(int numero){		
		if(numero >= i && numero <v){//1 - 4
			int div = 0;
			int res = numero%v;
			
			if(res==1) {
				resultado += "I";
			}else if(res<=3) {
				for(int i = 1; i<=res; i++) {
					convertirNumero(this.i);
				}
			}
			
			if(v-res == 1){
				convertirNumero(v-res);
				convertirNumero(v);		
			}
			
		}else if(numero >= v && numero <x){ //5 - 9
			int div = numero/x;
			int res = numero%x;
			
			if(numero==v){
				resultado += "V";
			}
			
			if(x-res == 1){
				convertirNumero(x-res);
				convertirNumero(x);				
			}else if(res-v>=1){
				convertirNumero(v);
				for(int i = 1; i<=res-v; i++){
					convertirNumero(this.i);
				}
			}
						
		}else if(numero >= x && numero <l){//10 - 49
			int div = numero/x;
			int res = numero%x;
			
			if(numero==x){
				resultado += "X";
			}else if(div<=3) {
				for(int i = 1; i<=div; i++) {
					convertirNumero(x);
				}
			}else if(l - (div*x)>=10){
				for(int i = 1; i<=(l - (div*x))/x; i++){
					convertirNumero(this.x);
					convertirNumero(this.l);
				}
			}
			
			if(res<=3) {
				for(int i = 1; i<=res; i++) {
					convertirNumero(this.i);
				}
			}else if(res>3){
				convertirNumero(res);
			}
			
		}else if(numero >= l && numero <c){//50-99
			int div = numero/c;
			int res = numero%c;
			
			if(numero==l){
				resultado += "L";
			}else if(c-res == 10){
				convertirNumero(x);
				convertirNumero(c);				
			}else if(res-l>=1 && res -l <10){
				convertirNumero(l);
				convertirNumero(res-l);
			}
		
			
		}else if(numero >= c && numero <m){
			int div = numero/m;
			int res = numero%m;
			
			if(numero==c){
				resultado += "C";
			}
			
		}
		
		return resultado;
	}

}
