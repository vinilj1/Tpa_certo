package prjVetor;

import java.util.Scanner;

public class Quadrado {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i,a[],b[];
		
		a = new int[TAM];
		b = new int[TAM];
		
		//leitura do vetor a
		for(i=0;i<TAM;i++) {
			System.out.println("entre com o " + (1+i) + "° valor de A");
			a[i] = in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			b[i] = a[i]*a[i];
			System.out.println(b[i]);
		}

	}

}
