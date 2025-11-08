package prjVetor;

import java.util.Scanner;

public class BFatorialDeA {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 15;
        int i, j, a[], b[],f;;
        a = new int[TAM];
        b = new int[TAM];
        
        for (i = 0; i < TAM; i++) {
            System.out.println("Coloque o " + (i + 1) + "° valor de A:");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {  
        	f = 1;
            for (j = 1; j <= a[i]; j++) {
                f *= j;
            }
            b[i] = f;
            System.out.println("Fatorial de " + a[i] + " = " + b[i]);
            System.out.println("________________________________________________________");
        }
    }
}
