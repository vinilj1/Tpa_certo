import java.util.Scanner;
public class bhaskara {
   public static void main(String[]args) {
	   Scanner in = new Scanner(System.in);
	   //declaração
	   double a,b,c,x1,x2,delta;
	   //leitura
	   System.out.println("coloque o primeiro valor");
	   a = in.nextDouble();
	   System.out.println("coloque o segundo valor");
	   b = in.nextDouble();
	   System.out.println("coloque o terceiro valor");
	   c = in.nextDouble();
	   //processamento
	   delta = (b*b)-4*a*c;
	   //escolha
	   if(delta<0) {
		   System.out.println("não tem raízes");
	   }else if(delta==0) {
		   System.out.println("tem uma raíz");
	   }else {
		   System.out.println("tem duas raízes");
	   }
	   //processamento2
	   x1 = -b+Math.sqrt(delta)/(2*a);
	   x2 = -b-Math.sqrt(delta)/(2*a);
	   System.out.println(x1);
	   System.out.println(x2);
	   in.close();
   }
}
