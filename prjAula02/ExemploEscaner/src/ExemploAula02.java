import java.util.Scaner;
public class ExemploAula02 {
	public static void main(string[]args) {
		
		//scaner estrutura pronta do java que permite digitarmos valores
		Scaner ler = new Scaner(System.in);
		
		int valor1,valor2,soma;
		
		System.out.println("digite o primeiro n�mero");
		valor1 = ler.nextInt();
		
		System.out.println("digite o segundo n�mero");
		valor2 = ler.nextInt();
		
		soma = valor1 + valor2;
				
	    System.out.println("total =" + soma );
	}//fim do m�todo  main

}//fim do projeto
