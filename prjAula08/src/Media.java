import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		//declaração de variável
		double n1,n2,n3,n4,mi,ex,nm;
		//Scanner
      Scanner in = new Scanner(System.in);
      //leitura
      System.out.println("coloque a primeira nota");
      n1 = in.nextDouble();
      System.out.println("coloque a segunda nota");
      n2 = in.nextDouble();
      System.out.println("coloque a terceira nota");
      n3 = in.nextDouble();
      System.out.println("coloque a quarta nota");
      n4 = in.nextDouble();
      //processamento
      mi = (n1 + n2 + n3 + n4)/4;
      System.out.println(mi);
      //escolha
      if(mi<5) {
    	  System.out.println("reprovado");
      }else if(mi>=7) {
    	  System.out.println("aprovado");
      }else {
    	  System.out.println("exame");
    	  System.out.println("coloque a nota do exame");
    	  ex = in.nextDouble();
    	  nm = (mi + ex)/2;
    	  if(nm>=7) {
    		  System.out.println("aprovado");
    	  }else {
    		  System.out.println("reprovado");
    	  }
      }
      
      in.close();
	}

}
