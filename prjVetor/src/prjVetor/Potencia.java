package prjVetor;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 11;
		int i, a[];
		a = new int[TAM];
		
		
		for(i=0;i<TAM;i++) {
			
			a[i] = (int) Math.pow(2,i);
		}
		
		System.out.println("Vetor A (2^i):");
		System.out.println("os valores de a são");
		for(i=0;i<TAM;i++) {
			System.out.println("A[" + i + "] = " + a[i]);
			
			System.out.println(a[i]);
			System.out.println("____________________________________________________________________________");
		}

	}

}
