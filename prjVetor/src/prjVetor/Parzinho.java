package prjVetor;

import java.util.Scanner;

public class Parzinho {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int a[],i,j;
		a = new int[TAM];
		
		
		for(i=0;i<TAM;i++) {
			System.out.println("coloque o " + (i + 1) + "° valor de a");
			a[i] = in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			for(j=0;j<=a[i];j++) {
				System.out.println("("+ a[i] +"," + j + ")");
			}
			System.out.println("-------------------------------------------------------------");
		}
		
		

	}

}
