package prjVetor;

import java.util.Scanner;

public class Primo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int a[],i,j,cont;
        a = new int[TAM];

        System.out.println("coloque os 10 valores de a");
        for (i = 0; i < TAM; i++) {
            a[i] = in.nextInt();
        }

        System.out.println("Os números primos são:");
        for (i = 0; i < TAM; i++) {
            cont = 0; 
            for (j = 1; j <= a[i]; j++) {
                if (a[i] % j == 0) {
                    cont++;
                }
            }
            if (cont == 2) { 
                System.out.println(a[i]);
            }
        }
    }
}

