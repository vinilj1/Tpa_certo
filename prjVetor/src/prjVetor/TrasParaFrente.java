package prjVetor;

import java.util.Scanner;

public class TrasParaFrente {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    final int TAM = 10;
    	int i,a[],b[];
	
	    a = new int[TAM];
	    b = new int[TAM];
	    
	    for(i=0;i<TAM;i++) {
	    	System.out.println("coloque o " + (1+i) + "° valor de a");
	    	a[i] = in.nextInt(); 
	    }
	    System.out.print("os valores de b são ");
	    for(i = TAM - 1; i >= 0; i--) {
	    	b[i] = a[i];
	    	System.out.print(b[i] + "   ");
	    }

	}

}
