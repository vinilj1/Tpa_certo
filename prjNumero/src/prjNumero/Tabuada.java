package prjNumero;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		//Scanner
		Scanner in = new Scanner(System.in);
		//declara��o
      int t,n,i = 1;
      //leitura
      System.out.println("coloque o n�mero");
      n = in.nextInt();
      //la�o
      while(i<=10) {
    	  t =n*i;
    	  System.out.println(i + "x" + n + "=" + t);
    	  i++;
      } 
	};
}
