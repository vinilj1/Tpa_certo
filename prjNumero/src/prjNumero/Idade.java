package prjNumero;

import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int idade, i = 1;
	  while(i<=5) {
		  System.out.println("coloque a idade");
		  idade = in.nextInt();
        	if(idade >=18) {
        		System.out.println("voc� � maior de idade");
        	}else {
        		System.out.println("voc� � menor de idade");
        	}
        	i++;
        }
	}

}
