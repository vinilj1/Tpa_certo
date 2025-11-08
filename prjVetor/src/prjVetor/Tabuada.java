package prjVetor;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final int TAM = 5;
        
        int mult,i,j,a[];
         
        a = new int[TAM];
        
        System.out.println("Digite " + TAM + " números:");
        for ( i = 0; i < TAM; i++) {
            a[i] = in.nextInt();
        }

        for ( i = 0; i < TAM; i++) {
            System.out.println("Tabuada do " + a[i] + ":");
            for ( j = 0; j <= 10; j++) {
                mult = a[i] * j;
                System.out.println(a[i] + " x " + j + " = " + mult);
            }
        }
    }
}
