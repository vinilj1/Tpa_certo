import java.util.Scanner;
public class GasolinaPorKm {
   public static void main(String[]args) {
	   Scanner in = new Scanner(System.in); 
	    //declara��o de var�avel
	   double km,l,gasto;
	   System.out.println("coloque a dist�ncia percorrida em km");
	   km = in.nextDouble();
	   System.out.println("coloque a capacidade total do tanque em litros");
	   l = in.nextDouble();
	   gasto = km/l;
	   System.out.println(gasto);
	   if(gasto>=10) {
		   System.out.println("seu carro n�o � economico");
	   }else {
		   System.out.println("seu carro � economico");
	   }
   }
}
