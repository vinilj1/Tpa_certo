import java.util.Scanner;
public class Triangulo {
  public static void main(String[]args) {
	  Scanner in = new Scanner(System.in);
	  double a,b,c,triangulo;
	  System.out.println("ecreva o primeiro valor");
	  a = in.nextDouble();
	  System.out.println("escreva o segundo valor");
	  b = in.nextDouble();
	  System.out.println("escreva o terceiro valor");
	  c = in.nextDouble();
	  triangulo = a + b + c;
	  System.out.println(triangulo);
	  if(a+b>c){
		  System.out.println(" é um triângulo");
	  }
	  if(a==b&&b==c){
		  System.out.println("triângulo equilatero");
	  }else if (a!=b&&b!=c&&a!=c) {
		  System.out.println("triâgulo escaleno");
	  }else if(a==b&&b!=c) {
		  System.out.println("triâgulo isoceles");
	  }
	  in.close();
  }
}
