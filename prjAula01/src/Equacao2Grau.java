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
		   System.out.println("essa equa��o n�o tem raizes reais");
	   }else if(delta == 0){
		   System.out.println("s� existe uma ra�z para essa equa��o");
	   }else if(delta>0) {
		   System.out.println("existem duas raizes para essa equa��o");
	   }
   }
}
