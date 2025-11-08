package prjVetor;

import java.util.Scanner;

public class Somatorio {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i,a[],b[],j;
		a = new int[TAM];
		b = new int[TAM];
		
		for(i=0;i<TAM;i++) {
			System.out.println("insira o " + (1+i) + "° primeiro valor de A");
			a[i] = in.nextInt();
		}
		
		for(i=0;i<TAM;i++) {
			b[i] = 0; 
			for(j=0;j<=a[i];j++) {
				b[i] += j;
			}
			System.out.println("o " + (1+i) + "° valor de B é");
			System.out.println(b[i]);
			System.out.println("_________________________________________________________");
		}

	}

}
