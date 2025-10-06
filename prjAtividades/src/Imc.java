import java.util.Scanner;
public class Imc {
  public static void main(String[]args) {
	  Scanner in = new Scanner(System.in);
	  double peso,h,imc;
	  System.out.println("coloque o peso");
	  peso = in.nextDouble();
	  System.out.println("coloque a altura");
	  h = in.nextDouble();
	  imc = peso/(h*h);
	  System.out.println(imc);
	  if(imc<18.5) {
		  System.out.println("exesso de mageza");
	  }else if(imc<25) {
		  System.out.println("peso normal");
	  }else if(imc<30) {
		  System.out.println("exesso de peso");
	  }else if(imc<35) {
		  System.out.println("obsidade (grau 1)");
	  }else if(imc<40) {
		  System.out.println("obsidade (grau 2)");
	  }else {
		  System.out.println("obsidade (grau 3)");
	  }
	  in.close();
  }
}
