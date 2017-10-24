package c1;

public class EtiquetaBreak {
	public static void main(String args[]){
		int x=0;
		int y=0;
		fin:
			while(x<10){
				while(y<10){
					System.out.println(x+""+y);
					y++;
					if(y==5)
						break;
					if(x==5 && y==4)
						break fin;
				}
				y=0;
				x++;
			}
	}
}
