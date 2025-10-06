 import java.util.Scanner;
public class Equacao2Grau {
   public static void main(String[]args) {
	   Scanner in = new Scanner(System.in);
	   //declaração
	   double a,b,c,delta,raiz1,raiz2;
	   
	   System.out.println("coloque o valor a");
	   a = in.nextInt();
	   System.out.println("coloque o valor b");
	   b = in.nextInt();
	   System.out.println("coloque o valor c");
	   c = in.nextInt();
	   //processamento
	   delta = (b*b)-4*a*c;
	   System.out.println(delta);
	   raiz1 = -b + Math.sqrt(delta)/2*a;
	   raiz2 = -b - Math.sqrt(delta)/2*a;
	   System.out.println(raiz1);
	   System.out.println(raiz2);
	   //decição
	   if(delta<0) {
		   System.out.println("essa equação não tem raizes reais");
	   }else if(delta == 0){
		   System.out.println("só existe uma raíz para essa equação");
	   }else if(delta>0) {
		   System.out.println("existem duas raizes para essa equação");
	   }
	   in.close();
   }
}
