package prjVetor;

import java.util.Scanner;

public class Divisores {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int TAM = 10;
		int i,a[],j;
		a = new int[TAM];
		
		
		for(i=0;i<TAM;i++) {
			System.out.println("coloque o " + (i+1) + "° valor de a");
			a[i] = in.nextInt();
		}
		
		for (i = 0; i < TAM; i++) {
            System.out.println("Divisores de " + a[i] + ": ");
            for (j = 1; j <= a[i]; j++) { 
                if (a[i] % j == 0) {
                    System.out.println(j + " ");
                }
            }
		
		}
	}

}
