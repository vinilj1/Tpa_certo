import java.util.Scanner;
public class Ordem {
  public static void main(String[]args) {
	  Scanner in = new Scanner(System.in);
	  //declara��o
	  int a,b,c;
	  //leitura
	  System.out.println("coloque o primeiro n�mero");
	  a = in.nextInt();
	  System.out.println("coloque o segundo n�mero");
	  b = in.nextInt();
	  System.out.println("coloque o terceiro n�mero");
	  c = in.nextInt();
	  //escolha
	  if(a>b&&b>c) {
		  System.out.println(c);
		  System.out.println(b);
		  System.out.println(a);
	  }else if(b>a&&a>c) {
		  System.out.println(c);
		  System.out.println(a);
		  System.out.println(b);
	  }else if(c>b&&b>a) {
		  System.out.println(a);
		  System.out.println(b);
		  System.out.println(c);
	  }else if(a>c&&c>b) {
		  System.out.println(b);
		  System.out.println(c);
		  System.out.println(a);
	  }else if(c>a&&a>b) {
		  System.out.println(b);
		  System.out.println(a);
		  System.out.println(c);
	  }else {
		  System.out.println(a);
		  System.out.println(c);
		  System.out.println(b);
	  }
	  in.close();
  }
}
