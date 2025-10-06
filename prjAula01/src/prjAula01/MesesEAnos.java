package prjAula01;

import java.util.Scanner;


public class MesesEAnos {
	public static void main(string[]args) {
		
		
		Scanner ler = new Scanner(System.in);
		
		double dia,mes,ano;
		
		System.out.println("digite o primeiro valor");
		dia = ler.nextDouble();
		
		mes = dia/30;
		
		ano = mes/12;
		
		ano = dia/365;
		
		
	}
	

}
