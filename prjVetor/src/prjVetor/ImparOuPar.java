package prjVetor;

import java.util.Scanner;

public class ImparOuPar {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 20;
		int i,a[],b[];
		a = new int[TAM];
		b = new int[TAM];
		
		System.out.println("coloque os valores de a");
		for(i=0;i<TAM;i++) {
			a[i] = in.nextInt();
		}
		System.out.println("os valores de b são  ");
	    for(i=0;i<TAM;i++) {
		   if(a[i]%2==0) {
			   b[i] = a[i];
			   System.out.print(b[i] + "   ");
		   }
		}
	    System.out.println("  ");
	    System.out.println("os valores de a são  ");
	    for(i=0;i<TAM;i++) {
		    if(a[i]%2!=0) {
			    System.out.print(a[i] + "  ");
		    }
	    }

	}

}
