package prjAulaFacaEnquanto;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		int i = 1,n,f =1;
		Scanner in = new Scanner(System.in);
		System.out.println("coloque o número");
		n = in.nextInt();
		do {
			f=f*i;
			i++;
		}while(i<=n);
		System.out.println(n+"! ="+f);
		in.close();
	}

}
