package prjVetor;

import java.util.Scanner;

public class DiferencaConjunto {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int i, j, k = 0, cont;
        int a[] = new int[TAM];
        int b[] = new int[TAM];
        int c[] = new int[TAM];

        for (i = 0; i < TAM; i++) {
            System.out.println("Insira o " + (i + 1) + "° valor de A: ");
            a[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            System.out.println("Insira o " + (i + 1) + "° valor de B: ");
            b[i] = in.nextInt();
        }

        for (i = 0; i < TAM; i++) {
            cont = 0;

            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    cont++;
                }
            }

            if (cont == 0) { 
                c[k] = a[i];
                k++;
            }
        }

        System.out.println("\nDiferença A - B:");
        if (k == 0) {
            System.out.println("Nenhum elemento diferente.");
        } else {
            for (i = 0; i < k; i++) {
                System.out.print(c[i] + " ");
            }
        }

    }
}