package prjVetor;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i,a[],b[],c[];
		
		a = new int[TAM];
		b = new int[TAM];
		c = new int[TAM];
		//leitura do vetor a
		for(i=0;i<TAM;i++) {
			System.out.println("coloque o valor" + (1+i) + "° do vetor a");
			a[i] = in.nextInt();
		}
		
		//leitura do vetor b
				for(i=0;i<TAM;i++) {
					System.out.println("coloque o valor" + (1+i) + "° do vetor b");
					b[i] = in.nextInt();
					
					c[i] = a[i]+b[i];
				}
				
				//vetor c
		for(i=0;i<TAM;i++) {
			System.out.print(c[i] + "  ");
		}

	}

}
