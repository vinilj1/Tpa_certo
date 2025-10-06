package prjNumero;

import java.util.Scanner;

public class Tabuada {

	public static void main(String[] args) {
		//Scanner
		Scanner in = new Scanner(System.in);
		//declaração
      int t,n,i = 1;
      //leitura
      System.out.println("coloque o número");
      n = in.nextInt();
      //laço
      while(i<=10) {
    	  t =n*i;
    	  System.out.println(i + "x" + n + "=" + t);
    	  i++;
      } 
	};
}
