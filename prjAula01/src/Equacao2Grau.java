 import java.util.Scanner;
public class Equacao2Grau {
   public static void main(String[]args) {
	   Scanner in = new Scanner(System.in);
	   int a,b,c,delta,bascara;
	   System.out.println("coloque o valor a");
	   a = in.nextInt();
	   System.out.println("coloque o valor b");
	   b = in.nextInt();
	   System.out.println("coloque o valor c");
	   c = in.nextInt();
	   delta = (b*b)-4*a*c;
	   System.out.println(delta);
	   bascara = -b +- (delta/delta)/2*a;
	   System.out.println(bascara);
	   if(delta<0) {
		   System.out.println("essa equação não tem raizes reais");
	   }else if(delta == 0){
		   System.out.println("só existe uma raíz para essa equação");
	   }else if(delta>0) {
		   System.out.println("existem duas raizes para essa equação");
	   }
   }
}
