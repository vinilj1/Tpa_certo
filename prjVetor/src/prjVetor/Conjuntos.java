package prjVetor;

import java.util.Scanner;

public class Conjuntos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 10;
        int i, j, a[], b[], c[], k = 0;
        a = new int[TAM];
        b = new int[TAM];
        c = new int[TAM];
        
        for (i = 0; i < TAM; i++) {
            System.out.println("Insira o " + (i + 1) + "° valor de A:");
            a[i] = in.nextInt();
        }
        
        for (i = 0; i < TAM; i++) {
            System.out.println("Insira o " + (i + 1) + "° valor de B:");
            b[i] = in.nextInt();
        }
        
        for (i = 0; i < TAM; i++) {
            for (j = 0; j < TAM; j++) {
                if (a[i] == b[j]) {
                    c[k] = a[i];
                    k++;
                }
            }
        }

        System.out.println("Os valores em comum entre A e B são:");
        if (k == 0) {
            System.out.println("Nenhum valor em comum.");
        } else {
            for (i = 0; i < k; i++) {
                System.out.print(c[i] + "   ");
            }
        }
    }
}