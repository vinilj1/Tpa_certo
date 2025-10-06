package prjNumero;

import java.util.Scanner;

public class SomaNumero {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int s=0,i=1;
        while(i<=100) {
        	s=s+1;
        	System.out.println(s);
        	i++;
        }
        System.out.println(s);
	}

}
